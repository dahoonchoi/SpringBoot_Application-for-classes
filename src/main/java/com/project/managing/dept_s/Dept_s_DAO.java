package com.project.managing.dept_s;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.managin.course.Pro_Course_VO;
import com.project.managin.student.StudentVO;

@Repository
public class Dept_s_DAO {

	@Autowired
	SqlSession sqlsession;
	
	
	public boolean loginCheck(StudentVO s_vo) {

		System.out.println(s_vo.getid());
		String name = sqlsession.selectOne("student.s_logincheck",s_vo);
		
		return (name == null) ? false : true;
	}
	public Dept_s_VO Viewinfo(String s_id) {
		
		return sqlsession.selectOne("student.s_view", s_id);
	}
	public void s_logout(HttpSession session) {
		session.invalidate();
	}
	public StudentVO s_userinfo(String s_id) {
		
		return sqlsession.selectOne("student.s_info", s_id); 
	}
	public List<Pro_Course_VO> addcourselist(String s_id2){

		System.out.println(s_id2);
		return sqlsession.selectList("student.addcourse",s_id2);
	}
	
	
	 
}
