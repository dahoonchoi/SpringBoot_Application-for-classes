package com.project.managing.pro;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.project.managin.course.Course_VO;
import com.project.managin.course.Pro_Course_VO;

public interface Pro_Service {

	public boolean loginCheck(Pro_VO p_vo, HttpSession session);

	public Pro_VO Viewinfo(String p_vo);

	public void p_logout(HttpSession session);
	
	public void insertCo(Course_VO co_vo,Pro_Course_VO pr_vo);

	public List<Pro_Course_VO> opencourselist();
}
