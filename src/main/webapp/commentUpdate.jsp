<%--
  Created by IntelliJ IDEA.
  User: Artak
  Date: 07.09.2023
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Update comment</title>
  <style>
    /* Center the content */
    body {
      background: linear-gradient(#373B44,#4286f4);
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;

    }

    .form-container {
      background: linear-gradient(#b92b27,#1565C0);
      text-align: center;
      padding: 20px;
      border-radius: 15px;
      box-shadow: 0 0 10px rgba(220, 187, 187, 0.2);
    }
  </style>
</head>
<body>
<div class="form-container">
  <h2>Update comment </h2>
  <h3><%= request.getSession().getAttribute("title") %></h3>
  <form action="/commentUpdate" method="post">
    <input type="text" name="description" />
    <input type="submit" value="update">
  </form>
</div>
</body>
</html>

