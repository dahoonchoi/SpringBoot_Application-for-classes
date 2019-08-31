package com.project.managing.info;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class Info_DAO {
	
	@Inject
	SqlSession sqlsession;
	

	public List<info_VO> infolist(){

		return sqlsession.selectList("common.infolist");
	}
}
