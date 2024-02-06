<%@ page import="java.sql.*" import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html lang="en">
<head>
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
                             font-family: Arial, sans-serif;\n
                             background-color: #f0f0f0;\n
                              text-align: center;
                             background-color: lightblue;
                            }
                            h1 {
                            text-align: center;
                             color: white;
                             font-style: bold;
                            }
                           .button {
                            background-color: #007BFF;
                           color: #fff;
                           padding: 10px 20px;
                            border: none;
                            border-radius: 3px;
                            cursor: pointer;
                            margin-top: 15px;
                            text-align: center;
                            display: block;
                            margin: 0 auto
                            }
                            table {width: 60%;
                            border-collapse: collapse;
                             margin: 20px auto;
                             }
                            th, td {
                             padding: 10px;
                             text-align: center;
                             border: 1px solid #ddd;
                             background-color: #f2f2f2;
                            }
                            th {
                             background-color: #007BFF;
                            color: white;
                            }
                            tr:nth-child(even){
                            background-color: #f9f9f9;
                            }
                            tr:hover {
                            background-color: #f2f2f2;
                            }


       </style>
    <!-- your style and head content -->
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
    <h1>View Student Attendance</h1>
    <form>
    <table id="doctorTable">
        <thead>
            <tr>
                <th>Subject_Name </th>
                <th>Attendance Percentage </th>
            </tr>
        </thead>
        <tbody>
        <% 
        String stu_id=session.getAttribute("stuId").toString();
session.setAttribute("student_id", stu_id);
Long student_id=Long.parseLong(stu_id);
%>
            <%
                int sem = 0;
                String Subject_Name = "";
                String Subject_Id = "";
                double percentage = 0.00;
                int branch_id=0;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");

                    PreparedStatement stmtOne = conn.prepareStatement("Select * from student WHERE studentId="+student_id);                  
                    ResultSet resultSetOne = stmtOne.executeQuery();

                    while (resultSetOne.next()) {
                        sem = resultSetOne.getInt("Semester");
                        branch_id=resultSetOne.getInt("branch_id");
                    }

                    PreparedStatement stmtTwo = conn.prepareStatement("Select * from subject WHERE Semester=" + sem +" AND branch_id="+branch_id);
                    ResultSet resultSetTwo = stmtTwo.executeQuery();

                    while (resultSetTwo.next()) {
                        Subject_Name = resultSetTwo.getString("subject_name");
                        Subject_Id = resultSetTwo.getString("subject_id");

                        PreparedStatement stmtThree = conn.prepareStatement("SELECT FORMAT ((COUNT(*) * 100.0 / (SELECT COUNT(*) FROM attandance WHERE subject_id='" + Subject_Id + "' AND student_id="+student_id+" )),1 ) FROM attandance AS percentage_present WHERE Attandance_Status ='present' AND subject_id='" + Subject_Id + "' AND student_id="+student_id);

                        ResultSet resultSetThree = stmtThree.executeQuery();

                        while (resultSetThree.next()) {
                            percentage = resultSetThree.getDouble(1);
                            %>
                            <tr>
                                <td><%= Subject_Name %></td>
                                <td><%= percentage %></td>
                            </tr>
                            <%
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace(); // This will help you identify any exceptions that occur during execution
                }
            %>
        </tbody>
    </table>
    </form>
    <button type="button"  onclick="window.location.href='StudentLogin.jsp'" class="button">Back</button>
   <br>
   <br>
   <br>
   <br>
       <footer id="footer" style="min-height: 3.5rem;"class="bg-dark p-2 text-center align-items-middle  text-white">
                                 <div>
                                   <strong><span>Powered By ABVGIET Students</span></strong>
                                 </div>
                             </footer>
                         </body>
</body>
</html>
