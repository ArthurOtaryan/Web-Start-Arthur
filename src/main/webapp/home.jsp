
<%@ page import="com.smartcode.web.repository.comment.CommentRepository" %>
<%@ page import="com.smartcode.web.repository.comment.impl.CommentRepositoryImpl" %>
<%@ page import="com.smartcode.web.model.Comment" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.smartcode.web.repository.user.UserRepository" %>
<%@ page import="com.smartcode.web.repository.user.impl.UserRepositoryImpl" %>
<!DOCTYPE html>
<html lang="en">

  <meta charset="UTF-8">
  <title>Home</title>
  <style>

    body {
      background-color: #f0f0f0;
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

<% if (username != null) { %>
<div class="welcome">Welcome dear <%= request.getSession().getAttribute("username") %></div>
<% } %>

<% if (request.getAttribute("message") != null) { %>
<div class="message"><%= request.getAttribute("message") %></div>
<% } %>
<form action="/home" method="post">
  Title <input type="text" name="title"></br>
  Description <input type="text" name="description"></br>
  <input type="submit" value="submit">
</form>

<table>

  <tr>
    <th>Comment table</th>
    <th>Description</th>
  </tr>

  <%
    CommentRepository commentRepository = new CommentRepositoryImpl();

    UserRepository userRepository = new UserRepositoryImpl();

    List<Comment> list = commentRepository.getAll((int)request.getSession().getAttribute("id"));
    for(int i = 0; i < list.size(); i++) {
  %>
  <tr>
    <td>
      <%=list.get(i).getTitle()%>
    </td>
    <td>
      <%=list.get(i).getDescription()%>
    </td>
    <td>
      <form action="/comment" method="post">
        <input type="hidden" name="title" value="<%=list.get(i).getTitle()%>" />
        <input type="submit" value="delete">
      </form>

    </td>
    <td>
      <form action="/comment" method="get">
        <input type="hidden" name="title" value="<%=list.get(i).getTitle()%>" />
        <input type="submit" value="update">
      </form>
    </td>

  </tr>

  <%
    }
  %>

</table>



</table>
</body>
</html>
