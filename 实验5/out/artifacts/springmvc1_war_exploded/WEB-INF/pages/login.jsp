<%--
  Created by IntelliJ IDEA.
  User: HXX
  Date: 2023/5/18
  Time: 8:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    <div>${msg}</div>
    用户名:<input type="text" name="username"/><br/>
    密码：<input type="password" name="password"/><br/>
    <input type="submit" value="登录"/>

</form>
</body>
</html>
