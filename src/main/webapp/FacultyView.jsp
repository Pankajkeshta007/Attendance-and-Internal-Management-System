<%@page import="java.util.ArrayList"%>

<%@page import="java.util.List"%>
<%@page import="com.AIMS.Dao.facultyData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Title of the document</title>
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
h1{
text-align: center;
font-size: 40px;
font-family: fantasy;
color:yellow;

}

.btn-container a:hover {
	background-color: #0056b3;
    </style>
  </head>
  <body>
    <h1><b>FACULTY RECORDS</b></h1>
   <table>
			<thead>
				<tr>
					<th>Aicte Id</th>
					<th> Name</th>
					<th>Date Of Birth</th>
					<th>Date Of Joining</th>
					<th>Designation</th>
					<th>Qualification</th>
					<th>Email</th>
					<th>Contact</th>
					<th>Salary</th>
					<th>Password</th>
					
				</tr>

			</thead>
			<tbody>
				<!-- Add your faculty records here as table rows -->
				<tr>
					<%
					List<facultyData> f = (ArrayList<facultyData>) request.getAttribute("facultyDetails");
					for (facultyData facultyRecord : f) {
					%>

		           	<td><h5><%=facultyRecord.getAicteId() %></h5></td>
					<td><%=facultyRecord.getName()%></td>
					<td><%=facultyRecord.getDob()%></td>
					<td><%=facultyRecord.getDoj()%></td>
					<td><%=facultyRecord.getDesignation()%></td>
					<td><%=facultyRecord.getQualification()%></td>
					<td><%=facultyRecord.getEmail()%></td>
					<td><%=facultyRecord.getContact()%></td>
					<td><%=facultyRecord.getSalary()%></td>
					<td><%=facultyRecord.getPassword()%></td>
					
				</tr>
				<%
				}
				%>
				<!-- Add more rows as needed -->
			</tbody>
                  
	
		</table>
                  <div class="btn-container">
				<a href="FacultySection.jsp">Back</a>


</div>
  </body>
</html>