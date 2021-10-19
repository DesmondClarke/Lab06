<%-- 
    Document   : shoppingList
    Created on : Oct 18, 2021, 6:16:01 PM
    Author     : 507936
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List</title>
    </head>
    <body>
         <form method="POST" action="add">
        <h1>Shopping List</h1>
        <p>Hello, ${username} <a href="">Logout</a></p>
        <h2>List</h2>
        <br>
        <p>Add item:<input name="itemAdd"><button name="addButton" action="add">Add</button></p>
         </form>
        
        
    </body>
</html>
