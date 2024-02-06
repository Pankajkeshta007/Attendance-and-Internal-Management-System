package com.AIMS.Dao;

public class StudentInternal {
private String subject_id;
private Long student_id;
private int marks;
public String getSubject_id() {
	return subject_id;
}
public void setSubject_id(String subject_id) {
	this.subject_id = subject_id;
}
public Long getStudent_id() {
	return student_id;
}
public void setStudent_id(Long student_id) {
	this.student_id = student_id;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public StudentInternal(String subject_id, Long student_id, int marks) {
	super();
	this.subject_id = subject_id;
	this.student_id = student_id;
	this.marks = marks;
}
@Override
public String toString() {
	return "StudentInternal [subject_id=" + subject_id + ", student_id=" + student_id + ", marks=" + marks + "]";
}
public StudentInternal()
{
	
}
}
