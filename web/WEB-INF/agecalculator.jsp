<%-- 
    Document   : agecalculator
    Created on : Jun 2, 2021, 11:48:26 PM
    Author     : 809611
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form method ="POST" action ="age">
            <label>Enter your age:</label>
            <input type ="text" name = "Age" value ="${userAge}">
            <br>
            <input type ="submit" value ="Age next birthday">
            <p>${newAge}</p>
            <p>${error1}</p>
            <p>${error2}</p>
            <a href ="/Lab3/arithmetic">Arithmetic Calculator</a>
    </body>
</html>