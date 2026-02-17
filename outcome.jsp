<%-- 
    Document   : outcome
    Created on : 17 Feb 2026, 21:49:57
    Author     : castr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Here are the results</h1>
        
        <%
            Integer num1=(Integer)request.getAttribute("num1");
            Integer num2=(Integer)request.getAttribute("num2");
            Integer total=(Integer)request.getAttribute("total");
            String sign=(String)request.getAttribute("sign");
        %>
        
        <p>The total of <%=num1%> <%=sign%> <%=num2%> is <%=total%></p>
        
        <p>Click <a href="index.html">here</a> to go back to the main page</p>
    </body>
</html>
