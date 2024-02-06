<%@page import="com.AIMS.Dao.StudentData"%>
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
    <title>Student Dashboard</title>
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

String stu_id=session.getAttribute("stuId").toString();
session.setAttribute("student_id", stu_id);

%>
<%
	StudentData data = (StudentData) request.getAttribute("data");
	%>
    <div id="navbar">
        <h1>Student Dashboard</h1>
        <h3>Welcome! <%=data.getFirstName()%></h3>
        <ul>
            <li><a href="Home.jsp">Home</a></li>
            <li><a href="StudentViewAttandance.jsp">View Attendance</a></li>
            <li><a href="StudentViewInternalServlet">View Internal</a></li>
          
            <li><a href="Home.jsp">Logout</a></li>
        </ul>
    </div>


    <div id="sidebar">
        <div id="admin-info">
            <img src="https://p7.hiclipart.com/preview/701/653/267/computer-icons-system-administrator-clip-art-administrator-icon.jpg" alt="Admin Image">
           
        </div>
    </div>

    <div id="content">
        <h2>Student Information</h2>
        <table>
            <tr>
                <th> First Name</th>
                <td><%=data.getFirstName()%></td>
            </tr>
            <tr>
                <th>Last Name</th>
                <td><%= data.getLastName()%></td>
            </tr>
            <tr>
                <th>Student Id</th>
                <td><%= data.getStudentId()%></td>
            </tr>
            <tr>
                <th>DOB</th>
                <td><%= data.getDob()%></td>
            </tr>
            <tr>
                <th>DOA</th>
                <td><%=data.getDoa() %></td>
            </tr>
             <tr>
                <th>Email </th>
                <td><%=data.getEmail() %></td>
                
            </tr>
             <tr>
                <th>Batch</th>
                <td><%=data.getBatch() %></td>
                
            </tr>
             <tr>
                <th>Father Name</th>
                <td><%=data.getFatherName()%></td>
            </tr>
        </table>
    </div>

</body>
</html>
