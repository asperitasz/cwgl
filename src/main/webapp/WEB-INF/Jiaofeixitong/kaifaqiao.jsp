 <%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2023/7/4
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function dayin() {
            var t = window.document.getElementById("print");
            t.style.display = 'none';
            window.print();
            t.style.display="block";
        }
    </script>
</head>
<body>
<input type="button" value="打印" onclick="dayin();" id="print"/>
<div style="width:500px;height:300px;margin:100px auto;">
    <h1 align="center">财务普通发票</h1>
    <hr/>
    <table cellpadding="0" border="1" cellspacing="0">
        <tr>
            <td width="100px">收费项目：</td>
            <td width="300px">${entity.jiaofeixiangmu}</td>
        </tr>
        <tr>
            <td>收费金额：</td>
            <td>${entity.jiaofeijine}</td>
        </tr>
        <% SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");%>
        <tr>
            <td colspan="2" align="right">时间:<%=sdf.format(new Date())%>
            </td>
        </tr>
    </table>
</div>

</body>
</html>
