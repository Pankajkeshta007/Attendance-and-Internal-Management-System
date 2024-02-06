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
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
           
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
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            background-color: transparent;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            border-radius: 10px;
        }

        h1 {
            text-align: center;
        }

        .button-row {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
            gap: 25px; /* Space between buttons */
        }

        .oval-button {
            flex: 0 0 calc(25% - 20px); /* Four buttons in each line */
            background-color: #007bff;
            color: #fff;
            text-align: center;
            padding: 15px;
            border-radius: 50px; /* Oval shape */
            margin-bottom: 10px;
            cursor: pointer;
            transition: background-color 0.3s ease;
            text-decoration: none; /* Remove default link underline */
        }

        .oval-button:hover {
            background-color: #0056b3;
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
}

.btn-container a:hover {
	background-color: #0056b3;
}
    </style>
<meta charset="UTF-8">
<title>Update Fields </title>
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
 <div class="container">
        <h1><b>Select the field you want to update</b></h1><br>
        <div class="button-row">
            <a href="UpdateSubjectName.jsp" class="oval-button">Subject Name</a>
            <a href="UpdateSubjectCOA.jsp" class="oval-button">Course Outcome</a>
            <a href="UpdateSubjectSemester.jsp" class="oval-button">Semester</a>
            <a href="UpdateSubjectAY.jsp" class="oval-button">Academic Year</a>
            <a href="UpdateSubjectSession.jsp" class="oval-button">Session</a>
            <a href="UpdateSubjectCredit.jsp" class="oval-button">Credit</a>
            
          
            	<div class="btn-container">
				<a href="SubjectSection.jsp">Back</a>
				
				
			</div>
        </div>
    </div><br><br><br><br><br>
     <footer id="footer" style="min-height: 3.5rem;"class="bg-dark p-2 text-center align-items-middle  text-white">

        <div>

          <strong><span>Powered By ABVGIET Students</span></strong>

        </div>
            
    </footer>
</body>
</html>