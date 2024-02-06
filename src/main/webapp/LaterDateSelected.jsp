<%@ page import="java.sql.*" import="jakarta.servlet.http.HttpSession" import="java.util.*" import="java.text.SimpleDateFormat"  %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success Dialog</title>
    <link rel="stylesheet" href="styles.css">
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f5f5f5;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .dialog-container {
        background-color: rgba(0, 0, 0, 0.5);
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        display: flex;
        justify-content: center;
        align-items: center;
        z-index: 1;
    }

    .dialog-box {
        background-color: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
        text-align: center;
    }

    button {
        background-color: #007BFF;
        color: #fff;
        padding: 10px 20px;
        border: none;
        border-radius: 3px;
        cursor: pointer;
        margin-top: 15px;
    }

    button:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<%
String referer=request.getHeader("referer");
%>
<div class="dialog-container">
        <div class="dialog-box">
            <h2>Error!</h2>
            <p>You selected later date</p>
            <p>You cannot make attendance of later dates now </p>
            <p>Kindly select only the current date</p>
            <button type="button" onclick="window.location.href='<%=referer%>'">Close</button>
        </div>
    </div>
</body>
</html>