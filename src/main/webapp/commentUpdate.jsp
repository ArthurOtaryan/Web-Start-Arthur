<%--
  Created by IntelliJ IDEA.
  User: Artak
  Date: 07.09.2023
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>

<h1>Update comment ->  <%=request.getSession().getAttribute("title")%>
</h1>


<form action="/commentUpdate" method="post">
  <input type="text" name="description"/>
  <input type="submit" value="update">
</form>





</body>
</html>
