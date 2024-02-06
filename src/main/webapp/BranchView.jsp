<%@page import="java.util.ArrayList"%>

<%@page import="java.util.List"%>
<%@page import="com.AIMS.Dao.BranchData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Branch record</title>
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
    <h1>BRANCH RECORDS :</h1>
    <table>
     <thead>
				<tr>
					<th>Branch Name</th>
					<th>Accredation Status</th>
					<th>Intake</th>
					<th>Student Id</th>
					<th>Branch Id</th>
					
				</tr>

			</thead>
      <tbody>
				<!-- Add your student records here as table rows -->
				<tr>
					<%
					List<BranchData> b = (ArrayList<BranchData>) request.getAttribute("Details");
					for (BranchData branchtData : b) {
					%>

			
					<td><h5><%=branchtData.getBranch_name()%></h5></td>
					<td><%=branchtData.getAccredation_status()%></td>
					<td><%=branchtData.getIntake()%></td>
					<td><%=branchtData.getStudent_id()%></td>
					<td><%=branchtData.getBranch_id()%></td>
					
				</tr>
				<%
				}
				%>
    </table>
     <div class="btn-container">
				<a href="BranchSection.jsp">Back</a>


</div>
  </body>
</html>