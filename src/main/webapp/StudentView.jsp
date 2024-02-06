<%@page import="java.util.ArrayList"%>

<%@page import="java.util.List"%>
<%@page import="com.AIMS.Dao.StudentData"%>
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
    <h1>STUDENT RECORDS :</h1>
    <table>
     <thead>
				<tr>
					<th>Student Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Date Of Birth</th>
					<th>Date Of Admission</th>
					<th>Batch</th>
					<th>12 %</th>
					<th>Lateral Entry</th>
					<th>Father's Name</th>
					<th>Email</th>
					<th>Contact No</th>
					<th>Password</th>
					<th>Semester</th>
					<th>Address</th>
				</tr>

			</thead>
      <tbody>
				<!-- Add your student records here as table rows -->
				<tr>
					<%
					List<StudentData> s = (ArrayList<StudentData>) request.getAttribute("studentDetails");
					for (StudentData studentData : s) {
					%>

			
					<td><h5><%=studentData.getStudentId() %></h5></td>
					<td><%=studentData.getFirstName()%></td>
					<td><%=studentData.getLastName()%></td>
					<td><%=studentData.getDob()%></td>
					<td><%=studentData.getDoa()%></td>
					<td><%=studentData.getBatch()%></td>
					<td><%=studentData.getPercentage12()%></td>
					<td><%=studentData.getLateralEntry()%></td>
					<td><%=studentData.getFatherName()%></td>
					<td><%=studentData.getEmail()%></td>
					<td><%=studentData.getContactNo()%></td>
					<td><%=studentData.getPassword()%></td>
					<td><%=studentData.getSemester() %></td>
					<td><%=studentData.getAddress() %></td>
				</tr>
				<%
				}
				%>
    </table>
     <div class="btn-container">
				<a href="StudentSection.jsp">Back</a>


</div>
  </body>
</html>