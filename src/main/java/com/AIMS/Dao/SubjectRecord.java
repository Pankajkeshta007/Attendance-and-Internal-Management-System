package com.AIMS.Dao;

public class SubjectRecord {

	private String subjectId;
	private String coa;
	private String subjectName;
	private String semester;
	private String ay;
	private String session;
	private int credit;
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getCoa() {
		return coa;
	}
	public void setCoa(String coa) {
		this.coa = coa;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getAy() {
		return ay;
	}
	public void setAy(String ay) {
		this.ay = ay;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public SubjectRecord(String subjectId, String coa, String subjectName, String semester, String ay, String session,
			int credit) {
		super();
		this.subjectId = subjectId;
		this.coa = coa;
		this.subjectName = subjectName;
		this.semester = semester;
		this.ay = ay;
		this.session = session;
		this.credit = credit;
	}
	
	public SubjectRecord(){
		
	}
	@Override
	public String toString() {
		return "SubjectRecord [subjectId=" + subjectId + ", coa=" + coa + ", subjectName=" + subjectName + ", semester="
				+ semester + ", ay=" + ay + ", session=" + session + ", credit=" + credit + "]";
	}
	
}
