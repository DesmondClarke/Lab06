<%-- 
    Document   : register
    Created on : Oct 18, 2021, 6:15:42 PM
    Author     : 507936
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <form method="POST" action="ShoppingServlet">
        <h1>Shopping List</h1>
        <label>Username:</label>
        <input name="user" type="text">
        
        <input type="submit" value="Register Name">
        </form>
        <c:if test="${invalidEntry}">
                <p>invalid entry. Please try again</p>
            </c:if>
    </body>
</html>
