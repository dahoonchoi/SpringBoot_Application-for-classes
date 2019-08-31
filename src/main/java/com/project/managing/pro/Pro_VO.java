package com.project.managing.pro;

public class Pro_VO {
	private String id;
	private String password;
	private String p_name;
	private String p_phone;
	private String p_room;
	
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_phone() {
		return p_phone;
	}
	public void setP_phone(String p_phone) {
		this.p_phone = p_phone;
	}
	public String getP_room() {
		return p_room;
	}
	public void setP_room(String p_room) {
		this.p_room = p_room;
	}
	public Pro_VO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pro_VO [p_id=" + id + ", p_password=" + password + ", p_name=" + p_name + ", p_phone=" + p_phone
				+ ", p_room=" + p_room + "]";
	} 
	
	
}
