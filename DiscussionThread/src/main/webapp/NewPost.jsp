<%-- 
    Document   : NewPost
    Created on : Jul 17, 2016, 11:39:17 AM
    Author     : Felipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Post</title>
    </head>
    <body>
        <h1>Welcome!</h1>
        <h2>Please enter a new post:</h2>
        <a href="Logout">Logout</a>
        <form action="ShowPosts" method="post">
            <textarea rows="4" cols="100" name="newPost"></textarea></br>
            <input type="submit"/>
        </form>
        <p><a href="ShowPosts">Click here</a> to see posts.</p>
    </body>
</html>
