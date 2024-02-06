package com.AIMS.Servlet.StudentLogin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.AIMS.Dao.DatabaseConnectivity;
import com.AIMS.Dao.StudentData;
import com.AIMS.Dao.StudentInternal;

/**
 * Servlet implementation class StudentViewInternalServlet
 */
public class StudentViewInternalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentViewInternalServlet() {
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
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  HttpSession httpSession=request.getSession();
	      String id= httpSession.getAttribute("student_id").toString();
	      Long student_id=Long.parseLong(id);
	    boolean status=DatabaseConnectivity.studentValidate(student_id);
	    if(status)
	    {
	    	
	    	  List<StudentInternal> records=DatabaseConnectivity.studentViewInternal(student_id);
				System.out.println("Student data :");
				System.out.println(records);
				request.setAttribute("studentInternals", records);

				  request.getRequestDispatcher("StudentViewInternal.jsp").forward(request,response);
	            
	    }
	    else
	    {
	    	response.sendRedirect("InternalError.jsp");
	    }
	}

}
