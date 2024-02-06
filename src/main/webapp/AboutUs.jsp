<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>About Us</title>
  <style>

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
        }

        h3 {
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

text-size:20px;
color: white-smoke;

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
body 
{
  font-family:sans-serif; 
  background: -webkit-linear-gradient(to right, #155799, #159957);  
  background: linear-gradient(to right, #155799, #159957); 
  color:whitesmoke;
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
    margin-top:30px;
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
  


.contact-container {
  max-width: 800px;
  margin: 50px auto;
  padding: 20px;
  background-color: black;
  border-radius: 8px;
  box-shadow: 0px 0px 10px 0px rgba(0,0,0,0.1);
}

h1, h2 {
 color:Black;
}

.college-info {
  margin-bottom: 40px;
  color:black;
}

.college-info p {
  margin: 8px 0;
  color:black;
}

.map-container {
  text-align: center;
}</style>
</head>
<body>
   
    <div class="logo">
      <a href="#"><img src="https://media.9curry.com/uploads/organization/image/2794/hptu-logo.png" width="90" height="80" ></a>
</div>

<nav> 
     <ul>
        <li></li>
        <li style="margin-left:440px"><a href="Home.jsp">Home</a></li>
        
        
        <li></li>
         <li></li>
         <li style="margin-left:450px;"><img src="https://diplomajobs.co/wp-content/uploads/2023/01/unnamed.png" widht="90" height="80"></li>
        
 

</ul>

</nav>
  <div class="about-container">
    <h1>About Our Team</h1>
    <div class="about-content">
      <p>Welcome to the team behind <strong>Attendance & Internal Management System</strong>. We are a group of passionate individuals dedicated to creating an engaging online platform for our college community.</p>
      
      <h2><center>Team Members</center></h2>
      
      <div class="contact-container">
        <h3>Vinod</h3>
        <p>Role:Database designer</p>
        <p>About Me: A student basically having skills in MySQL, Java</p>
        </div>
        <div class="contact-container">
          <h3>Pankaj</h3>
        <p>Role: Web Developer / Designer</p>
        <p>About Me: A student basically having skills in MySQL, Front-end & Java</p>
        </div >
        <div class="contact-container">
          <h3>Tamanna</h3>
        <p>Role: Web Developer / Designer</p>
        <p>About Me: A student basically having skills in Front-end & Backend</p>
        </div>
        <div class="contact-container">
          <h3>Isha</h3>
        <p>Role: Front End Designer</p>
        <p>About Me:  A student basically having skills in Front-end </p>
        </div>
        <div class="contact-container">
          <h3>Shweta</h3>
        <p>Role:  Designer/ Report writer</p>
        <p>About Me: A student basically having skills in Front-end & Content Writing</p>
      </div>
      
      
      
      <!-- Repeat the above 'member' div structure for each team member -->
      
    </div>
  </div>
          <div class="ftr">
<footer>
          <strong><span> &#169 Copyright, Created By ABVGIET Students</span></strong>

        </div>
            
    </footer>
</body>
</html>