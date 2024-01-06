<%@page import="com.ssm.core.po.Yonghu"%>
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
    Yonghu entity = (Yonghu) request.getAttribute("entity");
    %>
<input type="hidden" id="id" name="id" value="${entity.id}"/>

 <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="username">
                                用户名</label>

<input type="text" class="form-control" id="username" name="username" value="${entity.username}">
                        </div>
                    </div>
 <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="password">
                                密码</label>

<input type="text" class="form-control" id="password" name="password" value="${entity.password}">
                        </div>
                    </div>
 <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="name">
                                姓名</label>

<input type="text" class="form-control" id="name" name="name" value="${entity.name}">
                        </div>
                    </div>
 <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="sex">
                                性别</label>

<input type="text" class="form-control" id="sex" name="sex" value="${entity.sex}">
                        </div>
                    </div>
 <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="age">
                                年龄</label>

<input type="text" class="form-control" id="age" name="age" value="${entity.age}">
                        </div>
                    </div>
 <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="jibengongzi">
                                基本工资</label>

<input type="text" class="form-control" id="jibengongzi" name="jibengongzi" value="${entity.jibengongzi}">
                        </div>
                    </div>
 <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="gongjijingerenjine">
                                公积金个人金额</label>

<input type="text" class="form-control" id="gongjijingerenjine" name="gongjijingerenjine" value="${entity.gongjijingerenjine}">
                        </div>
                    </div>
 <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="gongjijinzongjine">
                                公积金总金额</label>

<input type="text" class="form-control" id="gongjijinzongjine" name="gongjijinzongjine" value="${entity.gongjijinzongjine}">
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