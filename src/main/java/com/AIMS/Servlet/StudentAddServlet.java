package com.AIMS.Servlet;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.AIMS.Dao.DatabaseConnectivity;

/**
 * Servlet implementation class StudentAddServlet
 */
public class StudentAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentAddServlet() {
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
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String dob=request.getParameter("dob");
		String doa=request.getParameter("doa");
		String email=request.getParameter("email");
		String studentId=request.getParameter("studentid");
		String percentage=request.getParameter("percentage");
		String batch=request.getParameter("batch");
		String fatherName=request.getParameter("fathername");
		String lateralEntry=request.getParameter("lateralentry");
		String password=request.getParameter("password");
		String contact=request.getParameter("contact");
		String semester=request.getParameter("semester");
		String branchId=request.getParameter("branchid");
		int branchid=Integer.parseInt(branchId);
		String address=request.getParameter("address");
		int status=DatabaseConnectivity.studentAdd(fname, lname, dob, doa, email, percentage, batch, fatherName, contact, password, studentId, lateralEntry,semester,branchid,address);
		if(status>0)
		{
			response.sendRedirect("ShowMessage.jsp");
			
		}
		else
		{
			response.sendRedirect("Error.jsp");
		}
		
	}

}
