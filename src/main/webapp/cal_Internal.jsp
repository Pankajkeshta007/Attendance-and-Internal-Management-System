<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
 <title>Internal Assessment Calculator</title>
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
            text-size:30px;
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

</style>
</head>
<body>

 <form action="cal_Internal.jsp">
 
        <div class="mainContainer">
  
    <h3><center> Calculate Student Internal</center></h3>
    <table>
        <tr>
            <td>Attendance (%):</td>
            <td><input type="number" name="attendance" min="0" max="100" step="1" required></td>
        </tr>
        <tr>
            <td>MST 1 Marks(30):</td>
            <td><input type="number" name="mst1" min="0" max="30" step="1" required></td>
        </tr>
        <tr>
            <td>MST 2 Marks(30):</td>
            <td><input type="number" name="mst2" min="0" max="30" step="1" required></td>
        </tr>
        <tr>
            <td>Quiz Marks(4):</td>
            <td><input type="number" name="quiz" min="0" max="4" step="1" required></td>
        </tr>
        <tr>
            <td>Assignment Marks(12):</td>
            <td><input type="number" name="assignment" min="0" max="12" step="1" required></td>
        </tr>
    </table>
    <div class="subcontainer">
               
            <button type="submit" value="Calculate_internal">Calculate Internal</button><br><br>
            
            <br><br>
          
        </div>
     
    

  

<%
    if (request.getParameter("attendance") != null) {
        double attendance = Double.parseDouble(request.getParameter("attendance"));
        double mst1 = Double.parseDouble(request.getParameter("mst1"));
        double mst2 = Double.parseDouble(request.getParameter("mst2"));
        double quiz = Double.parseDouble(request.getParameter("quiz"));
        double assignment = Double.parseDouble(request.getParameter("assignment"));

        
        
        double attendance_internal=0;
        if(attendance<75)
       	 attendance_internal=0;
        else if(attendance>=75 && attendance<=80)
       	 attendance_internal=1;
        else if(attendance>80 && attendance<=85)
       	 attendance_internal=2;
        else if(attendance>85 && attendance<=90)
       	 attendance_internal=3;
        else if(attendance>90 && attendance<=100)
       	 attendance_internal=4;
        
        double mid1Internal=mst1/3;
        double mid2Internal=mst2/3;
        double midTermAverage = mid1Internal + mid2Internal;

        // Calculate total internal marks out of 40
        double totalInternalMarks = attendance_internal + midTermAverage + quiz + assignment;

        // Display the total internal marks
       // document.getElementById("totalMarks").innerHTML = "Total Internal Marks: " + totalInternalMarks.toFixed(2);

        out.println("<h3>Total Internal Calculated : " + totalInternalMarks + "</h3>");
    }
%>
</form>
</div>
<%
String stu_id=session.getAttribute("stuId").toString();
session.setAttribute("student_id", stu_id);
String sub_id=session.getAttribute("subId").toString();
session.setAttribute("subject_id", sub_id);
%>
<form action="Store_cal_internal" method="post">
         <b>Enter Internal marks: </b> <input type="text" name="marks_obtained" placeholder="Enter the Calculated Internal">
           <button type="submit"  value="add_internal">Add Internal</button>
            <button type="submit" formaction="Add_Internal.jsp">Back</button>
            </form>


<div class="ftr">

          <strong><span> &#169 Copyright, Created By ABVGIET Students</span></strong>

        </div>
            
    </footer>

</body>
</html>