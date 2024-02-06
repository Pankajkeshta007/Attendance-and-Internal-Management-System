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
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.AIMS.Dao.DatabaseConnectivity;

/**
 * Servlet implementation class Markattendance
 */
public class Markattendance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Markattendance() {
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


        try {
        HttpSession session= req.getSession();
        String branchIdVal = session.getAttribute("branch_StringOne").toString();
        String semValueOne = session.getAttribute("sem_StringOne").toString();
       String subIdVal= req.getParameter("Subject");
       System.out.println(subIdVal);
       session.setAttribute("subIdVal",subIdVal);

        String timeperiodValue=req.getParameter("timeperiod");
        session.setAttribute("timeperiodValue",timeperiodValue);
        String academicYearValue=req.getParameter("AY");
        session.setAttribute("academicYearValue",academicYearValue);
        String sessionValue=req.getParameter("Session");
        session.setAttribute("sessionValue",sessionValue);
        int sessionIntValue;
        String dateValue=req.getParameter("date_of_attandance");
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utildate=dateFormat.parse(dateValue);
        java.sql.Date sqlDate=new java.sql.Date(utildate.getTime());
        //Printing the currentDate
            Calendar calendar=Calendar.getInstance();
            java.util.Date currentDate=calendar.getTime();
            calendar.setTime(currentDate);
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);
            java.sql.Date currentSqlDate=new java.sql.Date(calendar.getTimeInMillis());
            System.out.println(sqlDate);
            System.out.println(currentDate);
            if(sqlDate.equals(currentSqlDate)) {
                session.setAttribute("dateValue", dateValue);


                System.out.println(timeperiodValue);
                System.out.println(academicYearValue);
                System.out.println(sessionValue);
                System.out.println(semValueOne);
                //  System.out.println(dateValue);
                int semValue = Integer.parseInt(semValueOne);
                String semesterValue = String.valueOf(semValue);
                session.setAttribute("semesterValue", semesterValue);
                int branchId = Integer.parseInt(branchIdVal);
                String branchValue = String.valueOf(branchId);
                session.setAttribute("branchValue", branchValue);
                System.out.println(branchId);

                long id = 0;


                String htmlTable = "<html>\n" +
                        "<head>\n" +
                        "<title>Mark Attendance</title>\n" +
                        " <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"img/favicon.png\">\n" +
                        "            <!-- Place favicon.ico in the root directory -->\n" +
                        "\n" +
                        "            <!-- CSS here -->\n" +
                        "            <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/bootstrap.min.css\">\n" +
                        "            <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/owl.carousel.min.css\">\n" +
                        "            <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/magnific-popup.css\">\n" +
                        "            <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/font-awesome.min.css\">\n" +
                        "            <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/themify-icons.css\">\n" +
                        "            <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/nice-select.css\">\n" +
                        "            <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/flaticon.css\">\n" +
                        "            <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/animate.css\">\n" +
                        "            <link rel=\"stylesheet\" href=\"https://smartcookie.in/css/cssfb/slicknav.css\">" +
                        "<style>\n" +
                        "body {\n" +
                        "   font-family:sans-serif;\n" +
                        "               background: -webkit-linear-gradient(to right, #155799, #159957);\n" +
                        "               background: linear-gradient(to right, #155799, #159957);\n" +
                        "               color:whitesmoke;" +
                        "}\n" +
                        "h1 {\n" +
                        "  text-align: center;\n" +
                        "  color: #333;\n" +
                        "}\n" + " .button {\n" +
                        "        background-color: #007BFF;\n" +
                        "        color: #fff;\n" +
                        "        padding: 10px 20px;\n" +
                        "        border: none;\n" +
                        "        border-radius: 3px;\n" +
                        "        cursor: pointer;\n" +
                        "        margin-top: 15px;\n" +
                        "    }" +
                        "table {\n" +
                        "  width: 60%;\n" +
                        "  border-collapse: collapse;\n" +
                        "  margin: 20px auto;\n" +
                        "}\n" +
                        "th, td {\n" +
                        "  padding: 10px;\n" +
                        "  text-align: center;\n" +
                        "  border: 1px solid #ddd;\n" +
                        "  background-color: #f2f2f2;\n" + "color: black;" +
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
                        ".button-container{" +
                        " text-align: center;\n" +
                        "margin-top: 15px;" +
                        "}\n" +
                        "</style> \n" +
                        "</head>" +
                        "<body>\n" + "<header>\n" +
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
                        "        <br>\n" + "<form action=\"submitAttendanceDialog.jsp\" method=\"get\">" +

                        "<table id=\"doctorTable\">\n" +
                        "<thead>\n" +
                        "<tr>\n" +
                        "<th>Student Roll No</th>\n" +
                        "<th>Name</th>\n" +
                        "<th>Status</th>\n" +
                        "</tr>\n" +
                        "</thead>\n" +
                        "<tbody>\n";

                PreparedStatement stmt = DatabaseConnectivity.getcon().prepareStatement("Select studentId,firstName from student WHERE semester=" + semValue + " AND Branch_Id=" + branchId);
                ResultSet resultSet = stmt.executeQuery();

                while (resultSet.next()) {
                    String name = resultSet.getString("firstName");
                    System.out.print(name);
                    id = resultSet.getLong("studentId");
                    htmlTable += "<tr>\n" +
                            "<td>" + id + "</td>\n" +
                            "<td>" + name + "</td>\n" +
                            "<td>\n" +
                            "<!-- Add this hidden input field inside your form -->\n" +
                            "<input type=\"hidden\" id=\"status_" + id + "\" name=\"status\" value=\"\">\n" +
                            "<!-- Modify your radio buttons to set the value to the hidden field -->\n" +
                            "<label for=\"present_" + id + "\">\n" +
                            "    <input type=\"radio\" id=\"present_" + id + "\" name=\"status_" + id + "\" value=\"present\" onclick=\"setStatus('present', " + id + ")\">\n" +
                            "    Present\n" +
                            "</label>\n" +
                            "<label for=\"absent_" + id + "\">\n" +
                            "    <input type=\"radio\" id=\"absent_" + id + "\" name=\"status_" + id + "\" value=\"absent\" onclick=\"setStatus('absent', " + id + ")\">\n" +
                            "    Absent\n" +
                            "</label>\n" +
                            "<!-- Add this JavaScript function to update the hidden field value -->\n" +
                            "<script>\n" +
                            "    function setStatus(value, id) {\n" +
                            "        document.getElementById('status_' + id).value = value;\n" +
                            "    }\n" +
                            "</script>\n" +
                            "</td>\n" +
                            "</tr>\n";
                }
                htmlTable += "</tbody>\n" +
                        "</table>\n" + " <div class=\"button-container\">" +
                        "<input type=\"submit\" value=\"Submit attendance\" class=\"button\"> \n" +
                        "<button type=\"button\" onclick=\"window.location.href='MarkAttandancePageOne.jsp'\" class=\"button\">Back</button>" +
                        "</div>\n" + "</form>" + "<br>" + "<br>" + "<br>" + "<br>" + "<br>" + "<div>" +
                        "                     <footer id=\"footer\" style=\"min-height: 3.5rem;\"class=\"bg-dark p-2 text-center align-items-middle  text-white\">\n" +
                        "                             <div>\n" +
                        "                               <strong><span>Powered By ABVGIET Students</span></strong>\n" +
                        "                             </div>\n" +
                        "                         </footer>" +
                        "</body>\n" +
                        "</html>";
                out.println(htmlTable);

                String attValue = req.getParameter("status");
                session.setAttribute("attvalue", attValue);
                String idValue = String.valueOf(id);
                session.setAttribute("idValue", idValue);
                String sid = String.valueOf(id);
                session.setAttribute("sid", sid);

                System.out.println("Send redirect is going to execute");
            }
           else if(sqlDate.before(currentSqlDate))
            {
                System.out.println("Date is earlier than  current date");
                resp.sendRedirect("EarlierDateSelected.jsp");

            }
            else
            {
                out.println("Date is later than  current date");
                resp.sendRedirect("LaterDateSelected.jsp");
            }
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
