<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome page</title>
    <style>
        body {

            background: #E87D2D;
            background: linear-gradient(135deg, #E87D2D, #CCB08C);
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

        h1 {
            font-size: 2.5em;
            color: rgba(255, 255, 255, 0.62);
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
        }

        .button-container {
            display: flex;
            justify-content: center;
            margin-top: 20px;
        }

        .gradient-button {
            background: linear-gradient(315deg, #A48A3B, #4E43B5);
            color: rgba(255, 255, 255, 0.62);
            padding: 10px 20px;
            border: none;
            cursor: pointer;
            margin: 5px;
            border-radius: 5px;
            font-size: 1.2em;
            transition: background-color 0.3s ease;
        }

        .gradient-button:hover {
            background: linear-gradient(315deg, #AAC594, #33A93D);
        }
    </style>
</head>
<body>

<h1>Welcome to our shop</h1>

<div class="button-container">
    <button class="gradient-button" onclick="window.location.href='register.jsp';">
        Register
    </button>

    <button class="gradient-button" onclick="window.location.href='login.jsp';">
        Login
    </button>
</div>

</body>
</html>
