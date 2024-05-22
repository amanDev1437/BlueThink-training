
<%@ page contentType="text/html;charset=UTF-8" language="java"
         import="com.aman.learnjsp.Login" %>
<html>
<head>
    <title>LogIn Success</title>
</head>
<body>
    <h1>You are Successfully logged in !</h1>
    <% Login login = (Login) request.getAttribute("login");
    %>

    <h2><%= "Welcome,"+login.getName()%></h2>
</body>
</html>
