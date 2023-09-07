<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Page Title</title>
    <style>
        body {
            background: linear-gradient(135deg, #63666A, #fff766);
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            text-align: center;
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }

        table {
            background: linear-gradient(135deg, #63666A, #fff766);
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 300px;
        }

        h1 {
            color: #333;
            text-align: center;
        }

        table td {
            padding: 5px;
        }

        input[type="text"],
        input[type="number"],
        input[type="password"] {
            width: 100%;
            padding: 5px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        input[type="submit"] {
            background-color: #007BFF;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #42cc11;
        }
    </style>
</head>
<body>
<h1>Login</h1>
<%=request.getAttribute("message") != null ? request.getAttribute("message") : ""%>

<form action="/login" method="post">
    Username <input type="text" name="username"></br>
    Password <input type="password" name="password"></br>
    <input type="submit" value="login">
</form>
</body>
</html>
