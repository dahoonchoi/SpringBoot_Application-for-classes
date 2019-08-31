package com.project.managin.student;

public class StudentVO {
private String id;
private String password;
private String s_phone;
private String s_address;
private String s_birth;
private int s_grade;
private String s_name;

public String getS_name() {
	return s_name;
}
public void setS_name(String s_name) {
	this.s_name = s_name;
}
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
public String getS_phone() {
	return s_phone;
}
public void setS_phone(String s_phone) {
	this.s_phone = s_phone;
}
public String getS_address() {
	return s_address;
}
public void setS_address(String s_address) {
	this.s_address = s_address;
}
public String getS_birth() {
	return s_birth;
}
public void setS_birth(String s_birth) {
	this.s_birth = s_birth;
}
public int getS_grade() {
	return s_grade;
}
public void setS_grade(int s_grade) {
	this.s_grade = s_grade;
}
public StudentVO() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "StudentVO [id=" + id + ", password=" + password + ", s_phone=" + s_phone + ", s_address=" + s_address
			+ ", s_birth=" + s_birth + ", s_grade=" + s_grade + ", s_name=" + s_name + "]";
}
	

}
