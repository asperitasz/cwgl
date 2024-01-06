<%@page import="com.ssm.core.po.Userinfo"%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
   <form id="form1" action="Edit.action" method="post"  class="templatemo-login-form">
    <%
    Userinfo entity = (Userinfo) request.getAttribute("entity");
    %>
<input type="hidden" id="id" name="id" value="${entity.id}"/>

 <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="username">
                                username</label>

<input type="text" class="form-control" id="username" name="username" value="${entity.username}">
                        </div>
                    </div>
 <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="password">
                                password</label>

<input type="text" class="form-control" id="password" name="password" value="${entity.password}">
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