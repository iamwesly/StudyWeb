<%--
  Created by IntelliJ IDEA.
  User: weasley
  Date: 2020/11/25
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>登录</title>
</head>
<body>
    <form action="LonginServlet" method="post">
        用户名：<input type="text" name="uname"><br/>
        密码：<input type="text" name="pwd"><br/>
        <input type="submit" value="登录"><br/>
    </form>
</body>
</html>
