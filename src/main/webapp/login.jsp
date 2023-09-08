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

        .form-container {
            background: linear-gradient(135deg, #fff766, #63666A);
            text-align: center;
            padding: 20px;
            border-radius: 15px;
            box-shadow: 0 0 10px rgba(220, 187, 187, 0.2);
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
<div class="form-container">
<form action="/login" method="post">
    Username <input type="text" name="username"></br>
    Password <input type="password" name="password"></br>
    <input type="submit" value="login">
</form>
</div>

</body>
</html>
