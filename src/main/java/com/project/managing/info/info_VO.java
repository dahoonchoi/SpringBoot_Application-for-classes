package com.project.managing.info;

public class info_VO {
	private int info_id;
	private String info_title;
	private String info_content;
	private String info_name;
	public int getInfo_id() {
		return info_id;
	}
	public void setInfo_id(int info_id) {
		this.info_id = info_id;
	}
	public String getInfo_title() {
		return info_title;
	}
	public void setInfo_title(String info_title) {
		this.info_title = info_title;
	}
	public String getInfo_content() {
		return info_content;
	}
	public void setInfo_content(String info_content) {
		this.info_content = info_content;
	}
	public String getInfo_name() {
		return info_name;
	}
	public void setInfo_name(String info_name) {
		this.info_name = info_name;
	}
	public info_VO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "info_VO [info_id=" + info_id + ", info_title=" + info_title + ", info_content=" + info_content
				+ ", info_name=" + info_name + "]";
	}
	
	
}
