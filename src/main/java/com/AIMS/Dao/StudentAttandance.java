package com.AIMS.Dao;

public class StudentAttandance {
	private String subject_id;
	private long student_id;
	private String attandance_status;
	private int semester;
	public String getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}
	public long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}
	public String getAttandance_status() {
		return attandance_status;
	}
	public void setAttandance_status(String attandance_status) {
		this.attandance_status = attandance_status;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public StudentAttandance(String subject_id, long student_id, String attandance_status, int semester) {
		super();
		this.subject_id = subject_id;
		this.student_id = student_id;
		this.attandance_status = attandance_status;
		this.semester = semester;
	}
	@Override
	public String toString() {
		return "StudentAttandance [subject_id=" + subject_id + ", student_id=" + student_id + ", attandance_status="
				+ attandance_status + ", semester=" + semester + "]";
	}
	
public StudentAttandance()
{
	
}
}
