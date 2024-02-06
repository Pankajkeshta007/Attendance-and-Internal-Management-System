package com.AIMS.Dao;

public class facultyData {
	private long aicteId;
	private String Name;
	private String dob;
	private String doj;
	private String designation;
	private String qualification;
	private String email;
	private String contact;
	private float salary;
	private String password;
	public long getAicteId() {
		return aicteId;
	}
	public void setAicteId(long aicteId) {
		this.aicteId = aicteId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public facultyData(long aicteId, String name, String dob, String doj, String designation, String qualification,
			String email, String contact, float salary, String password) {
		super();
		this.aicteId = aicteId;
		Name = name;
		this.dob = dob;
		this.doj = doj;
		this.designation = designation;
		this.qualification = qualification;
		this.email = email;
		this.contact = contact;
		this.salary = salary;
		this.password = password;
	}
	
	public facultyData() {
		
	}
	@Override
	public String toString() {
		return "facultyData [aicteId=" + aicteId + ", Name=" + Name + ", dob=" + dob + ", doj=" + doj + ", designation="
				+ designation + ", qualification=" + qualification + ", email=" + email + ", contact=" + contact
				+ ", salary=" + salary + ", password=" + password + "]";
	}
	
	

}
