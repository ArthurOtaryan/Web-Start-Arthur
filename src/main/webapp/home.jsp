<%@ page import="com.smartcode.web.repository.comment.CommentRepository" %>
<%@ page import="com.smartcode.web.repository.comment.impl.CommentRepositoryImpl" %>
<%@ page import="com.smartcode.web.model.Comment" %>
<%@ page import="java.util.List" %>
<%@ page import="com.smartcode.web.repository.user.impl.UserRepositoryImpl" %>
<%@ page import="com.smartcode.web.repository.user.UserRepository" %>
<html lang="en">
<head>
  <style>
    body {
      background: linear-gradient(to bottom, #8aafdc, #2adeb8);
      font-family: Arial, sans-serif;
      color: white;
    }

    h2 {
      color: #333;
    }

    .welcome {
      font-size: 24px;
      color: #000102;
      margin-top: 20px;
    }

    form {
      margin-top: 20px;
    }

    input[type="text"],
    input[type="submit"] {
      padding: 10px;
      margin: 5px;
      border: 1px solid #ccc;
      border-radius: 5px;
    }

    .gradient-button {
      background: linear-gradient(to bottom, #007BFF, #0056b3);
      color: #fff;
      border: none;
      padding: 10px 20px;
      border-radius: 5px;
      cursor: pointer;
      margin-top: 20px;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      margin-top: 20px;
    }

    th, td {
      border: 1px solid #ddd;
      padding: 8px;
      text-align: left;
    }

    th {
      background-color: #007BFF;
      color: white;
    }

    .update-button {
      background-color: #4CAF50;
      color: white;
      border: none;
      padding: 5px 10px;
      border-radius: 3px;
      cursor: pointer;
    }
  </style>
</head>

<body>
<%
  String username = (String) request.getSession().getAttribute("username");
  if (username == null) {
    request.setAttribute("message", "Login first!");
    request.getRequestDispatcher("login.jsp").forward(request, response);
  }
%>
<h2>Welcome to the Home Page</h2>

<div class="welcome">Welcome dear <%= request.getSession().getAttribute("username") %></div>


<form action="/home" method="post">
  Title <input type="text" name="title"><br>
  Description <input type="text" name="description"><br>
  <input type="submit" value="Submit">
</form>

<button class="gradient-button" onclick="window.location.href='ChangePassword.jsp';">
  Change_Password
</button>

<table>
  <tr>
    <th>Title</th>
    <th>Description</th>
  </tr>
  <%
    CommentRepository commentRepository = new CommentRepositoryImpl();
    UserRepository userRepository = new UserRepositoryImpl();
    List<Comment> list = commentRepository.getAll((int) request.getSession().getAttribute("id"));
    for (int i = 0; i < list.size(); i++) {
  %>
  <tr>
    <td><%= list.get(i).getTitle() %></td>
    <td><%= list.get(i).getDescription() %></td>
    <td>
      <form action="/comment" method="post">
        <input type="hidden" name="title" value="<%=list.get(i).getTitle()%>" />
        <input type="submit" value="delete">
      </form>
    </td>
    <td>
      <form action="/comment" method="get">
        <input type="hidden" name="title" value="<%= list.get(i).getTitle() %>" />
        <input type="submit" class="update-button" value="Update">
      </form>
    </td>
  </tr>
  <%
    }
  %>
</table>
</body>
</html>
