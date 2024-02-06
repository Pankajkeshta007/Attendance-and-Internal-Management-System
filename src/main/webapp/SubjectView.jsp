<%@page import="java.util.ArrayList"%>

<%@page import="java.util.List"%>
<%@page import="com.AIMS.Dao.SubjectRecord"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="shortcut icon" type="image/x-icon" href="img/favicon.png">
    <!-- Place favicon.ico in the root directory -->

    <!-- CSS here -->
    <link rel="stylesheet" href="https://smartcookie.in/css/cssfb/bootstrap.min.css">
    <link rel="stylesheet" href="https://smartcookie.in/css/cssfb/owl.carousel.min.css">
    <link rel="stylesheet" href="https://smartcookie.in/css/cssfb/magnific-popup.css">
    <link rel="stylesheet" href="https://smartcookie.in/css/cssfb/font-awesome.min.css">
    <link rel="stylesheet" href="https://smartcookie.in/css/cssfb/themify-icons.css">
    <link rel="stylesheet" href="https://smartcookie.in/css/cssfb/nice-select.css">
    <link rel="stylesheet" href="https://smartcookie.in/css/cssfb/flaticon.css">
    <link rel="stylesheet" href="https://smartcookie.in/css/cssfb/animate.css">
    <link rel="stylesheet" href="https://smartcookie.in/css/cssfb/slicknav.css">
<style>
 img.background {
   	
      position: fixed;
     
      left: 0px;
      top: 0px;
      z-index: -1;
      width: 100%;
      height: 100%;
      -webkit-filter: blur(3px); /* Safari 6.0 - 9.0 */
      filter: blur(3px);
      }
.aicteLogo{
            position: relative;
            left: 50px;
            bottom: 65px;
         }
        
        .header-area .donate_now a:hover {
            background: none !important;
            border-color: #fff;
            color: #450000 !important;
        }


table {
	border-collapse: collapse;
	width: 80%;
	margin: 20px auto;
	background-color: transparent;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
	border-radius: 10px;
}

th, td {
	padding: 12px 20px;
	text-align: left;
}

th {
	background-color: #007BFF;
	color: #fff;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

.table-container {
	max-height: 500px;
	overflow-y: auto;
}
h1{
font-size: 30px;
text-align: center;
font-family:  Arial, sans-serif;
color:red

}
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

.btn-container a:hover {
	background-color: #0056b3;
}
</style>
<meta charset="UTF-8">
<title>Student Record</title>
</head>
<body>
<img class="background" src="https://wallpapertag.com/wallpaper/full/4/e/9/147380-large-anime-school-background-1920x1080-desktop.jpg" alt="Aleq">
<header>
            <div class="header-area ">
                <div id="sticky-header" class="main-header-area">
                    <div class="container-fluid p-0">
                        <nav class="navbar navbar-expand-lg navbar-light ">
      <a class="navbar-brand" href="#"><img src="https://diplomajobs.co/wp-content/uploads/2023/01/unnamed.png" height="100px" alt=" "></a>
      <div class="collapse navbar-collapse align-items-middle text-white justify-content-center" id="navbarNavAltMarkup">
        <div class="col-md-12">
            <h1 style="color: #000;" class="text-center"><b>Attendance & Internal Management System</b></h1>  
        </div>
      </div>
      <a class="navbar-brand justify-content-end" href="#"><img src="https://media.9curry.com/uploads/organization/image/2794/hptu-logo.png" height="100px" alt=" "></a>
    </nav>
        
                        <div class="col-12">
                            <div class="mobile_menu d-block d-lg-none"></div>
                        </div>
                    </div>
                </div>
            </div>
        </header>
	<h1><b>Subject Details :</b></h1>






	<div class="table-container">
		<table>
			<thead>
				<tr>
					<th>Subject Code</th>
					<th>Subject Name</th>
					<th>Course Outcome</th>
					<th>Semester</th>
					<th>Academic Year</th>
					<th>Session</th>
					<th>Credit</th>
					
					
				</tr>

			</thead>
			<tbody>
				<!-- Add your faculty records here as table rows -->
				<tr>
					<%
					List<SubjectRecord> s = (ArrayList<SubjectRecord>) request.getAttribute("subjectDetails");
					for (SubjectRecord subjectRecord : s) {
					%>

		           	<td><h5><b><%=subjectRecord.getSubjectId()%></b></h5></td>
					<td><b><%=subjectRecord.getCoa()%></b></td>
					<td><b><%=subjectRecord.getSubjectName()%></b></td>
					<td><b><%=subjectRecord.getSemester()%></b></td>
					<td><b><%=subjectRecord.getAy()%></b></td>
					<td><b><%=subjectRecord.getSession()%></b></td>
					<td><b><%=subjectRecord.getCredit()%></b></td>
					
					
				</tr>
				<%
				}
				%>
				<!-- Add more rows as needed -->
			</tbody>
		</table>
	</div>

	<div class="btn-container">
				<a href="SubjectSection.jsp">Back</a>


</div>
 <br><br><br><br><br><br><br><br><br>
    <footer id="footer" style="min-height: 3.5rem;"class="bg-dark p-2 text-center align-items-middle  text-white">

        <div>

          <strong><span>Powered By ABVGIET Students</span></strong>

        </div>
            
    </footer>
</body>
</html>