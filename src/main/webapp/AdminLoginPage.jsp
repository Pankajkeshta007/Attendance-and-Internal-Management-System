<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">

    <title>Admin Login</title>
    <style>
        html, body {
      display: flex;
      justify-content: center;
      font-family: Roboto, Arial, sans-serif;
      font-size: 15px;
      
      }
      form {
      border: 5px solid #f1f1f1;
      }
      input[type=text], input[type=password] {
      width: 100%;
      padding: 16px 8px;
      margin: 8px 0;
      display: inline-block;
      border: 1px solid #ccc;
      box-sizing: border-box;
      }
      .icon {
      font-size: 110px;
      display: flex;
      justify-content: center;
      color: #4286f4;
      }
      button {
      background-color: #4286f4;
      color: white;
      padding: 14px 0;
      margin: 10px 0;
      border: none;
      cursor: grab;
      width: 48%;
      }
      h1 {
      text-align:center;
      fone-size:18;
      }
      button:hover {
      opacity: 0.8;
      }
      .formcontainer {
      text-align: center;
      margin: 24px 50px 12px;
      
      }
      .container {
      padding: 16px 0;
      text-align:left;
      }
      span.psw {
      float: center;
      padding-top: 0;
      padding-right: 15px;
      }
      /* Change styles for span on extra small screens */
      @media screen and (max-width: 300px) {
      span.psw {
      display: block;
      float: none;
      }
    </style>
</head>
<body>
 
 
     <form action="AdminLoginServtel" method="post">
      <h1>LOGIN HERE</h1>
      <div class="icon">
        <i class="fas fa-user-circle"></i>
      </div>
      <div class="formcontainer">
      <div class="container">
        <label for="uname"><strong>Username</strong></label>
        <input type="text" placeholder="Enter Username" name="username" required>
      
        <label for="psw"><strong>Password</strong></label>
        <input type="password" placeholder="Enter Password" name="password" required>
      </div>
      <button type="submit"><strong>LOGIN</strong></button>
      <div class="container" style="background-color: #eee">
        
        <span class="psw">Don't have an account?<a href="AdminRegister.jsp">Register</a></span>
      </div>
    
     
    </form>

      
</body>
</html>
