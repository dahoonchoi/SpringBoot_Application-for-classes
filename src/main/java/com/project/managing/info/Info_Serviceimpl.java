package com.project.managing.info;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class Info_Serviceimpl implements info_Service {
	@Inject
	Info_DAO info_DAO;
	
	@Override
	public List<info_VO> infolist(){ 

		return info_DAO.infolist(); 
	}
}
