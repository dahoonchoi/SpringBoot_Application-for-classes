package com.project.managing.pro;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.managin.course.Course_VO;
import com.project.managin.course.Pro_Course_VO;

@Repository
public class Pro_DAO {

	@Autowired
	SqlSession sqlsession;

	public boolean loginCheck(Pro_VO p_vo) {

		System.out.println(p_vo.getid());
		String name = sqlsession.selectOne("professior.p_logincheck", p_vo);

		return (name == null) ? false : true;
	}

	public Pro_VO Viewinfo(String p_id) {

		return sqlsession.selectOne("professior.p_view", p_id);
	}
	
	public void insertCo(Course_VO co_vo, Pro_Course_VO pr_vo) {
		
		sqlsession.insert("professior.co_insert",co_vo);
		
		System.out.println(co_vo.toString());
		
		pr_vo.setC_no1(co_vo.getC_no());
		pr_vo.setInc_name(co_vo.getC_name());
		
		
		sqlsession.insert("professior.procourse_insert",pr_vo);
		
	}
	
	public List<Pro_Course_VO> opencourselist(){

		return sqlsession.selectList("professior.opencourse");
	}
	

	public void s_logout(HttpSession session) {
		session.invalidate();
	}

}
