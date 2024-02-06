<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>select field to update</title>
    <style>
    
     body {
       
        background-color:gray;
      }
      * {
        margin: 0;
        padding: 0;
        list-style-type: none;
        box-sizing: border-box;
      }
      .container{
      
      max-width: 600px;
      max-height:500px;
	margin: 0 auto;
	padding: 20px;
	background-color:blue;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
	border-radius: 5px;
}
      
      
      }
     
      nav {
        text-align: center;
      }
      .menu {
        display: inline-block;
      }
      .menu>li {
        float: left;
        color: #e298e1;
        width: 140px;
        height: 40px;
        line-height: 40px;
        background: rgba(0, 0, 0, 0.7);
        cursor: pointer;
        font-size: 17px;
      }
      .sub-menu {
        transform: scale(0);
        transform-origin: top center;
        transition: all 300ms ease-in-out;
      }
      .sub-menu li {
        font-size: 14px;
        background: rgba(0, 0, 0, 0.8);
        padding: 8px 0;
        color: white;
        border-bottom: 1px solid rgba(255, 255, 255, 0.2);
        transform: scale(0);
        transform-origin: top center;
        transition: all 300ms ease-in-out;
      }
      .sub-menu li:last-child {
        border-bottom: 0;
      }
      .sub-menu li:hover {
        background: black;
      }
      .menu>li:hover .sub-menu li {
        transform: scale(1);
      }
      .menu>li:hover .sub-menu {
        transform: scale(1);
      }
      h1
      {
      font-family: cursive;
      text-align: center;
      color:yellow;
      font-size: 30px
      
      
      }
      
      
    .sidebar {
  height: 100%;
  width: 200px;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #111;
  overflow-x: hidden;
  padding-top: 16px;
}

.sidebar a {
  padding: 6px 8px 6px 16px;
  text-decoration: none;
  font-size: 20px;
  color: #818181;
  display: block;
}

.sidebar a:hover {
  color: #f1f1f1;
}

.main {
  margin-left: 160px; /* Same as the width of the sidenav */
  padding: 0px 10px;
}

@media screen and (max-height: 450px) {
  .sidebar {padding-top: 15px;}
  .sidebar a {font-size: 18px;}
}
.btn-container {
	text-align: right;
}

.btn-container a {
	text-decoration: none;
	padding: 20px 25px;
	margin: 10px;
	background-color: blue;
	color: #fff;
	border-radius: 3px;
	transition: background-color 0.3s ease;
}

.btn-container a:hover {
	background-color: #0056b3;
}
    </style>
  </head>
  <body>
  <div class="sidebar">
  <a href="#Home.jsp"><i class="fa fa-fw fa-home"></i> Home</a>
  <a href="#FacultySection.jsp"><i class="fa fa-fw fa-wrench"></i>Faculty Section</a>
  <a href="Help.jsp"><i class="fa fa-fw fa-user"></i> Help</a>
  <a href="ContactUs.jsp"><i class="fa fa-fw fa-envelope"></i> Contact Us</a>
  
</div>
  <h1><b>FACULTY UPDATE SECTION</b></h1><br><br><br><br>
  <div class="container">
    <nav>
    
      <ul class="menu">
        <li>
          Home 
          <ul class="sub-menu">
            <li><a href="FacultyAdd.jsp">Faculty Add</a></li>
            <li><a href="FacultyView.jsp">Faculty View</a></li>
            <li><a href="FacultyDelete.jsp">Faculty Delete</a></li>
            <li><a href="Home.jsp">Home Page</a></li>
           
          </ul>
        </li>
        <li>
          Personal Info
          <ul class="sub-menu">
           <li>
             <a href="UpdateFacultyName.jsp"> Name</a>
           </li>
           
           <li> <a href="UpdateFacultyContact.jsp" >Contact </a></li>
      
            
          </ul>
        </li>
        <li>
Official Info
          <ul class="sub-menu">
            <li><a href="UpdateFacultyQualification.jsp">Qualification</a></li>
               <li><a href="UpdateFacultyDesignation.jsp" >Designation</a></li>
           
         
            <li><a href="UpdateFacultySalary.jsp" >Salary</a></li>
         
           
          </ul>
        </li>
              <li>
Credentials Info
          <ul class="sub-menu">
            
              <li><a href="UpdateFacultyEmail.jsp">Email</a></li>
            <li> <a href="UpdateFacultyPassword.jsp">Password</a></li>
           
         
           
          </ul>
        </li>
       
    </nav><br><br><br><br><br>
    </div>
     <div class="btn-container">
				<a href="StudentSection.jsp"><b>Back</b></a>
				
        </div>
  </body>
</html>