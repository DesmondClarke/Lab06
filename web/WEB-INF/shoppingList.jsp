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
        
         
        <h1>Shopping List</h1>
        <p>Hello, ${username}</p>
        <p><a href="shoppingList?action=logout">Logout</a></p>
        <h2>List</h2>
        <br>
        <form method="POST" action="">
            <input type="text" name="item"><input type="submit" value="Add Item">
            <input type="hidden" name="action" value="add">
        </form>
        <form action="" method="post">
            
            
            <input type="submit" value="Delete">
            <input type="hidden" name="action" value="delete">
        </form>
        
    </body>
</html>
