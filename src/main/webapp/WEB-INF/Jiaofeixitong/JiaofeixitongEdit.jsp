<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.ssm.core.po.Jiaofeixitong" %>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
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
    <title>Edit</title>
    <link href="../css/font-awesome.min.css" rel="stylesheet">
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/templatemo-style.css" rel="stylesheet">
</head>
<body>
<!-- Left column -->
<div class="templatemo-flex-row">
    <!-- Main content -->
    <div class="templatemo-content col-1 light-gray-bg">
        <div class="templatemo-content-container">
            <div class="templatemo-content-widget white-bg">
                <form id="form1" action="Edit.action" method="post" class="templatemo-login-form">
                    <%
                        Jiaofeixitong entity = (Jiaofeixitong) request.getAttribute("entity");
                    %>
                    <input type="hidden" id="id" name="id" value="${entity.id}"/>
                    <input type="hidden" class="form-control" id="zhuangtai" name="zhuangtai"
                           value="${entity.zhuangtai}">
                    <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="jiaofeixiangmu">
                                缴费项目</label>
                            <input type="text" class="form-control" id="jiaofeixiangmu" name="jiaofeixiangmu"
                                   value="${entity.jiaofeixiangmu}">
                        </div>
                    </div>
                    <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="beizhu">
                                备注</label>

                            <input type="text" class="form-control" id="beizhu" name="beizhu" value="${entity.beizhu}">
                        </div>
                    </div>
                    <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="yonghuid">
                                用户</label>
                            <select class="form-control" id="yonghuid" name="yonghuid">
                                <c:forEach items="${list}" var="item">
                                    <option value="${item.id}">${item.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="jiaofeijine">
                                缴费金额</label>

                            <input type="text" class="form-control" id="jiaofeijine" name="jiaofeijine"
                                   value="${entity.jiaofeijine}">
                        </div>
                    </div>
                    <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="zhuangtai">
                                状态</label>


                        </div>
                    </div>


                    <div class="form-group text-right">
                        <input type="submit" value="保存" class="templatemo-blue-button"/>
                    </div>
                </form>
            </div>

        </div>
    </div>
</div>

</body>
</html>