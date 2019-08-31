package com.project.managing.dept_s;

import org.apache.ibatis.session.SqlSession;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.managin.course.Pro_Course_VO;
import com.project.managin.student.StudentVO;
import com.project.managin.student.Student_c_VO;

@Repository
public class Course_DAO {

	@Autowired
	SqlSession sqlsession;

	public Pro_Course_VO s_course(int  inc_no) {

		return sqlsession.selectOne("course.c_info", inc_no);
	}
	
	public boolean addcourse(StudentVO s_vo, Pro_Course_VO c_vo) {
		Student_c_VO sc_vo = new Student_c_VO();
		sc_vo.setS_id2(s_vo.getid());
		sc_vo.setSemester(s_vo.getS_grade());
		sc_vo.setInc_no(c_vo.getInc_no());
		String check = sqlsession.selectOne("student.s_check",c_vo.getInc_no());
		
		if(check == null) {
			sqlsession.insert("course.c_add", sc_vo);
			return true;
		}
		else {
			return false;
		}
	}
	public void course_delete(String s_id, int inc_no) {
		Student_c_VO sc_vo = new Student_c_VO();
		sc_vo.setS_id2(s_id);
		sc_vo.setInc_no(inc_no);
		System.out.println(sc_vo.toString());
		sqlsession.delete("student.c_delete", sc_vo);
	}
}
