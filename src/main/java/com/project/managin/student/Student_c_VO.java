package com.project.managin.student;

public class Student_c_VO {
	
	private String s_id2;
	private String score;
	private int inc_no;
	private int semester;
	public String getS_id2() {
		return s_id2;
	}
	public void setS_id2(String s_id2) {
		this.s_id2 = s_id2;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public int getInc_no() {
		return inc_no;
	}
	public void setInc_no(int inc_no) {
		this.inc_no = inc_no;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public Student_c_VO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student_c_VO [s_id=" + s_id2 + ", score=" + score + ", inc_no=" + inc_no + ", semester=" + semester
				+ "]";
	}
	
	
}
