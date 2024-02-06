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
import java.sql.ResultSet;

/**
 * Servlet implementation class SelectBCode_Add_Internal
 */
public class SelectBCode_Add_Internal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectBCode_Add_Internal() {
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
    	String subject_id = request.getParameter("subject_id");
        String studentId=request.getParameter("student_id");
       
        Long student_id=Long.parseLong(studentId);
        HttpSession httpSession=request.getSession();
        httpSession.setAttribute("stuId", student_id);
        httpSession.setAttribute("subId", subject_id);
              
        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            PreparedStatement preparedStatement1 ,ps2;
 
            preparedStatement1 = connection.prepareStatement(" select studentId from student where studentId=?");
         
           ps2=connection.prepareStatement(" select subject_id from subject where subject_id=?");
           preparedStatement1.setLong(1, student_id);
           ps2.setString(1, subject_id);

            ResultSet rs1 , rs2;
            rs1= preparedStatement1.executeQuery();
            rs2=ps2.executeQuery();
           
    		if(rs1.next() && rs2.next())
    		{
    			response.sendRedirect("cal_Internal.jsp");
    			
    		}
    		else
    		{
    			response.sendRedirect("ErrorInEnteringBatchandCode.jsp");
    			
    		}
        }
        catch (Exception e) {
        	
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
        }
    }

}
