<%@page import="com.ssm.core.po.Gongjijintiqujilu" %>
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
                        Gongjijintiqujilu entity = (Gongjijintiqujilu) request.getAttribute("entity");
                    %>
                    <input type="hidden" id="id" name="id" value="${entity.id}"/>
                    <input type="hidden" class="form-control" id="yonghuid" name="yonghuid" value="${entity.yonghuid}">

                    <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="tiqujine">
                                提取金额</label>

                            <input type="text" class="form-control" id="tiqujine" name="tiqujine"
                                   value="${entity.tiqujine}">
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