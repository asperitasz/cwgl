<%@page import="com.ssm.core.po.Gongzi"%>
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
    Gongzi entity = (Gongzi) request.getAttribute("entity");
    %>
<input type="hidden" id="id" name="id" value="${entity.id}"/>

 <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="yuefen">
                                月份</label>

<input type="text" class="form-control" id="yuefen" name="yuefen" value="${entity.yuefen}">
                        </div>
                    </div>
 <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="gonghao">
                                工号</label>

<input type="text" class="form-control" id="gonghao" name="gonghao" value="${entity.gonghao}">
                        </div>
                    </div>
 <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="xingming">
                                姓名</label>

<input type="text" class="form-control" id="xingming" name="xingming" value="${entity.xingming}">
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
 <div class="row form-group">
                        <div class="col-lg-12 has-success form-group">
                            <label class="control-label" for="shifagongzi">
                                实发工资</label>

<input type="text" class="form-control" id="shifagongzi" name="shifagongzi" value="${entity.shifagongzi}">
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