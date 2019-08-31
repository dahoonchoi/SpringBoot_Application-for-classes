package com.project.managing.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.project.managin.course.Course_VO;
import com.project.managin.course.Pro_Course_VO;
import com.project.managing.info.info_Service;
import com.project.managing.info.info_VO;
import com.project.managing.pro.Pro_Service;
import com.project.managing.pro.Pro_VO;

@Controller
public class ProController {

	@Inject
	Pro_Service pro_Service;
	@Inject
	info_Service info_Service;
	@Inject
	

	SqlSession session;
	RedirectView redirectView = new RedirectView();

	@RequestMapping(value = "/p_index")
	public String professior_index(Model model, info_VO vo) {
		model.addAttribute("infoList", info_Service.infolist());

		return "professior/p_index";
	}

	@RequestMapping(value = "/professiorLogin.do", method = RequestMethod.POST)
	public ModelAndView s_login(@ModelAttribute Pro_VO vo, HttpSession session) {
		redirectView.setExposeModelAttributes(false);
		boolean result = pro_Service.loginCheck(vo, session);
		ModelAndView mav = new ModelAndView();
		System.out.println(result);
		if (result == true) {
			redirectView.setUrl("/p_index");
			mav.addObject("msg", "sucess");
			mav.setView(redirectView);
		} else  {
			System.out.println("no");
			mav.addObject("msg", "failure");
			mav.setViewName("login");
			
		}
		System.out.println(mav);
		return mav;
	}
	@RequestMapping(value = "/p_logout.do")
	public ModelAndView logout(HttpSession session) {
		pro_Service.p_logout(session);
		ModelAndView mav = new ModelAndView();
		redirectView.setUrl("/");
		mav.setView(redirectView);
		return mav;
	}
	@RequestMapping(value = "/insertco.do", method = RequestMethod.POST)
	public ModelAndView insertCo(@ModelAttribute Pro_Course_VO pro_vo, @ModelAttribute Course_VO co_vo) {
		System.out.println(pro_vo.getC_content());
		pro_Service.insertCo(co_vo, pro_vo );
		ModelAndView mav = new ModelAndView();
		redirectView.setUrl("/p_index");
		mav.setView(redirectView);
		return mav;
	}
	
	@RequestMapping(value = "/insertcourse.do")
	public String insertcourse(Course_VO co_vo, Pro_Course_VO pr_vo) {

		return "professior/insertcourse";
	}
	
	
	
}
