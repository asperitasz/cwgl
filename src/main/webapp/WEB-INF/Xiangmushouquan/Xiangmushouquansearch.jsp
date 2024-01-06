<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.ssm.core.po.Xiangmushouquan" %>
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
                <form id="form1" action="searchresult.action" method="post" class="templatemo-login-form">
                    <%
                        Xiangmushouquan entity = (Xiangmushouquan) request.getAttribute("entity");
                    %>
                    <input type="hidden" id="id" name="id" value="${entity.id}"/>
                    <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="xiangmumingcheng">
                                项目名称</label>

                            <input type="text" class="form-control" id="xiangmumingcheng" name="xiangmumingcheng"
                                   value="${entity.xiangmumingcheng}" readonly="readonly">
                        </div>
                    </div>
                    <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="kahao">
                                卡号</label>
                            <input type="text" class="form-control" id="kahao" name="kahao" value="${entity.kahao}" readonly="readonly">
                        </div>
                    </div>
                    <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="jine">
                                金额</label>

                            <input type="text" class="form-control" id="jine" name="jine" value="${entity.jine}" readonly="readonly">
                        </div>
                    </div>
                    <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="jine">
                                状态</label>
                            <input type="text" class="form-control" id="zhuangtai" name="zhuangtai"
                                   value="${entity.zhuangtai}" readonly="readonly">
                        </div>
                    </div>
                    <c:if test="${entity.zhuangtai=='待认领'}">
                        <div class="form-group text-right">
                            <input type="submit" value="认领" class="templatemo-blue-button"/>
                        </div>
                    </c:if>
                </form>
            </div>

        </div>
    </div>
</div>

</body>
</html>