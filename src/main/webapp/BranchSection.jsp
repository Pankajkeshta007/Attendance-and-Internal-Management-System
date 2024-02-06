<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Branch Section</title>
<style>
body{

background-color: cyan;
}
  .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: gray;
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
            border-radius: 10px;
        }

        h1 {
        text-align:center;
            color:yellow;
            font-family: monospace;
            font-size: 30px;
        }

        .button-container {
           
        margin: 80px auto;
        text-align: center;
        width: 100%;
        position: relative;
      
        }

        .button {
            width: 250px;
            height: 20px;
            background-color: #007BFF;
            color: #fff;
            border: none;
            border-radius: 50px;
            font-size: 16px;
            text-decoration: none;
            display: flex;
            justify-content: center;
            align-items: center;
            transition: background-color 0.3s;
        }

        
         .button {
        padding: 15px 100px;
        margin: 10px 4px;
        color: #ffffff;
        font-family: sans-serif;
        text-transform: uppercase;
        text-align: center;
        position: relative;
        text-decoration: none;
        display: inline-block;
        border: 1px solid;
      }
      .button::before {
        content: "";
        position: absolute;
        top: 0;
        left: 0;
        display: block;
        width: 100%;
        height: 100%;
        z-index: -1;
        -webkit-transform: scaleY(0.1);
        transform: scaleY(0.1);
        transition: all 0.4s;
      }
      .button:hover {
        color: #b414ba;
      }
      
      .button:hover::before {
        opacity: 1;
        background-color: #f7c2f9;
        -webkit-transform: scaleY(1);
        transform: scaleY(1);
        transition: -webkit-transform 0.6s cubic-bezier(0.08, 0.35, 0.13, 1.02), opacity 0.4s;
        transition: transform 0.6s cubic-bezier(0.08, 0.35, 0.13, 1.02), opacity;
      }
      button {
        display: inline-block;
        background-color: #7b38d8;
        border-radius: 10px;
        border: 4px double #cccccc;
        color: #ffffff;
        text-align: center;
        font-size: 28px;
        padding: 20px;
        width: 200px;
        transition: all 0.5s;
        cursor: pointer;
        margin: 5px;
      }
      .button span {
        cursor: pointer;
        display: inline-block;
        position: relative;
        transition: 0.5s;
      }
      .button span:after {
        content: '\00bb';
        position: absolute;
        opacity: 0;
        top: 0;
        right: -20px;
        transition: 0.5s;
      }
      .button:hover {
        background-color: #f7c2f9;
      }
      .button:hover span {
        padding-right: 25px;
      }
      .button:hover span:after {
        opacity: 1;
        right: 0;
      }
</style>
</head>
<body>


   <div class="clearfix"></div><br><br>
<div class="container">
     <h1>BRANCH SECTION</h1>
        <div class="button-container">
            <a class="button" href="BranchAdd.jsp"><span>ADD BRANCH</span></a>
            
            <a class="button" href="BranchViewServlet"><span>VIEW BRANCH</span></a>
            
            <a class="button" href="BranchDelete.jsp"><span>DELETE BRANCH</span></a>
            <a class="button" href="Home.jsp"><span>LOGOUT</span></a>
            
            
        </div>
    </div>
      
</body>
</html>