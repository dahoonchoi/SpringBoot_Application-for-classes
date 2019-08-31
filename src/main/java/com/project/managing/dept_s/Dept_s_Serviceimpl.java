package com.project.managing.dept_s;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.project.managin.course.Pro_Course_VO;
import com.project.managin.student.StudentVO;

@Service
public class Dept_s_Serviceimpl implements Dept_s_Service {
	
	@Inject
	Dept_s_DAO dept_DAO;
	
	@Inject
	Course_DAO course_DAO;
	
	@Override
	public boolean loginCheck(StudentVO s_vo, HttpSession session) {

		boolean result = dept_DAO.loginCheck(s_vo);
	
		String id = s_vo.getid();
		Dept_s_VO deptinfo = dept_DAO.Viewinfo(id);

	
		if(result) {
			
			session.setAttribute("id", deptinfo.getS_id());
			session.setAttribute("name", deptinfo.getIns_name());
		}
		return result;
	}
	
	@Override
	public Dept_s_VO Viewinfo(String s_id) {
	
		return dept_DAO.Viewinfo(s_id);
	}
	
	@Override
	public void s_logout(HttpSession session) {
		
	}
	@Override
	public boolean s_addcourse(String s_id, int inc_no ){
		
		StudentVO s_vo =  dept_DAO.s_userinfo(s_id);
		Pro_Course_VO c_vo = course_DAO.s_course(inc_no);
		System.out.println(c_vo.toString()+"student: "+s_vo.toString());
		return course_DAO.addcourse(s_vo, c_vo);
		
		
		
	}
	@Override
	public List<Pro_Course_VO> addcourselist(String s_id2){
		return dept_DAO.addcourselist(s_id2);
		
	}
	@Override
	public void course_delete(String s_id, int inc_no) {
		course_DAO.course_delete(s_id, inc_no);
	}

}
