<%--
  Created by IntelliJ IDEA.
  User: HXX
  Date: 2023/5/17
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/order" method="post">
  用户:<input type="text" name="username" /><br/>
  订单:<input type="text" name="order.orderid" ><br/>
  <input type="submit" value="查询"/>

</form>
</body>
</html>
