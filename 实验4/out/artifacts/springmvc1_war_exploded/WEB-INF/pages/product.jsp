<%--
  Created by IntelliJ IDEA.
  User: HXX
  Date: 2023/5/17
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>product</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/product" method="post">
  <table width="220px" border="1">
    <tr><td>选择</td>商品名称</tr>
    <tr>
      <td>
        <input name="proIds" value="1" type="checkbox">
      </td>
      <td>Java</td>
    </tr>
    <tr>
      <td>
        <input name="proIds" value="2" type="checkbox">
      </td>
      <td>C</td>
    </tr>
    <tr>
      <td>
        <input name="proIds" value="3" type="checkbox">
      </td>
      <td>PYTHON</td>
    </tr>
  </table>
  <input type="submit" value="提交">
</form>


</body>
</html>
