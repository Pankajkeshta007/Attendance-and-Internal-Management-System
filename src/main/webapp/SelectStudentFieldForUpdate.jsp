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
      
      max-width: 700px;
      max-height:700px;
	margin: 0 auto;
	padding: 40px;
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
  <a href="#StudentSection.jsp"><i class="fa fa-fw fa-wrench"></i>Student Section</a>
  <a href="Help.jsp"><i class="fa fa-fw fa-user"></i> Help</a>
  <a href="ContactUs.jsp"><i class="fa fa-fw fa-envelope"></i> Contact Us</a>
  
</div>
  <h1><b>STUDENT UPDATE SECTION</b></h1><br><br><br><br>
  <div class="container">
    <nav>
    
      <ul class="menu">
        <li>
          Home 
          <ul class="sub-menu">
            <li><a href="StudentAdd.jsp">Student Add</a></li>
            <li><a href="StudentView.jsp">Student View</a></li>
            <li><a href="StudentDelete.jsp">Student Delete</a></li>
            <li><a href="Home.jsp">Home Page</a></li>
           
          </ul>
        </li>
        <li>
          Personal Info
          <ul class="sub-menu">
           <li>
             <a href="UpdateStudentFName.jsp">First Name</a>
           </li>
            <li><a href="StudentUpdateLName.jsp">Last Name</a></li>
           <li> <a href="StudentUpdateDOB.jsp" >Date Of Birth</a></li>
          <li><a href="UpdateStudentFatherName.jsp" >Father Name</a></li>
           <li><a href="UpdateStudentAddress.jsp" >Address</a></li>
            
          </ul>
        </li>
        <li>
Colleg Info
          <ul class="sub-menu">
           
            <li> <a href="UpdateStudentSemester.jsp">Semester</a></li>
            <li><a href="UpdateStudent12per.jsp" >12th Percentage</a></li>
           <li><a href="UpdateStudentBatch.jsp" >Batch</a></li>
              <li><a href="UpdateStudentLateralEntry.jsp" >Lateral Entry</a></li>
            <li><a href="updateStudentDOA.jsp" >Date Of Admission</a></li>
           
          </ul>
        </li>
        <li>
          Credentials Info
          <ul class="sub-menu">
           <li><a href="UpdateStudentContact.jsp" >Contact</a></li>
            <li><a href="UpdateStudentPassword.jsp">Password</a></li>
          <li><a href="UpdateStudentEmail.jsp">Email</a></li>
           
           
          </ul>
        </li>
        
      </ul>
     
    </nav><br><br><br><br><br>
    </div>
     <div class="btn-container">
				<a href="StudentSection.jsp"><b>Back</b></a>
				
        </div>
  </body>
</html>