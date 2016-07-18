<%-- 
    Document   : index.jsp
    Created on : Jul 17, 2016, 11:32:58 AM
    Author     : Felipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <% 
        if (session.getAttribute("username") != null) {
            response.sendRedirect("NewPost.jsp");
        }
        %>
        <form action="Login" method="post">
                <p>Username: <input name="username" type="text"/></p>
                <p>Password: <input name="password" type="password"/></p>
                <input type="submit"/>
        </form>
    </body>
</html>
