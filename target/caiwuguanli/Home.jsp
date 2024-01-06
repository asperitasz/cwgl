<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
<%@ page import="com.ssm.core.po.Userinfo" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/templatemo-style.css" rel="stylesheet">
    <base target="right"/>
    <![endif]-->

</head>
<body>
<!-- Left column -->
<div class="templatemo-flex-row">
    <div class="templatemo-sidebar">
        <header class="templatemo-site-header">
            <div class="square"></div>
            <h1> 财务管理 </h1>
        </header>
        <%
            Userinfo user = (Userinfo) request.getSession().getAttribute("login_account");
            if (user == null) {
                response.sendRedirect("login.jsp");
                return;
            }
        %>
        <div class="mobile-menu-icon">
            <i class="fa fa-bars"></i>
        </div>
        <nav class="templatemo-left-nav">
            <ul>

                <li><a href="Yonghu/list.action" class="active"><i class="fa fa-users fa-fw"></i>用户管理</a>
                </li>
                <li><a href="Xiangmushouquan/list.action"><i class="fa fa-database fa-fw"></i>项目授权管理</a></li>
                <li><a href="Jiaofeixitong/list.action" ><i class="fa fa-database fa-fw"></i>缴费管理</a>
                </li>
                <li><a href="Gongzi/list.action"><i class="fa fa-database fa-fw"></i>工资管理</a></li>
                <li><a href="login.jsp" target="_parent"><i class="fa fa-eject fa-fw"></i>退出</a></li>
            </ul>
        </nav>
    </div>
    <!-- Main content -->
    <div class="templatemo-content col-1 light-gray-bg">
        <div class="templatemo-top-nav-container">
            <div class="row">
                <nav class="templatemo-top-nav col-lg-12 col-md-12">
                    <ul class="text-uppercase">

                        <li><a href="JavaScript:;">欢迎访问财务管理分析系统</a></li>
                    </ul>
                </nav>
            </div>
        </div>
        <div class="templatemo-content-container">
            <iframe name="right" style="width:100%;height:550px;border:0px" src="Yonghu/list.action">

            </iframe>
        </div>
    </div>
</div>

<!-- JS -->
<script src="js/jquery-1.11.2.min.js"></script>      <!-- jQuery -->
<script src="js/jquery-migrate-1.2.1.min.js"></script> <!--  jQuery Migrate Plugin -->

<script type="text/javascript" src="js/templatemo-script.js"></script>      <!-- Templatemo Script -->
<script>
    $(function () {

        $(".templatemo-left-nav").children("ul").children("li").children("a").click(function () {
            $(this).parent().siblings().children("a").removeClass("active");
            $(this).parent().siblings().children("ul").hide();
            $(this).parent().children("a").addClass("active");
            $(this).parent().children("ul").toggle();
        });
    });
</script>
</body>
</html>