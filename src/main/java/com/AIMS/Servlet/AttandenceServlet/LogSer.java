package com.AIMS.Servlet.AttandenceServlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class LogSer
 */
public class LogSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogSer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  	try {
  		PrintWriter out=response.getWriter();
  		Class.forName("com.mysql.jdbc.Driver");
  		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aims","root","12345");
  		String aicteid=request.getParameter("aicte_id");
  		Long aicte_id=Long.parseLong(aicteid);
  		String password=request.getParameter("password");
  		
  		PreparedStatement ps=con.prepareStatement("select aicte_id from faculty where aicte_id=? and password=?");
  		
  		ps.setLong(1, aicte_id);
  		ps.setString(2, password);
  		ResultSet rs=ps.executeQuery();
  		if(rs.next())
  		{
  			RequestDispatcher rd=request.getRequestDispatcher("facultyDASH.jsp");
  			//response.sendRedirect("facultyDASH.jsp");
  			rd.forward(request, response);
  		}
  		else
  		{
  			//out.println("<font color=red size=18>LOGIN FAILED !! <br> You Have Entered WRONG AICTE ID or PASSWORD<br>");
  			//out.println("<a href=FacultyLogin.jsp>TRY AGAIN......</a>");
  			response.sendRedirect("FacultyErrorLogin.jsp");
  		}
  		
  	} catch (ClassNotFoundException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	} catch (SQLException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
  		
  	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
}
