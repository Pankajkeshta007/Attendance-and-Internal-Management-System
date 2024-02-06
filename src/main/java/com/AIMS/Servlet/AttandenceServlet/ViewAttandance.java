package com.AIMS.Servlet.AttandenceServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.AIMS.Dao.DatabaseConnectivity;

/**
 * Servlet implementation class ViewAttandance
 */
public class ViewAttandance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAttandance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        HttpSession session=req.getSession();
        Object semStrValue=session.getAttribute("semesterOne");
        String semStrValueOne=String.valueOf(semStrValue);
        System.out.println(semStrValueOne);
       /* Object branchStrValueOne=session.getAttribute("branchIdValue");
        String branchStrValue=String.valueOf(branchStrValueOne);
        int branchVal=Integer.parseInt(branchStrValue);*/
        System.out.println("ssssd");
        int sem=Integer.parseInt(semStrValueOne);
        System.out.println(sem);
        String subJectStrValue=req.getParameter("Subject");
        String AYStringValue=req.getParameter("AY");
       // int AY=Integer.parseInt(AYStringValue);
        System.out.println("ssssd1");
        try{
            String htmlTable = "<html>\n" +
                    "<head>\n" +
                    "<title>View Attendance</title>\n" +
                    " <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"img/favicon.png\">\n" +
                    "                <!-- Place favicon.ico in the root directory -->\n" +
                    "\n" +
                    "                <!-- CSS here -->\n" +
                    "                <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/bootstrap.min.css\">\n" +
                    "                <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/owl.carousel.min.css\">\n" +
                    "                <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/magnific-popup.css\">\n" +
                    "                <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/font-awesome.min.css\">\n" +
                    "                <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/themify-icons.css\">\n" +
                    "                <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/nice-select.css\">\n" +
                    "                <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/flaticon.css\">\n" +
                    "                <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/animate.css\">\n" +
                    "                <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/slicknav.css\">\n"+
                    "<style>\n" +
                    "body {\n" +
                    "  font-family:sans-serif;\n" +
                    "  background: -webkit-linear-gradient(to right, #155799, #159957);\n" +
                    "  background: linear-gradient(to right, #155799, #159957);\n" +
                    "  color:whitesmoke;"+
                    "}\n" +
                    "h1 {\n" +
                    "  text-align: center;\n" +
                    "  color: whitesmoke;\n" +
                    "}\n" +" .button {\n" +
                    "        background-color: #007BFF;\n" +
                    "        color: #fff;\n" +
                    "        padding: 10px 20px;\n" +
                    "        border: none;\n" +
                    "        border-radius: 3px;\n" +
                    "        cursor: pointer;\n" +
                    "        margin-top: 15px;\n" +
                    "    }"+
                    ".button-container{" +
                    " text-align: center;\n" +
                    "margin-top: 15px;"+
                    "}\n"+
                    "table {\n" +
                    "  width: 60%;\n" +
                    "  border-collapse: collapse;\n" +
                    "  margin: 20px auto;\n" +
                    "}\n" +
                    "th, td {\n" +
                    "  padding: 10px;\n" +
                    "  text-align: center;\n" +
                    "  border: 1px solid #ddd;\n" +
                    "  background-color: #f2f2f2;\n" +"color: black;"+
                    "}\n" +
                    "th {\n" +
                    "  background-color: #007BFF;\n" +
                    "  color: white;\n" +
                    "}\n" +
                    "tr:nth-child(even){\n" +
                    "  background-color: #f9f9f9;\n" +
                    "}\n" +
                    "tr:hover {\n" +
                    "  background-color: #f2f2f2;\n" +
                    "}\n" +
                    "input[type='radio'] {\n" +
                    "  margin: 0 auto;\n" +
                    "}\n" +
                    "</style> \n" +
                    "</head>" +
                    "<body>\n" +"<header>\n" +
                    "            <div class=\"header-area \">\n" +
                    "                <div id=\"sticky-header\" class=\"main-header-area\">\n" +
                    "                    <div class=\"container-fluid p-0\">\n" +
                    "                        <nav class=\"navbar navbar-expand-lg navbar-light \">\n" +
                    "      <a class=\"navbar-brand\" href=\"#\"><img src=\"https://diplomajobs.co/wp-content/uploads/2023/01/unnamed.png\" height=\"100px\" alt=\" \"></a>\n" +
                    "      <div class=\"collapse navbar-collapse align-items-middle text-white justify-content-center\" id=\"navbarNavAltMarkup\">\n" +
                    "        <div class=\"col-md-12\">\n" +
                    "            <h1 style=\"color: #000;\" class=\"text-center\"><b>Attendance & Internal Management System</b></h1>\n" +
                    "        </div>\n" +
                    "      </div>\n" +
                    "      <a class=\"navbar-brand justify-content-end\" href=\"#\"><img src=\"https://media.9curry.com/uploads/organization/image/2794/hptu-logo.png\" height=\"100px\" alt=\" \"></a>\n" +
                    "    </nav>\n" +
                    "\n" +
                    "                        <div class=\"col-12\">\n" +
                    "                            <div class=\"mobile_menu d-block d-lg-none\"></div>\n" +
                    "                        </div>\n" +
                    "                    </div>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "        </header>\n" +
                    "        <br>\n"+"<form action=\"submitAttendanceDialog.jsp\" method=\"get\">"+
                    "<h1>View Student Attendance</h1>\n" +
                    "<table id=\"doctorTable\">\n" +
                    "<thead>\n" +
                    "<tr>\n" +
                    "<th>Student Roll No</th>\n" +
                    "<th>Name</th>\n" +
                    "<th>Attandance Ratio</th>\n" +
                    "</tr>\n" +
                    "</thead>\n" +
                    "<tbody>\n";
            System.out.println("ssssd2");
            String subject_Id="";
            long student_Id=0;
            String percentage="";
            String student_Name="";
            System.out.println("Query executed");
            PreparedStatement stmt = DatabaseConnectivity.getcon().prepareStatement("Select Subject_Id from Subject WHERE Subject_Name='" + subJectStrValue + "'");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                subject_Id = resultSet.getString("subject_id");
            }
            System.out.println(subject_Id);
            System.out.println("Query executed One");

            PreparedStatement stmttwo = DatabaseConnectivity.getcon().prepareStatement("Select * from Student WHERE Semester= " + sem );
            ResultSet resultSetOne = stmttwo.executeQuery();
            System.out.println("Query executed Two");
            while (resultSetOne.next()) {
                student_Id = resultSetOne.getLong("StudentId");
                System.out.println(student_Id);

                PreparedStatement stmtthree = DatabaseConnectivity.getcon().prepareStatement("Select * from Student WHERE studentId=" + student_Id);
                ResultSet resultSetTwo = stmtthree.executeQuery();

                while (resultSetTwo.next()) {
                    student_Name = resultSetTwo.getString(2);
                }
                System.out.println("Query executed Three");

                //SELECT CONCAT ( (SELECT COUNT(*) FROM ATTANDANCE WHERE STUDENT_ID=20010201001 AND ATTANDANCE_STATUS='present'), '/' , (SELECT COUNT(*) FROM ATTANDANCE WHERE STUDENT_ID=20010201001)) AS requiredAttend FROM ATTANDANCE;
                String query="SELECT CONCAT ((SELECT COUNT(*) FROM Attandance WHERE Subject_Id='"+subject_Id+"' AND student_id= "+student_Id+" AND Academic_Year="+AYStringValue+" AND Attandance_Status='present'), '/', " + "(SELECT COUNT(*) FROM Attandance WHERE subject_id='"+subject_Id+"' AND student_id= "+student_Id+" )) AS requiredAttend FROM Attandance";
               // String query = "SELECT FORMAT ((COUNT(*) * 100.0 / (SELECT COUNT(*) FROM attandance WHERE Subject_Id='" + subject_Id + "' AND Student_Id= " + student_Id + " AND Academic_Year= "+AY+")),1 ) FROM attandance AS percentage_present WHERE Attandance_Status ='present' AND Subject_Id='" + subject_Id + "' AND StudentId=" + student_Id + " AND Academic_Year= "+AY;
                System.out.println(query);
                System.out.println("Query executed four");

                PreparedStatement stmtFour = DatabaseConnectivity.getcon().prepareStatement(query);
                System.out.println("Query executed five");
                ResultSet resultSetThree = stmtFour.executeQuery();
                System.out.println("Query executed six");

                while (resultSetThree.next()) {
                    percentage = resultSetThree.getString("requiredAttend");
                }
                System.out.println("Query executed seven");
                htmlTable += "<tr>\n" +
                        "<td>" + student_Id + "</td>\n" +
                        "<td>" + student_Name + "</td>\n" +
                        "<td>" + percentage + "</td>\n" +
                        "</tr>\n";
                System.out.println("Query executed eight ");
            }
            // Move the table-related code outside of the loop
            htmlTable += "</tbody>\n" +
                    "</table>\n" +" <div class=\"button-container\">"+
                    "<button type=\"button\" onclick=\"window.location.href='ViewAttandancePageOne.jsp'\" class=\"button\">Back</button>" +
                    "</div>"+"</form>" +"<br>"+"<br>"+"<br>"+"<br>"+"<br>"+"<div>"+
                    "<footer id=\"footer\" style=\"min-height: 3.5rem;\"class=\"bg-dark p-2 text-center align-items-middle  text-white\">\n" +
                    "             <div>\n" +
                    "            <strong><span>Powered By ABVGIET Students</span></strong>\n" +
                    "            </div>\n" +
                    "            </footer>"+
                    "</body>\n" +
                    "</html>";
            System.out.println("Query executed nine");
            System.out.println("ssssd4");
            out.println(htmlTable);
        } catch (Exception e) {
            // Handle exception
            e.printStackTrace();
        }
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
