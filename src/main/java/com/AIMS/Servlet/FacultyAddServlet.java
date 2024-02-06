package com.AIMS.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.AIMS.Dao.DatabaseConnectivity;

/**
 * Servlet implementation class FacultyAddServlet
 */
public class FacultyAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyAddServlet() {
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
		String name=request.getParameter("name");
		String aicteId=request.getParameter("id");
		String dob=request.getParameter("dob");
		String doj=request.getParameter("doj");
		String email=request.getParameter("email");
		String designation=request.getParameter("designation");
		String qualificaion=request.getParameter("qualification");
	
		String password=request.getParameter("password");
		String contact=request.getParameter("contact");
		String salary=request.getParameter("salary");
		
		int status=DatabaseConnectivity.facultyAdd(aicteId, name, dob, doj, designation, qualificaion, email, contact, salary, password);
		if(status>0)
		{
			response.sendRedirect("ShowMessage1.jsp");
			
		}
		else
		{
			response.sendRedirect("FacultyAddError.jsp");
		}
	}

}
