package com.project.managing.pro;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.managin.course.Course_VO;
import com.project.managin.course.Pro_Course_VO;

@Service
public class Pro_Serviceimpl implements Pro_Service{
	
	@Autowired
	Pro_DAO pro_DAO;
	
	@Override
	public boolean loginCheck(Pro_VO p_vo, HttpSession session) {

		boolean result = pro_DAO.loginCheck(p_vo);
	
		System.out.println("session값 :" +p_vo.getP_name());
		String id = p_vo.getid();
		Pro_VO proinfo = pro_DAO.Viewinfo(id);

	
		if(result) {
			
			session.setAttribute("id",id);
			session.setAttribute("name", proinfo.getP_name());
			System.out.println("id값"+id);
		}
		return result;
	}
	
	@Override
	public Pro_VO Viewinfo(String p_id) {
	
		return pro_DAO.Viewinfo(p_id);
	}
	
	@Override
	public void p_logout(HttpSession session) {
		
	}
	@Override
	public void insertCo(Course_VO co_vo, Pro_Course_VO pr_vo) {
		
		pro_DAO.insertCo(co_vo, pr_vo);
		
	}
	
	@Override
	public List<Pro_Course_VO> opencourselist(){
		return pro_DAO.opencourselist();
	}

}
