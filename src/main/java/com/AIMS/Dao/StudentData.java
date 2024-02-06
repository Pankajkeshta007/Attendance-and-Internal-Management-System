package com.AIMS.Dao;

public class StudentData {
	private long studentId;
	private String firstName;
	private String lastName;
	private String email;
	private String dob;
	private String doa;
	private int percentage12;
	private String lateralEntry;
	private String contactNo;
	private String password;
	private String fatherName;
	private String batch;
	private String address;
	private String semester;
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDoa() {
		return doa;
	}
	public void setDoa(String doa) {
		this.doa = doa;
	}
	public int getPercentage12() {
		return percentage12;
	}
	public void setPercentage12(int percentage12) {
		this.percentage12 = percentage12;
	}
	public String getLateralEntry() {
		return lateralEntry;
	}
	public void setLateralEntry(String lateralEntry) {
		this.lateralEntry = lateralEntry;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	public StudentData()
	{
		
	}
	public StudentData(long studentId, String firstName, String lastName, String email, String dob, String doa,
			int percentage12, String lateralEntry, String contactNo, String password, String fatherName, String batch,
			String address, String semester) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dob = dob;
		this.doa = doa;
		this.percentage12 = percentage12;
		this.lateralEntry = lateralEntry;
		this.contactNo = contactNo;
		this.password = password;
		this.fatherName = fatherName;
		this.batch = batch;
		this.address = address;
		this.semester = semester;
	}
	@Override
	public String toString() {
		return "StudentData [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", dob=" + dob + ", doa=" + doa + ", percentage12=" + percentage12
				+ ", lateralEntry=" + lateralEntry + ", contactNo=" + contactNo + ", password=" + password
				+ ", fatherName=" + fatherName + ", batch=" + batch + ", address=" + address + ", semester=" + semester
				+ "]";
	}
	
	
	
	

}
