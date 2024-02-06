<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!doctype html>
<html class="no-js" lang="zxx">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Attendence & Internal Management System</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- <link rel="manifest" href="site.webmanifest"> -->
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
    <!-- <link rel="stylesheet" href="https://smartcookie.in/css/cssfb/style.css"> -->
    <!-- <link rel="stylesheet" href="css/responsive.css"> -->
</head>
    
    <style>
    
    .align-items-center {
    -webkit-box-align: center!important;
    -ms-flex-align: center!important;
    align-items: none!important;
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

       .section_title1 p {
            font-size: 70px;
            position: relative;
            top: 150px;
            color: brown;
            text-shadow: 5px -2px 6px;
        }
        
      .slider_area::before {
            position: absolute;
            content: "";
            background: #ffd868 !important;
            width: 100%;
            height: 100%;
            left: 0;
            top: 0;
            opacity: .8;
        }
        
        .slider_area {
                padding-top: 80px;
                height: 380px;
                position: relative;
                z-index: 0 !important;
                background-repeat: no-repeat;
                background-size: cover;
            }
        
        
        
        .fotText{
            font-size: 18px;
            text-shadow: 2px 6px 13px orangered;
/*
            position: relative;
            bottom: 100px;
*/
 
        } 
        
       
  
       
    </style>
    <script type="text/javascript">
        function changeMessage(){
            var url = "AdminRegister.jsp";
            document.loginform.action = url;
            document.forms["loginform"].submit();
            
        }
        function changeMessage2(){
            var url = "core/activate_school.php";
            document.loginform.action = url;
            document.forms["loginform"].submit();
            
        }
    </script>
<body>
  
        <header>
            <div class="header-area ">
                <div id="sticky-header" class="main-header-area">
                    <div class="container-fluid p-0">
                        <nav class="navbar navbar-expand-lg navbar-light ">
      <a class="navbar-brand" href="#"><img src="https://diplomajobs.co/wp-content/uploads/2023/01/unnamed.png" height="100px" alt=" "></a>
      <div class="collapse navbar-collapse align-items-middle text-white justify-content-center" id="navbarNavAltMarkup">
        <div class="col-md-12">
            <h1 style="color: #000;" class="text-center"><b>Attendance and  Internal Management System</b></h1>  
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
    <div class="slider_area about_area" style="position:relative;">
        <div class="container">
            <div class="row align-items-center">
                <div class="col-xl-4 col-md-4 text-center">
                            <a href="StudentLogin.jsp" class=" " role="button"><img src="https://smartcookie.in/image/student250.png" alt="" width="200" height="200"></a>
                            <br/>
                             <span class="sf"><h4>STUDENT</h4></span>           
                </div> 
                <div class="col-xl-4 col-md-4 text-center">
                            <a href="FacultyLogin.jsp" class=" " role="button"><img src="https://smartcookie.in/image/teacher250.png" alt=""  width="200" height="200"></a>
                            <br/>
                            <span><h4>FACULTY</h4></span>
                </div>

                 <div class="col-xl-4 col-md-4 text-center">
                            <form method="POST" name='loginform' id='loginform'>
                                <input type="hidden" name="entity" value="1"><a onclick="changeMessage()" href="#" role="button"><img src="https://smartcookie.in/image/admin250.png" alt="" width="200" height="200"></a>
                            </form>
                             <span class="sf"><h4>ADMINSTRATOR</h4></span>           
                </div>

            </div>
        </div>
    </div>
    <br>
  
    <div class="container">
        <div class =" row justify-content-center pt-5 ">
            <a href="ContactUs.jsp"><center><img src="https://smartcookie.in/Assets/image/faq.png" class="rounded mx-4 shadow-lg p-3 bg-white rounded"></center>
               <div class="card-body">
                  <center><h5 class="card-title">Contact Us</h5></center>
               </div>   
            </a>
           
            <a href="AboutUs.jsp"><center><img src="https://smartcookie.in/Assets/image/event.png" class="rounded mx-4 shadow-lg p-3  bg-white rounded"></center>
               <div class="card-body">
                  <center><h5 class="card-title">About Us</h5></center>
               </div>
            </a>
           
            <a href="https://smartcookie.in/Assets/documents/AICTE_360_Degree_Feedback_Implementation_Manual_20210123.pdf" target="_blank"><center><img src="https://smartcookie.in/Assets/image/help.png" class="rounded mx-4 shadow-lg p-3 bg-white rounded"></center>
               <div class="card-body">
                  <center><h5 class="card-title">Help</h5></center>
               </div>
            </a>
        </div>
    </div>
    
    <footer id="footer" style="min-height: 3.5rem;"class="bg-dark p-2 text-center align-items-middle  text-white">

        <div>

          <strong><span>Powered By ABVGIET Students</span></strong>

        </div>
            
    </footer>
    
</body>

</html>
