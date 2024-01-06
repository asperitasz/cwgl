<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>
    <meta name="description" content="">
    <meta name="author" content="templatemo">
    <link href='http://fonts.useso.com/css?family=Open+Sans:400,300,400italic,700' rel='stylesheet' type='text/css'>
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/templatemo-style.css" rel="stylesheet">

</head>
<body class="light-gray-bg">
<div class="templatemo-content-widget templatemo-login-widget white-bg" style="margin-top: 50px;">
    <header class="text-center">
        <div class="square"></div>
        <h1>项目授权管理</h1>
    </header>
    <form action="Xiangmushouquan/check.action" class="templatemo-login-form">
        <div class="form-group">
            <div class="input-group">
                <div class="input-group-addon"><i class="fa fa-user fa-fw"></i></div>
                <input type="text" class="form-control" placeholder="卡号" name="username">
            </div>
        </div>
        <div class="form-group">
            <div class="input-group">
                <div class="input-group-addon"><i class="fa fa-key fa-fw"></i></div>
                <input type="password" class="form-control" placeholder="密码" name="password">
            </div>
        </div>
        <div class="form-group">
            <button type="submit" class="templatemo-blue-button width-100">验证</button>
        </div>
    </form>
</div>

</body>
</html>