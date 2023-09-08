<%--
  Created by IntelliJ IDEA.
  User: Artak
  Date: 08.09.2023
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background: linear-gradient(to bottom, #ff6b6b, #4ecdc4);
        }

        .container {
            background: radial-gradient(#4ecdc4,#ff6b6b);
            text-align: center;
            padding: 20px;
            border-radius: 10px;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Enter your current password</h1>
    <%=request.getAttribute("message") != null ? request.getAttribute("message") : ""%>

    <form action="/changePassword" method="post">
        <input type="text" name="current"/>
        <h1>Enter your new password</h1>
        <input type="text" name="new"/>
        <input type="submit" value="change"/>
    </form>
</div>
</body>
</html>

