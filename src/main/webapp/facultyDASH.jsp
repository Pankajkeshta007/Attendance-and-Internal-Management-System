<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
margin-left: 6px;


}





  .container {
            max-width:580px;
            margin: 59 auto;
            padding: 20px;
            background-color: light pink;
            color:whitesmoke;
           backdrop-filter: blur(16px) saturate(180%);
          -webkit-backdrop-filter: blur(16px) saturate(180%);
           background-color: rgba(11, 15, 13, 0.582);
             border-radius: 12px;
            border: 1px solid rgba(255, 255, 255, 0.125);
             padding: 20px 25px;
             margin-top:40px;
            
             margin-left:326px;
        }

        h1 {
            color: Yellow;
        }

 .button-container {
            display: flex;
            flex-direction: column;
            align-items: center;
            gap: 32px;
            justify-content:center;
        }


.button {
            width: 269px;
            height: 70px;
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
@charset "UTF-8";
body 
{
  font-family:sans-serif; 
  background: -webkit-linear-gradient(to right, #155799, #159957);  
  background: linear-gradient(to right, #155799, #159957); 
  color:whitesmoke;
}


h1{
    text-align: center;
}


form{
    width:35rem;
    margin: auto;
    color:whitesmoke;
    backdrop-filter: blur(16px) saturate(180%);
    -webkit-backdrop-filter: blur(16px) saturate(180%);
    background-color: rgba(11, 15, 13, 0.582);
    border-radius: 12px;
    border: 1px solid rgba(255, 255, 255, 0.125);
    padding: 20px 25px;
    
}

input[type=text], input[type=password]{
    width: 100%;
    margin: 10px 0;
    border-radius: 5px;
    padding: 15px 18px;
    box-sizing: border-box;
  }

button {
    background-color: #030804;
    color: white;
    padding: 14px 20px;
    border-radius: 5px;
    margin: 7px 0;
    width: 100%;
    font-size: 18px;
  }

button:hover {
    opacity: 0.6;
    cursor: pointer;
}

.headingsContainer{
    text-align: center;
}

.headingsContainer p{
    color: gray;
}
.mainContainer{
    padding: 16px;
}


.subcontainer{
    display: flex;
    flex-direction: row;
    align-items: center;
    justify-content: space-between;
}

.subcontainer a{
    font-size: 16px;
    margin-bottom: 12px;
}

span.forgotpsd a {
    float: right;
    color: whitesmoke;
    padding-top: 16px;
  }

.forgotpsd a{
    color: rgb(74, 146, 235);
  }
  
.forgotpsd a:link{
    text-decoration: none;
  }

  .register{
    color: white;
    text-align: center;
  }
  
  .register a{
    color: rgb(74, 146, 235);
  }
  
  .register a:link{
    text-decoration: none;
  }

  /* Media queries for the responsiveness of the page */
  @media screen and (max-width: 600px) {
    form{
      width: 25rem;
    }
  }
  
  @media screen and (max-width: 400px) {
    form{
      width: 20rem;
    }
  }

</style>
<title>Insert title here</title>

<title></title>
</head>
<body>
<div class="logo">
      <a href="#"><img src="https://media.9curry.com/uploads/organization/image/2794/hptu-logo.png" width="90" height="80" ></a>
</div>

<nav> 
     <ul>
        <li></li>
        <li style="margin-left:98.2px"><a href="#">Home</a></li>
          <li><a href="AboutUs.jsp">About</a></li>    
         <li><a href="ContactUs.jsp">Contact Us</a></li>
         <li><a href="FacultyLogin.jsp">Log Out</a></li>
        
        <li></li>
         <li></li>
         <li style="margin-left:173px;"><img src="https://diplomajobs.co/wp-content/uploads/2023/01/unnamed.png" widht="98" height="83"></li>
        
 

</ul>

</nav>
<div class="container">
     
        <div class="button-container">

            <a class="button" href="MarkAttandenceHome.jsp">STUDENT ATTENDANCE</a>
            
            <a class="button" href="Internal_Options.jsp">STUDENT INTERNAL</a>
                 
            <a class="button" href="FacultyLogin.jsp">BACK</a>
            
            
        </div>
    </div>
  

        <div class="ftr">
<footer>
          <strong><span> &#169 Copyright, Created By ABVGIET Students</span></strong>

        </div>
            
    </footer>
      



</body>
</html>