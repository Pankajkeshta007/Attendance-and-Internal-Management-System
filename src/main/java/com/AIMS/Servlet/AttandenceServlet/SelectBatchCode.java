package com.AIMS.Servlet.AttandenceServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class SelectBatchCode
 */
public class SelectBatchCode extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectBatchCode() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

    private static final String URL = "jdbc:mysql://localhost:3306/aims";
    private static final String USER = "root";
    private static final String PASSWORD = "12345";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String subject_id = request.getParameter("subject_id");

         
        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT student_id,subject_id, marks_obtained FROM student_internal WHERE subject_id = ?");
            preparedStatement.setString(1, subject_id);

            ResultSet resultSet = preparedStatement.executeQuery();

            response.setContentType("text/html");
            response.getWriter().println("<html>");
            response.getWriter().println("<head>");
            response.getWriter().println("<title>Internal PF</title>");
           response.getWriter().println("<style>  table {  width: 70%; ; margin: 20px auto; background-color:white; } th, td { border: 2px solid #dddddd;     text-align: left      padding: 8px;}   th {     background-color: yellow;   }  body { background-color:gray; } h1 { text-align:center; color:blue;  }  button { margin-top:50px; margin-left:450px; background-color:black; color:Yellow; height:40px; width:150px; } .mainContainer{  padding: 16px; }  form{   width:35rem;         padding: 20px 25px; margin-top:30px; }  </style>");
            response.getWriter().println("</head>");
            response.getWriter().println("<body>");
            response.getWriter().println("<h1>Internal Assesment for Subject Code: " + subject_id + "</h1>");
            response.getWriter().println("<table border='2'>");
            response.getWriter().println("<tr><th>Student ID</th><th>Subject Code</th><th>Internal Marks</th></tr>");

           
        //  if(resultSet.next())
           // {
            	while(resultSet.next()) 
            	{
            	
                Long student_id= resultSet.getLong("student_id");
                int marks_obtained = resultSet.getInt("marks_obtained");
                String subject_id1=resultSet.getString("subject_id");

                response.getWriter().println("<tr>");
                response.getWriter().println("<td>" + student_id + "</td>");
                
                response.getWriter().println("<td>" + subject_id1 + "</td>");
                response.getWriter().println("<td>" + marks_obtained + "</td>");
                response.getWriter().println("</tr>");
            	}
            	response.getWriter().println("</table>");
            response.getWriter().println("<form> <div class=\"mainContainer\"> <button type=\"submit\" values=\"Save as Excel Sheet\">Save as Excel Sheet</button>  <button type=\"submit\" formaction=\"Student_Code_select2.jsp\">Back</button> </div>\r\n </form>");
            
            
            response.getWriter().println("</body>");
            response.getWriter().println("</html>");
            	 
           /*	} 
            else    
        	{
          
            		response.sendRedirect("ErrorInViewInternal.jsp");
            		}*/
        }
        catch (Exception e)
        {
        	
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    

    }
}
