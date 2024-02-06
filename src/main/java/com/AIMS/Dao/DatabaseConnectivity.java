package com.AIMS.Dao;

import java.sql.Connection;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Blob;

public class DatabaseConnectivity {
	 public static Connection getcon() throws SQLException,ClassNotFoundException
	    {

	        Class.forName("com.mysql.cj.jdbc.Driver");
	        System.out.println("Connection to database done ");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
	        System.out.println("Connection to database done ");
	        return con;

	    }
	public static int adminSave(String Name, String Email,String Username, String Password,String Role)
	{
		int status=-1;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" insert into admin_register(name,email,username,password,Role) values (?,?,?,?,?)";
			PreparedStatement ps=connection.prepareStatement(sql);
		
			
			ps.setString(1, Name);
			ps.setString(2, Email);
			ps.setString(3, Username);
			ps.setString(4, Password);
			ps.setString(5, Role);
			
			status=ps.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
			

}
	public static boolean adminValidate(String Username,String Password)
	{
		boolean status=false;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql="select * from admin_register where username=? and password=?";
			PreparedStatement ps=connection.prepareStatement(sql);
		
			
			
			ps.setString(1, Username);
			ps.setString(2, Password);
			
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public static AdminRecord adminDisplay( String username, String password) {
		ResultSet rs =null;
		AdminRecord admin = new AdminRecord();
			
			try {

				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");

				String sql="select * from admin_register where username=? and password=?";
				PreparedStatement ps=connection.prepareStatement(sql);
				ps.setString(1, username);
				ps.setString(2, password);
				 rs=ps.executeQuery();
		
			
			
				
				while(rs.next()) {
					admin.setName(rs.getString(1));
					admin.setEmail(rs.getString(2));
					
					admin.setUsername(rs.getString(3));
					admin.setPassword(rs.getString(4));
					
					admin.setRole(rs.getString(5));
					
					
				}
			 
			
					
		  
		}catch(Exception e)
			{
			e.printStackTrace();
			
			}
			
		return admin;
		}

	
	public static int studentAdd(String firstName,String lastName,String dob, String doa, String email,String percentage, String batch, String fatherName, String contact, String password,String studentId,String lateralEntry,String semester,int branchid,String address)
	{
		int status=-1;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" insert into student(firstName,lastName,date_of_birth,date_of_admission,email,12_percentage,batch,fatherName,contactNo,password,studentId,lateralEntry,semester,address,branch_id) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=connection.prepareStatement(sql);
		
			
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, dob);
			ps.setString(4, doa);
			ps.setString(5, email);
			ps.setString(6, percentage);
			ps.setString(7, batch);
			ps.setString(8, fatherName);
			ps.setString(9, contact);
			ps.setString(10, password);
			ps.setNString(11, studentId);
			ps.setString(12, lateralEntry);
			ps.setString(13, semester);
			ps.setString(14, address);
			ps.setInt(15, branchid);
			
			
			status=ps.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

	
	public static List<StudentData> display() {
		ResultSet rs =null;
		List<StudentData> students = new ArrayList<StudentData>();
			
			try {

				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");

				String sql="select * from student";
				PreparedStatement ps=connection.prepareStatement(sql);
			    rs=ps.executeQuery();
		
			
			
				
				while(rs.next()) {
					StudentData student = new StudentData();
					student.setStudentId(rs.getLong(1));
					student.setFirstName(rs.getString(2));
					student.setLastName(rs.getString(3));
					student.setDob(rs.getString(4));
					student.setDoa(rs.getString(5));
					student.setEmail(rs.getString(6));
					student.setPercentage12(rs.getInt(7));
					student.setBatch(rs.getString(8));
					student.setFatherName(rs.getString(9));
					student.setContactNo(rs.getString(10));
					
					student.setLateralEntry(rs.getString(11));
					
					
					
					student.setPassword(rs.getString(12));
					student.setSemester(rs.getString(13));
					student.setAddress(rs.getString(14));
					
					
					students.add(student);
					
				}
			}catch(Exception e)
			{
			e.printStackTrace();
			System.out.println("Students records :");
			System.out.println(students);
		
			}
			
		return students;
		}
	public static boolean validate(long studentId)
	{
		boolean status=false;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" select * from student where studentId = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setLong(1, studentId);
			
		
			ResultSet rs=ps.executeQuery();
			status=rs.next();
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		return status;
		
	}
	public static int updateFirstName(String name,String studentId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update student  set FirstName=?  where studentId = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, name);
			
			ps.setString(2,studentId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int updateLastName(String name,String studentId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update student  set lastName=?  where studentId = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, name);
			
			ps.setString(2,studentId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int updateDOB(String dob,String studentId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update student  set date_of_birth=?  where studentId = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, dob);
			
			ps.setString(2,studentId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int updateDOA(String doa,String studentId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update student  set date_of_admission=?  where studentId = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, doa);
			
			ps.setString(2,studentId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int updateEmail(String email,String studentId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update student  set email=?  where studentId = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, email);
			
			ps.setString(2,studentId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int updateSemester(String semester,String studentId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update student  set semester=?  where studentId = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1,semester);
			
			ps.setString(2,studentId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int update12Per(String percentage,String studentId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update student  set 12_percentage=?  where studentId = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, percentage);
			
			ps.setString(2,studentId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int updateBatch(String batch,String studentId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update student  set batch=?  where studentId = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, batch);
			
			ps.setString(2,studentId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int updateFatherName(String fatherName,String studentId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update student  set fatherName=?  where studentId = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, fatherName);
			
			ps.setString(2,studentId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int updateContact(String contact,String studentId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update student  set contactNo=?  where studentId = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, contact);
			
			ps.setString(2,studentId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int updateLateralEntry(String LEntry,String studentId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update student  set lateralEntry=?  where studentId = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, LEntry);
			
			ps.setString(2,studentId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
		
	public static int updatePassword(String password,String studentId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update student  set password=?  where studentId = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, password);
			
			ps.setString(2,studentId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int updateAddress(String address,String studentId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update student  set address=?  where studentId = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, address);
			
			ps.setString(2,studentId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int studentDelete(long  rollno)
	{
		

		int status=-1;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" delete from student where studentId = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setLong(1, rollno);
			
		
			status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
return status;
	}
	
	public static int facultyAdd(String AicteId,String Name,String dob, String doj,String designation,String qualification, String email, String contact,String salary ,String password )
	{
		int status=-1;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" insert into faculty(Aicte_id,Name,date_of_birth,date_of_joining,designation,qualification,email,contact,salary,password) values (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=connection.prepareStatement(sql);
		
			
			ps.setString(1, AicteId);
			ps.setString(2, Name);
			ps.setString(3, dob);
			ps.setString(4, doj);
			ps.setString(5, designation);
			ps.setString(6, qualification);
			ps.setString(7, email);
			ps.setString(8, contact);
			ps.setString(9, salary);
			ps.setNString(10, password);
			
			
			
			status=ps.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public static List<facultyData> facultyDisplay() {
		ResultSet rs =null;
		List<facultyData> faculties = new ArrayList<facultyData>();
			
			try {

				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");

				String sql="select * from faculty";
				PreparedStatement ps=connection.prepareStatement(sql);
			    rs=ps.executeQuery();
		
			
			
				
				while(rs.next()) {
					facultyData faculty = new facultyData();
					faculty.setAicteId(rs.getLong(1));
				    faculty.setName(rs.getString(2));
				    faculty.setDob(rs.getString(3));
				    faculty.setDoj(rs.getString(4));
				    faculty.setDesignation(rs.getString(5));
				    faculty.setQualification(rs.getString(6));
				    faculty.setEmail(rs.getString(7));
				    faculty.setContact(rs.getString(8));
				    faculty.setSalary(rs.getFloat(9));
				    faculty.setPassword(rs.getString(10));
					
					faculties.add(faculty);
					
				}
			}catch(Exception e)
			{
			e.printStackTrace();
			System.out.println("Faculty records :");
			System.out.println(faculties);
		
			}
			
		return faculties;
		}
	public static boolean facultyValidate(long aicteId)
	{
		boolean status=false;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" select * from faculty where Aicte_id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setLong(1, aicteId);
			
		
			ResultSet rs=ps.executeQuery();
			status=rs.next();
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		return status;
		
	}
	public static int facultyDelete(long  aicteId)
	{
		

		int status=-1;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" delete from faculty where Aicte_id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setLong(1, aicteId);
			
		
			status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
return status;
	}
	
	public static int facultyName(String name,String Aicte_id)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update faculty  set Name=?  where Aicte_id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, name);
			
			ps.setString(2,Aicte_id);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	
	public static int facultyDesignation(String designation,String Aicte_id)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update faculty  set designation=?  where Aicte_id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, designation);
			
			ps.setString(2,Aicte_id);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int facultyQualification(String qualification,String Aicte_id)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update faculty  set qualification=?  where Aicte_id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, qualification);
			
			ps.setString(2,Aicte_id);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	
	public static int facultyEmail(String email,String Aicte_id)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update faculty  set Email=?  where Aicte_id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, email);
			
			ps.setString(2,Aicte_id);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	
	public static int facultyContact(String contact,String Aicte_id)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update faculty  set contact=?  where Aicte_id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, contact);
			
			ps.setString(2,Aicte_id);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	
	
	public static int facultyPassword(String password,String Aicte_id)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update faculty  set password=?  where Aicte_id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, password);
			
			ps.setString(2,Aicte_id);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	
	public static int facultySalary(float salary,String Aicte_id)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update faculty  set salary=?  where Aicte_id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setFloat(1, salary);
			
			ps.setString(2,Aicte_id);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	
	public static int subjectAdd(String subjectId,String COA,String subjectName, String semester, String AY,String session, int credit)
	{
		int status=-1;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" insert into subject(subject_id,course_outcome,subject_name,semester,academic_year,session,credit) values (?,?,?,?,?,?,?)";
			PreparedStatement ps=connection.prepareStatement(sql);
		
			
			ps.setString(1, subjectId);
			ps.setString(2, COA);
			ps.setString(3, subjectName);
			ps.setString(4, semester);
			ps.setString(5, AY);
			ps.setString(6, session);
			ps.setInt(7, credit);
			
			
			
			status=ps.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public static List<SubjectRecord> subjectDisplay() {
		ResultSet rs =null;
		List<SubjectRecord> subjects = new ArrayList<SubjectRecord>();
			
			try {

				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");

				String sql="select * from subject";
				PreparedStatement ps=connection.prepareStatement(sql);
			    rs=ps.executeQuery();
		
			
			
				
				while(rs.next()) {
					SubjectRecord subject=new SubjectRecord();
					subject.setSubjectId(rs.getString(1));
					subject.setCoa(rs.getString(2));
					subject.setSubjectName(rs.getString(3));
					subject.setSemester(rs.getString(4));
					subject.setAy(rs.getString(5));
					subject.setSession(rs.getString(6));
					subject.setCredit(rs.getInt(7));
					
					subjects.add(subject);
					
				}
			}catch(Exception e)
			{
			e.printStackTrace();
			System.out.println("Faculty records :");
			System.out.println(subjects);
		
			}
			
		return subjects;
		}

	
	public static boolean subjectValidate(String subjectId)
	{
		boolean status=false;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" select * from subject where subject_id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, subjectId);
			
		
			ResultSet rs=ps.executeQuery();
			status=rs.next();
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		return status;
		
	}
	public static int updateSubjectName(String subName,String subId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update subject  set subject_name=?  where subject_id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, subName);
			
			ps.setString(2,subId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int updateSubjectCOA(String COA,String subId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update subject  set course_outcome=?  where subject_id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, COA);
			
			ps.setString(2,subId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int updateSubjectAY(String AY,String subId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update subject  set academic_year=?  where subject_id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, AY);
			
			ps.setString(2,subId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int updateSubjectSession(String session,String subId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update subject  set session=?  where subject_id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, session);
			
			ps.setString(2,subId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int updateSubjectCredit(int credit,String subId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update subject  set credit=?  where subject_id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setInt(1, credit);
			
			ps.setString(2,subId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int updateSubjectSemester(String sem,String subId)
	{
		int status=-1;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" update subject  set semester=?  where subject_id = ?";
			PreparedStatement ps=connection.prepareStatement(sql);
	
			
			ps.setString(1, sem);
			
			ps.setString(2,subId);
			 status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
		return status;
	}
	public static int subjectDelete(String subId)
	{
		

		int status=-1;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql=" delete from subject where subject_id= ?";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1, subId);
			
		
			status=ps.executeUpdate();
			
						
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		
return status;
	}
	
	public static boolean studentValidate(long studentid,String Password)
	{
		boolean status=false;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql="select * from student where studentId=? and password=?";
			PreparedStatement ps=connection.prepareStatement(sql);
		
			
			
			ps.setLong(1, studentid);
			ps.setString(2, Password);
			
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public static StudentData studentDisplay(Long studentid, String password) {
		ResultSet rs =null;
		StudentData student = new StudentData();
			
			try {

				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");

				String sql="select * from student where studentId=? and password=?";
				PreparedStatement ps=connection.prepareStatement(sql);
				ps.setLong(1, studentid);
				ps.setString(2, password);
				 rs=ps.executeQuery();
		
			
			
				
				while(rs.next()) {
					
					student.setStudentId(rs.getLong(1));
					student.setFirstName(rs.getString(2));
					student.setLastName(rs.getString(3));
					student.setDob(rs.getString(4));
					student.setDoa(rs.getString(5));
					student.setEmail(rs.getString(6));
					student.setPercentage12(rs.getInt(7));
					student.setBatch(rs.getString(8));
					student.setFatherName(rs.getString(9));
					student.setContactNo(rs.getString(10));
					
					student.setLateralEntry(rs.getString(11));
					
					
					
					student.setPassword(rs.getString(12));
					student.setSemester(rs.getString(13));
					student.setAddress(rs.getString(14));
					
					
				
					
					
				}
			 
			
					
		  
		}catch(Exception e)
			{
			e.printStackTrace();
			
			}
			
		return student;
		}
	public static boolean studentValidate(Long student_id)
	{
		boolean status=false;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql="select subject_id,marks_obtained from student_internal where student_id=?";
			PreparedStatement ps=connection.prepareStatement(sql);
		
			
			
			ps.setLong(1, student_id);
			
			
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public static boolean studentValidate1(Long student_id)
	{
		boolean status=false;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
			String sql="select * from attandance where student_id=?";
			PreparedStatement ps=connection.prepareStatement(sql);
		
			
			
			ps.setLong(1, student_id);
			
			
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
}
	public static StudentAttandance studentViewAttandance(Long student_id ,String subject_id) {
		ResultSet rs =null;
		StudentAttandance attandance=new StudentAttandance();
		
			
			try {

				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");

				String sql="SELECT FORMAT ((COUNT(*) * 100.0 / (SELECT COUNT(*) FROM attandance WHERE subject_id=? AND student_id=?)),1 ) FROM attandance AS percentage_present WHERE Attandance_Status ='present' AND Subject_Id=? AND Student_Id=?";
				PreparedStatement ps=connection.prepareStatement(sql);
				  ps.setString(1, subject_id);
			        ps.setLong(2, student_id);
			        ps.setString(3, subject_id);
			        ps.setLong(4, student_id);
				
				 rs=ps.executeQuery();
		
			
				  if (rs.next()) {
		                double percentagePresent = rs.getDouble("percentage_present");
		                System.out.println("Percentage Present: " + percentagePresent);
		            } else {
		                System.out.println("No data found.");
		            }
				
				while(rs.next()) {
					attandance.setSubject_id(rs.getString(1));
					
					
					
				
					
					
				}
			 
			
					
		  
		}catch(Exception e)
			{
			e.printStackTrace();
			
			}
			
		return attandance;
		}


public static List<StudentInternal> studentViewInternal(Long studentid) {
	ResultSet rs =null;
	List<StudentInternal> internals=new ArrayList<StudentInternal>();
	
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");

			String sql="select subject_id,marks_obtained from student_internal where student_id=?";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setLong(1, studentid);
			
			 rs=ps.executeQuery();
	
		
		
			
			while(rs.next()) {
				StudentInternal internal=new StudentInternal();
				 internal.setSubject_id(rs.getString(1));
				 internal.setMarks(rs.getInt(2));
				
				
				internals.add(internal);
			
				
				
			}
		 
		
				
	  
	}catch(Exception e)
		{
		e.printStackTrace();
		
		}
		
	return internals;
	}
public static List<BranchData> branchDisplay() {
	ResultSet rs =null;
	List<BranchData> branches = new ArrayList<BranchData>();
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");

			String sql="select * from branch";
			PreparedStatement ps=connection.prepareStatement(sql);
		    rs=ps.executeQuery();
	
		
		
			
			while(rs.next()) {
				BranchData branch=new BranchData();
				branch.setBranch_name(rs.getString(1));
			branch.setIntake(rs.getInt(2));
			branch.setAccredation_status(rs.getString(3));
			branch.setAcademic_year(rs.getString(4));
			branch.setStudent_id(rs.getLong(5));
			branch.setBranch_id(rs.getInt(6));
			
				
				
				branches.add(branch);
				
			}
		}catch(Exception e)
		{
		e.printStackTrace();
		
		}
		
	return branches;
	}
}
	