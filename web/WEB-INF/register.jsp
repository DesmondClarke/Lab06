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
        <h1>Shopping List</h1>
        <form action="shoppingList" method="post">
            <label>Username:</label>
            <input name="user" type="text">
            <input type="submit" value="Register">
            <input type="hidden" name="action" value="register">
        </form>
        <c:if test="${invalidEntry}">
                <p>invalid entry. Please try again</p>
            </c:if>
    </body>
</html>
