<%-- 
    Document   : submitNumbers.jsp
    Created on : Jul 15, 2016, 10:20:24 AM
    Author     : Felipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Number Submission</title>
    </head>
    <body>
        <form action="ComputeSum" method="GET">
              First Number: <input type="text" name="first" /><br />
              Second Number: <input type="text" name="second" /><br /> 
              <input type="submit" value="Compute Sum" />
       </form>
    </body>
</html>
