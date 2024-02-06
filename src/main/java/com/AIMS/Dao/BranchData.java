package com.AIMS.Dao;

public class BranchData {
	private String branch_name;
	private int intake;
	private Long student_id;
	private int branch_id;
	private String accredation_status;
	private String academic_year;
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public int getIntake() {
		return intake;
	}
	public void setIntake(int intake) {
		this.intake = intake;
	}
	public Long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}
	public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	public String getAccredation_status() {
		return accredation_status;
	}
	public void setAccredation_status(String accredation_status) {
		this.accredation_status = accredation_status;
	}
	public String getAcademic_year() {
		return academic_year;
	}
	public void setAcademic_year(String academic_year) {
		this.academic_year = academic_year;
	}
	public BranchData(String branch_name, int intake, Long student_id, int branch_id, String accredation_status,
			String academic_year) {
		super();
		this.branch_name = branch_name;
		this.intake = intake;
		this.student_id = student_id;
		this.branch_id = branch_id;
		this.accredation_status = accredation_status;
		this.academic_year = academic_year;
	}
	@Override
	public String toString() {
		return "BranchData [branch_name=" + branch_name + ", intake=" + intake + ", student_id=" + student_id
				+ ", branch_id=" + branch_id + ", accredation_status=" + accredation_status + ", academic_year="
				+ academic_year + "]";
	}
	
public BranchData()
{
	
}
}
