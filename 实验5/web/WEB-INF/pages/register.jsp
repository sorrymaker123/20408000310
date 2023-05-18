<%--
  Created by IntelliJ IDEA.
  User: HXX
  Date: 2023/5/17
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/register" method="post">
    用户名:<input type="text" name="username"/><br/>
    密&nbsp&nbsp码:<input type="password" name="password"/><br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
