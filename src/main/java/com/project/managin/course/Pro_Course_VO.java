package com.project.managin.course;

public class Pro_Course_VO {

	private int inc_no;
	private int personnel;
	private String p_id;
	private String p_name;

	private int c_no1;
	private String inc_name;
	private String c_content;
	private int c_progress;
	private String c_timeweek;
	private String c_starttime;
	private String c_endtime;
	
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getInc_no() {
		return inc_no;
	}
	public void setInc_no(int inc_no) {
		this.inc_no = inc_no;
	}
	public int getPersonnel() {
		return personnel;
	}
	public void setPersonnel(int personnel) {
		this.personnel = personnel;
	}
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public int getC_no1() {
		return c_no1;
	}
	public void setC_no1(int c_no1) {
		this.c_no1 = c_no1;
	}
	public String getInc_name() {
		return inc_name;
	}
	public void setInc_name(String inc_name) {
		this.inc_name = inc_name;
	}
	public String getC_content() {
		return c_content;
	}
	public void setC_content(String c_content) {
		this.c_content = c_content;
	}
	public int getC_progress() {
		return c_progress;
	}
	public void setC_progress(int c_progress) {
		this.c_progress = c_progress;
	}
	public String getC_timeweek() {
		return c_timeweek;
	}
	public void setC_timeweek(String c_timeweek) {
		this.c_timeweek = c_timeweek;
	}
	public String getC_starttime() {
		return c_starttime;
	}
	public void setC_starttime(String c_starttime) {
		this.c_starttime = c_starttime;
	}
	public String getC_endtime() {
		return c_endtime;
	}
	public void setC_endtime(String c_endtime) {
		this.c_endtime = c_endtime;
	}
	@Override
	public String toString() {
		return "Pro_Course_VO [inc_no=" + inc_no + ", personnel=" + personnel + ", p_id=" + p_id + ", c_no1=" + c_no1
				+ ", inc_name=" + inc_name + ", c_content=" + c_content + ", c_progress=" + c_progress + ", c_timeweek="
				+ c_timeweek + ", c_starttime=" + c_starttime + ", c_endtime=" + c_endtime + "]";
	}
	
	
	
}
