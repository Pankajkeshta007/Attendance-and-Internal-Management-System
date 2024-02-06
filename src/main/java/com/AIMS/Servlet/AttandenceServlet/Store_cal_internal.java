package com.AIMS.Servlet.AttandenceServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Store_cal_internal
 */
public class Store_cal_internal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Store_cal_internal() {
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
	    	 PrintWriter out=response.getWriter();
	       HttpSession httpSession=request.getSession();
	      String id= httpSession.getAttribute("student_id").toString();
	      Long student_id=Long.parseLong(id);
	    
	      String subject_id=httpSession.getAttribute("subject_id").toString();
	       
	        String inTmks=request.getParameter("marks_obtained");
	        int marks_obtained=Integer.parseInt(inTmks);
	        //PrintWriter out=response.getWriter();
	         
	        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
	            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student_internal (student_id, subject_id, marks_obtained) values(?,?,?)");
	            preparedStatement.setLong(1, student_id);
	            preparedStatement.setString(2, subject_id);
	            preparedStatement.setInt(3, marks_obtained);
	       
	           
             
	            int status= preparedStatement.executeUpdate();
	           
	    		if(status>0)
	    		{
	    		
	    			response.sendRedirect("AddSuccessfully.jsp");
	    		}
	    		else
	    		{
	    			out.println("<font color=red size=18>FAILED !! <br> You Have Entered WRONG Batch code or Student id<br>");
	    			out.println("<a href=FacultyLogin.jsp>TRY AGAIN......</a>");
	    		}
	        }
	        catch (Exception e) {
	        	
	            e.printStackTrace();
	            response.getWriter().println("Error: " + e.getMessage());
	        }
	    }

}
