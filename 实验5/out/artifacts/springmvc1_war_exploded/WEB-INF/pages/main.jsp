<%--
  Created by IntelliJ IDEA.
  User: HXX
  Date: 2023/5/18
  Time: 8:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
<li>您好:${user.username}</li>
<li><a href="${pageContext.request.contextPath}/logout">退出</a></li>
<li><a href="${pageContext.request.contextPath}/info">订单信息</a></li>
</body>
</html>
