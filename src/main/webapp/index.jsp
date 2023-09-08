<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome page</title>
    <style>
        body {
            background: linear-gradient(135deg, #8E0E00, #1F1C18);
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            text-align: center;
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            position: relative;
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
            background: linear-gradient(315deg, #b2aca5, #da200c);
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


        .corner-image {
            position: absolute;
            top: 10px;
            right: 10px;
            width: 100px;
            height: auto;
        }
    </style>
</head>
<body>

<img class="corner-image" src="img/11097264.jpg" alt="Corner Image">

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
