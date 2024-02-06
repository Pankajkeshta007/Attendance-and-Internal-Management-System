<%@page import="com.AIMS.Dao.StudentInternal"%>
<%@page import="java.util.ArrayList"%>

<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Student record</title>
    <style>
    body{
    
    background-color: gray;
    }
      table {
        border-collapse: collapse;
        width: 100%;
      }
      tr {
        background-color: #f5f5f5;
      }
      th,
      td {
        padding: 15px;
        text-align: left;
        border-bottom: 1px solid #ccc;
      }
      tr:hover {
        background-color: #cdcdcd;
      }
      .btn-container {
	text-align: center;
}
h1{
font-family: fantasy;
font-size: 30px;
text-align: center;
color: yellow;
}

.btn-container a {
	text-decoration: none;
	padding: 10px 20px;
	margin: 5px;
	background-color: red;
	color: #fff;
	border-radius: 3px;
	transition: background-color 0.3s ease;

	float: right;
}

.btn-container a:hover {
	background-color: #0056b3;-
    </style>
  </head>
  <body>
    <h1>STUDENT INTERNAL ASSESMENT :</h1>
    <table>
     <thead>
				<tr>
					<th>Subject Code</th>
					<th>Marks Obtained</th>
					
				</tr>

			</thead>
      <tbody>
				<!-- Add your student records here as table rows -->
				<tr>
					<%
					ArrayList<StudentInternal> s = (ArrayList<StudentInternal>) request.getAttribute("studentInternals");
					for (StudentInternal studentInternal : s) {
					%>

			
					<td><%=studentInternal.getSubject_id()%></td>
					<td><%=studentInternal.getMarks()%></td>
					
				</tr>
				<%
				}
				%>
    </table>
     <div class="btn-container">
				<a href="StudentLogin.jsp">Back</a>


</div>
  </body>
</html>