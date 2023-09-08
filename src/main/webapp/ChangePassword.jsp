<%--
  Created by IntelliJ IDEA.
  User: Artak
  Date: 08.09.2023
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
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
            background: linear-gradient(to bottom, #e73b28, #1F1C18);
        }

        .container {
            background: radial-gradient(#1F1C18, #e5402d);
            text-align: center;
            padding: 20px;
            border-radius: 10px;
        }


        .button-container {
            margin-top: 20px;
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


        <div class="button-container">
            <input type="submit" value="Change"/>
        </div>
    </form>
</div>
</body>
</html>

