<%@page import="java.sql.ResultSet"%>
<%@page import="com.AIMS.Dao.AdminRecord"%>
<%@page import="java.sql.*"%>
<%@page import="com.AIMS.Dao.DatabaseConnectivity"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        #navbar {
            background-color: #333;
            color: #fff;
            padding: 15px;
            text-align: center;
        }

        #sidebar {
            background-color: #555;
            color: #fff;
            width: 200px;
            padding: 20px;
            position: fixed;
            height: 100%;
            box-shadow: 2px 0 5px rgba(0, 0, 0, 0.1);
        }

        #content {
            margin-left: 250px;
            padding: 20px;
        }

        #admin-info {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 20px;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        #admin-info img {
            width: 90px;
            height: 100px;
            border-radius: 50%;
            margin-right: 10px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
            overflow: hidden;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            background-color: #fff;
            border-radius: 8px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 12px;
            text-align: left;
        }

        th {
            background-color: #333;
            color: #fff;
            width: 30%;
        }

        td {
            width: 30%;
        }

        ul {
            list-style-type: none;
            padding: 0;
            margin: 0;
            display: flex;
            justify-content: space-around;
            background-color: #333;
            border-bottom: 2px solid #555;
        }

        li {
            padding: 15px;
        }

        a {
            text-decoration: none;
            color: #fff;
        }

        a:hover {
            color: #ffd700;
        }
    </style>
</head>
<body>
<%
	AdminRecord admin = (AdminRecord) request.getAttribute("data");
	%>
    <div id="navbar">
        <h1>Admin Dashboard</h1>
        <h3>Welcome! <%=admin.getName() %></h3>
        <ul>
            <li><a href="Home.jsp">Home</a></li>
            <li><a href="StudentSection.jsp">Student Section</a></li>
            <li><a href="FacultySection.jsp">Faculty Section</a></li>
            <li><a href="BranchSection.jsp">Branch Section</a></li>
            <li><a href="SubjectSection.jsp">Subject Section</a></li>
            <li><a href="Home.jsp">Logout</a></li>
        </ul>
    </div>


    <div id="sidebar">
        <div id="admin-info">
            <img src="https://p7.hiclipart.com/preview/701/653/267/computer-icons-system-administrator-clip-art-administrator-icon.jpg" alt="Admin Image">
           
        </div>
    </div>

    <div id="content">
        <h2>Admin Information</h2>
        <table>
            <tr>
                <th>Name</th>
                <td><%=admin.getName() %></td>
            </tr>
            <tr>
                <th>Role</th>
                <td><%= admin.getRole() %></td>
            </tr>
            <tr>
                <th>Username</th>
                <td><%= admin.getUsername() %></td>
            </tr>
            <tr>
                <th>Password</th>
                <td><%= admin.getPassword() %></td>
            </tr>
            <tr>
                <th>Email</th>
                <td><%= admin.getEmail() %></td>
            </tr>
        </table>
    </div>

</body>
</html>
