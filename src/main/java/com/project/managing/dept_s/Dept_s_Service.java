package com.project.managing.dept_s;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.project.managin.course.Pro_Course_VO;
import com.project.managin.student.StudentVO;

public interface Dept_s_Service {
	
	public boolean loginCheck(StudentVO s_vo, HttpSession session);
	
	public Dept_s_VO Viewinfo(String s_id);
	
	public void s_logout(HttpSession session);
	
	public boolean s_addcourse(String s_id, int inc_no); 
	
	public List<Pro_Course_VO> addcourselist(String s_id2);
	
	public void course_delete(String s_id, int inc_no);
}
