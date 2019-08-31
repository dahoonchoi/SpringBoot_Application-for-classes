package com.project.managing.dept_s;

public class Dept_s_VO {
	private String s_id;
	private String dept_no2;
	private String ins_name;
	private String indept_name;
	
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	public String getDept_no() {
		return dept_no2;
	}
	public void setDept_no(String dept_no2) {
		this.dept_no2 = dept_no2;
	}
	public String getIns_name() {
		return ins_name;
	}
	public void setIns_name(String ins_name) {
		this.ins_name = ins_name;
	}
	public String getIndept_name() {
		return indept_name;
	}
	public void setIndept_name(String indept_name) {
		this.indept_name = indept_name;
	}
	public Dept_s_VO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dept_s_VO [s_id=" + s_id + ", dept_no=" + dept_no2 + ", ins_name=" + ins_name + ", indept_name="
				+ indept_name + "]";
	}
	
	
}
