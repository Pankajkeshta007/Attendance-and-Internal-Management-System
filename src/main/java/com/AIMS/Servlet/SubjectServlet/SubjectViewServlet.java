package com.AIMS.Servlet.SubjectServlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.AIMS.Dao.DatabaseConnectivity;

import com.AIMS.Dao.SubjectRecord;

/**
 * Servlet implementation class SubjectViewServlet
 */
public class SubjectViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectViewServlet() {
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
    public void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException  {

		  List<SubjectRecord> records=DatabaseConnectivity.subjectDisplay();
			System.out.println("Student data :");
			System.out.println(records);
			request.setAttribute("subjectDetails", records);

			  request.getRequestDispatcher("SubjectView.jsp").forward(request,response);
          
	}

}
