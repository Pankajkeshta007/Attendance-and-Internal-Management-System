package com.AIMS.Servlet.SubjectServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.AIMS.Dao.DatabaseConnectivity;

/**
 * Servlet implementation class SubjectAddServlet
 */
public class SubjectAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectAddServlet() {
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
		String subjectCode=request.getParameter("subjectcode");
		String coa=request.getParameter("courseoutcome");
		String subName=request.getParameter("subjectname");
		String ay=request.getParameter("academicyear");
		String session=request.getParameter("session");
		String cr=request.getParameter("credit");
		int credit=Integer.parseInt(cr);
		String semester=request.getParameter("semester");
		
		int status=DatabaseConnectivity.subjectAdd(subjectCode, coa, subName, semester, ay, session, credit);
		if(status>0)
		{
			response.sendRedirect("SubjectAddSuccess.jsp");
			
		}
		else
		{
			response.sendRedirect("SubjectAddError.jsp");
		}
		
	}

}
