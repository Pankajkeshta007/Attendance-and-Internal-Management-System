package com.AIMS.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.AIMS.Dao.AdminRecord;
import com.AIMS.Dao.DatabaseConnectivity;

/**
 * Servlet implementation class AdminLoginServtel
 */
public class AdminLoginServtel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServtel() {
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
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		boolean status=DatabaseConnectivity.adminValidate( username, password);
		if(status)
		{
			AdminRecord data=DatabaseConnectivity.adminDisplay(username,password);
			
			data.setName(data.getName());
			data.setEmail(data.getEmail());
			data.setUsername(data.getUsername());
			data.setPassword(data.getPassword());
			data.setEmail(data.getEmail());
			
			
			
			
			
			request.setAttribute("data", data);
			
		    
		     request.getRequestDispatcher("AdminSection.jsp").forward(request,response);
		
			
		}
		else
		{
			response.sendRedirect("AdminLoginFailed.jsp");
		}
	}
	

}
