<%@ page import="java.sql.*" import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Displaying Attendance</title>
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
               font-family:sans-serif;
               background: -webkit-linear-gradient(to right, #155799, #159957);
               background: linear-gradient(to right, #155799, #159957);
               color:whitesmoke;
           }

           h2 {
               color: whitesmoke;
           }

           label {
               display: block;
               margin-bottom: 5px;
           }
           form {
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


           select, button, input {
               padding: 10px;
               margin: 5px;
               width: 200px;
               box-sizing: border-box;
               border-radius: 5px;
           }

           table {
               border-collapse: collapse;
               width: 100%;
               margin-top: 20px;
           }

           th, td {
               border: 1px solid #dddddd;
               text-align: left;
               padding: 8px;
           }

           th {
               background-color: #f2f2f2;
           }

           input[type="submit"] {
               background-color: #4caf50;
               color: white;
               cursor: pointer;
           }

           input[type="submit"],.button:hover {
               background-color: #45a049;
           }
       </style>
</head>
<body>
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
        <br>
<form action="ViewAttandance" method="GET">
<h2 align=center>View Attendance</h2>


        <label for="Subject">Select Subject:</label>
            <select id="Subject" name="Subject">
        <%
        String semesterOne=request.getParameter("semester");
        System.out.println(semesterOne);
        int sem=Integer.parseInt(semesterOne);
        session.setAttribute("semesterOne", semesterOne);
        String branchName=request.getParameter("Branch");
        int branchOriginalId=0;
        String subjectId="";
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
                       PreparedStatement stmtone=conn.prepareStatement("Select * from branch Where branch_name='"+branchName+"'");
                        ResultSet rsOne=stmtone.executeQuery();
                        while(rsOne.next())
                        {

                        branchOriginalId=rsOne.getInt("Branch_Id");
                        Statement stmtTwo = conn.createStatement();
                        ResultSet rs = stmtTwo.executeQuery("SELECT subject_id, subject_name FROM subject WHERE branch_id="+branchOriginalId+ " AND Semester="+sem);

                        while (rs.next()) {
                             subjectId=rs.getString("subject_id");
                            String Subject_Name = rs.getString("subject_name");
                            out.println("<option value='" + Subject_Name +"'>"+Subject_Name+"</option>");
                            System.out.println("skjdhvdf");
                        }
                    }
                    String branchIdValue=String.valueOf(branchOriginalId);
                    System.out.println(branchIdValue);
                    session.setAttribute(branchIdValue,"branchIdValue");
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }

                %>
            </select>
            <label for="AY">Select Academic Year:</label>
                <select id="AY" name="AY">
                    <option value="2023">2023</option>
                    <option value="2024">2024</option>
                    <option value="2025">2025</option>
                    <option value="2026">2026</option>
                    <option value="2027">2027</option>
                    <option value="2028">2028</option>
                    <option value="2029">2029</option>
                    <!-- Add more options for other academic years -->
                </select>
            <br>
            <br>
                <input type="submit" value="View Attandance">
                 <button type="button" onclick="window.location.href='ViewAttandancePageOne.jsp'" class="button">Back</button>
            </form>
            <br>
            <br>
            <footer id="footer" style="min-height: 3.5rem;"class="bg-dark p-2 text-center align-items-middle  text-white">
             <div>
            <strong><span>Powered By ABVGIET Students</span></strong>
            </div>
            </footer>

            </body>
            </html>