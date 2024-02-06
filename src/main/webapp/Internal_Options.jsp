<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
@charset "UTF-8";
body
{
margin: 0;
padding:0;
background:#ele8e3;
font-family:sans-serif; 
  background: -webkit-linear-gradient(to right, #155799, #159957);  
  background: linear-gradient(to right, #155799, #159957); 
  color:whitesmoke;
}
nav
{
width: 100%;
overflow: auto;
background: blue;
}

ul{
padding:0;
margin: 0 0 0 250px;
list-style: none;

}

nav
{
width: 100%;
overflow: auto;
background: orange;
}

li
{
float: left;



}

li a {
width: 100px;
display: block;
padding: 32px 22px;
text-decoration: black;

font-family: arial;
color: black;
text-align:center;

}


li a:hover
{
background:red;
text-transform:uppercase;

}


.logo img {
position:absolute;
margin-top:2px;
margin-left: 12px;


}





  .container {
            max-width:580px;
            margin: 59 auto;
            padding: 50px;
            background-color: light pink;
            color:whitesmoke;
           backdrop-filter: blur(16px) saturate(180%);
          -webkit-backdrop-filter: blur(16px) saturate(180%);
           background-color: rgba(11, 15, 13, 0.582);
             border-radius: 12px;
            border: 1px solid rgba(255, 255, 255, 0.125);
             padding: 20px 25px;
             margin-top:100px;
             margin-left:330px;
        }

        h1 {
            color: Yellow;
        }

 .button-container {
            display: flex;
            flex-direction: column;
            align-items: center;
            gap: 32px;
        }


.button {
            width: 269px;
            height: 66px;
            background-color:gray;
            color: yellow;
            border: none;
            border-radius: 50px;
            font-size: 16px;
            text-decoration: none;
            display: flex;
            justify-content: center;
            align-items: center;
            transition: background-color 0.2s;
        }

       .button:hover {
            background-color: red;
        }


p {
text-align:center;
text-size:20px;

}

.ftr {
height:60;
background-color:black;
font-size:20px;
text-align:center;
margin-top:280px;
padding-top:18px;
margin-bottom:2px;
padding-bottom:10px;
}
</style>
<link rel="stylesheet" type="text/css" href="Loginpage.css">
<title></title>
</head>
<body>
<div class="logo">
      <a href="#"><img src="https://media.9curry.com/uploads/organization/image/2794/hptu-logo.png" width="90" height="80" ></a>
</div>

<nav> 
     <ul>
        <li></li>
        <li style="margin-left:101px"><a href="#">Home</a></li>
          <li><a href="AboutUs.jsp">About</a></li>
        
         <li><a href="ContactUs.jsp">Contact Us</a></li>
         <li><a href="FacultyLogin.jsp">LogOut</a></li>
        
        <li></li>
         <li></li>
         <li style="margin-left:172px;"><img src="https://diplomajobs.co/wp-content/uploads/2023/01/unnamed.png" widht="99" height="82"></li>
        
 

</ul>

</nav>
<div class="container">
     
        <div class="button-container">

            <a class="button" href="Student_Code_select2.jsp">VIEW INTERNAL</a>
            
            <a class="button" href="Add_Internal.jsp">ADD INTERNAL</a>
                 
            <a class="button" href="facultyDASH.jsp">BACK</a>
            
            
        </div>
    </div>
  

        <div class="ftr">

          <strong><span>&#169 Copyright, Created By ABVGIET Students</span></strong>

        </div>
            
    </footer>
      

</body>
</html>