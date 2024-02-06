package com.AIMS.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.AIMS.Dao.DatabaseConnectivity;
import com.AIMS.Dao.StudentData;

/**
 * Servlet implementation class StudentLoginServlet1
 */
public class StudentLoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentLoginServlet1() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("studentid");
		long studentid=Long.parseLong(id);
		String password=request.getParameter("password");
		
		boolean status=DatabaseConnectivity.studentValidate( studentid, password);
		if(status)
		{
			StudentData data=DatabaseConnectivity.studentDisplay(studentid,password);
			
			
			/*data.setName(data.getName());
			data.setEmail(data.getEmail());
			data.setUsername(data.getUsername());
			data.setPassword(data.getPassword());
			data.setEmail(data.getEmail());
			
			*/
			
			
			
			request.setAttribute("data", data);
			
		    
		     request.getRequestDispatcher("StudentDashboard.jsp").forward(request,response);
		
			
		}
		else
		{
			response.sendRedirect("StudentLoginFailed.jsp");
		}
	}

}
