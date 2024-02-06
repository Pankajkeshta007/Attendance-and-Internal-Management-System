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
.container {
	max-width: 400px;
	margin: 0 auto;
	padding: 20px;
	background-color:transparent ;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
	border-radius: 5px;
}

h2 {
	text-align: center;
}

label {
	display: block;
	margin-bottom: 5px;
}

input[type="text"] {
	width: 100%;
	padding: 10px;
	margin-bottom: 10px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

.btn-container {
	text-align: center;
}

.btn-container a {
	text-decoration: none;
	padding: 10px 20px;
	margin: 5px;
	background-color: #007bff;
	color: #fff;
	border-radius: 5px;
	transition: background-color 0.3s ease;
}

.btn-container a:hover {
	background-color: #0056b3;
}
input[type="submit"] {
            background-color: #007BFF;
            color: #fff;
            border: none;
            margin:5px;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }

     input[type="submit"]:hover {
            background-color: #0056b3;
        }
</style>
<meta charset="UTF-8">
<title>Student Update</title>
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
<%
String stuRollno=session.getAttribute("rollno").toString();
session.setAttribute("studentRollno", stuRollno);
%>
	<div class="container">
		<h2>Student Update Menu</h2>
		<form action ="LastName" method="post">
			<label for="rollno"> Last Name:</label> <input type="text"
				id="rollno" name="name" placeholder="Enter new name of student " required><br>
			<br>
			<div class="btn-container">
				<a href="SelectStudentFieldForUpdate.jsp">Back</a>
				<input type="submit" value="Submit">
				 
			</div>
		</form>
	</div>
	<br><br><br><br><br><br>
	<footer id="footer" style="min-height: 3.5rem;"class="bg-dark p-2 text-center align-items-middle  text-white">

        <div>

          <strong><span>Powered By ABVGIET Students</span></strong>

        </div>
            
    </footer>
</body>
</html>