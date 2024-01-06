<%@page import="com.ssm.core.po.Jiaofeixitong" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>list</title>
    <meta name="description" content="">
    <meta name="author" content="templatemo">
    <link href="../css/font-awesome.min.css" rel="stylesheet">
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/templatemo-style.css" rel="stylesheet">
    <script src="../js/jquery-1.11.2.min.js" type="text/javascript"></script>
    <script type="text/javascript">

        $(function () {
            var role = $("#txtRole").val();

            if (role == "3") {
                $("#btnAdd").hide();
            }
            if (role == "2") {
                $("#btnAdd").hide();
                $("#btnEdit").hide();

            }
            $(".form-group").find("input").addClass("form-control");
        });

        function Add() {
            var url = "toEdit.action?id=0";
            window.location.href = url;
        }

        function Update() {
            var icount = getCount();
            if (icount == 0) {
                alert('请选择一条数据进行修改！');
                return;
            }
            if (icount > 1) {
                alert('只能同时修改一条数据！');
                return;
            }
            var url = "toEdit.action?id=" + $("input[type = 'checkbox'][name = 'checkuser']:checked").val();
            window.location.href = url;

        }

        function Delete() {
            var icount = getCount();
            if (icount == 0) {
                alert("请选择要删除的数据！");
                return false;
            } else {
                if (confirm("确定要删除当前选择的 " + icount + " 条数据吗？")) {
                    //执行删除的操作
                    var ids = "";
                    $("input[type='checkbox'][name='checkuser']:checked").each(function () {
                        ids += $(this).val() + ",";
                    });
                    $.post("delete.action", {ids: ids}, function (data) {
                        if (data == "1") {
                            alert("删除成功！");

                        } else {
                            alert("删除失败！");
                        }
                        window.location.reload();
                    });
                } else {
                    return;
                }
            }
        }

        function getCount() {
            return $("input[type='checkbox'][name='checkuser']:checked").length;
        }

        function closedialog() {
            $("#EditDialog").dialog('close');
        }

    </script>
    <style>
        .form-control {
            display: inline;
            width: auto;
        }
    </style>
</head>
<body>
<form runat="server">

    <!-- Left column ---->
    <div class="templatemo-flex-row">
        <!-- Main content -->
        <div class="templatemo-content col-1 light-gray-bg">
            <div class="templatemo-content-container">
                <div class="templatemo-flex-row flex-content-row">
                    <div class="col-1">
                        <div class="panel panel-default margin-10">
                            <div class="panel-heading">
                                <h2 class="text-uppercase">
                                    查询</h2>
                            </div>
                            <div class="panel-body">
                                <div class="templatemo-login-form">
                                    <div class="form-group">
                                        <form action="list.action" method="post">


                                            <span>缴费项目：</span><input type="text" id="jiaofeixiangmu"
                                                                         name="jiaofeixiangmu"
                                                                         value="${entity.jiaofeixiangmu}"/>
                                            <span>用户：</span><input type="text" id="name" name="name"
                                                                     value="${entity.name}"/>
                                            <span>状态：</span><input type="text" id="zhuangtai" name="zhuangtai"
                                                                     value="${entity.zhuangtai}"/>
                                            <input type="submit" id="btnSearch" value="查询"
                                                   class="templatemo-blue-button"/>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="templatemo-content-widget no-padding">
                    <div class="panel panel-default table-responsive">
                        <table id="gvUser" class="table table-striped table-bordered templatemo-user-table"
                               cellpadding="0">
                            <tr>
                                <th>选择</th>
                                <th>缴费项目</th>
                                <th>备注</th>
                                <th>用户</th>
                                <th>缴费金额</th>
                                <th>状态</th>
                                <th>操作</th>
                            </tr>
                            <c:forEach items="${list}" var="item">
                                <tr>
                                    <td><input type="checkbox" name="checkuser" value="${item.id}"/></td>

                                    <td> ${item.jiaofeixiangmu} </td>
                                    <td> ${item.beizhu} </td>
                                    <td> ${item.name} </td>
                                    <td> ${item.jiaofeijine} </td>
                                    <td> ${item.zhuangtai} </td>
                                    <td>
                                        <c:if test="${item.zhuangtai=='待缴费'}"> <a href="jiaofei.action?id=${item.id}">缴费</a></c:if>

                                        <c:if test="${item.zhuangtai=='已缴费'}"> <a href="kaifaqiao.action?id=${item.id}">开发票</a></c:if>
                                    </td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>






