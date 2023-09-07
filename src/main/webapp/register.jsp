<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>
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
        }

        input[type="submit"]:hover {
            background-color: #42cc11;
        }
    </style>
</head>
<body>

<table>
    <h1>Registration</h1>
    <form action="/register" method="post">
        <tr>
            <td><label for="name">Name:</label></td>
            <td><input type="text" id="name" name="name" required></td>
        </tr>
        <tr>
            <td><label for="lastName">Last Name:</label></td>
            <td><input type="text" id="lastName" name="lastName" required></td>
        </tr>
        <tr>
            <td><label for="middleName">Middle Name:</label></td>
            <td><input type="text" id="middleName" name="middle_name"></td>
        </tr>
        <tr>
            <td><label for="age">Age:</label></td>
            <td><input type="number" id="age" name="age" required></td>
        </tr>
        <tr>
            <td><label for="username">Username:</label></td>
            <td><input type="text" id="username" name="username" required></td>
        </tr>
        <tr>
            <td><label for="password">Password:</label></td>
            <td><input type="password" id="password" name="password" required></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center;"><input type="submit" value="Register"></td>
        </tr>
    </form>
</table>

</body>
</html>

