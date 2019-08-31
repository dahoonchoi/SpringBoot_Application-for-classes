package com.project.managing.controller;

import javax.inject.Inject; 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.project.managin.course.Pro_Course_VO;
import com.project.managin.student.StudentVO;
import com.project.managin.student.Student_c_VO;
import com.project.managing.dept_s.Dept_s_Service;
import com.project.managing.info.info_Service;
import com.project.managing.info.info_VO;
import com.project.managing.pro.Pro_Service;

@Controller
public class StudentController {

	@Inject
	Dept_s_Service dept_s_Service;
	@Inject
	info_Service info_Service;
	@Inject
	Pro_Service pro_Service;

	SqlSession session;
	RedirectView redirectView = new RedirectView();

	@RequestMapping(value = "/s_index")
	public String student_index(Model model, info_VO vo) {

		model.addAttribute("infoList", info_Service.infolist());
		return "student/s_index";
	}

	@RequestMapping(value = "/")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/studentLogin.do", method = RequestMethod.POST)
	public ModelAndView s_login(@ModelAttribute StudentVO vo, HttpSession session) {
		redirectView.setExposeModelAttributes(false);
		boolean result = dept_s_Service.loginCheck(vo, session);
		ModelAndView mav = new ModelAndView();
		System.out.println(result);
		if (result == true) {
			redirectView.setUrl("/s_index");
			mav.addObject("msg", "sucess");
			mav.setView(redirectView);
		} else {
			System.out.println("no");
			mav.addObject("msg", "failure");
			mav.setViewName("login");

		}
		System.out.println(mav);
		return mav;
	}

	@RequestMapping(value = "/s_logout.do")
	public ModelAndView logout(HttpSession session) {
		dept_s_Service.s_logout(session);
		ModelAndView mav = new ModelAndView();
		redirectView.setUrl("/");
		mav.setView(redirectView);
		return mav;
	}

	@RequestMapping(value = "/opencourse.do", method = RequestMethod.GET)
	public String student_opencourse(Model model, HttpSession session, HttpServletRequest reqest, StudentVO s_vo) {
		String msg = "true";
		pro_Service.opencourselist();
		String id = (String) session.getAttribute("id");
		System.out.println(msg);
		model.addAttribute("addcourseList", dept_s_Service.addcourselist(id));
		model.addAttribute("opencourseList", pro_Service.opencourselist());
		return "student/opencourse";
	}

	@RequestMapping("/courseapplication.do")
	public ModelAndView student_courseapp(@ModelAttribute Pro_Course_VO vo, StudentVO s_vo, Model model) {
		System.out.println(vo.getInc_no() + "id" + s_vo.getid());
		boolean check = dept_s_Service.s_addcourse(s_vo.getid(), vo.getInc_no());
		ModelAndView mav = new ModelAndView();
		if (check == false) {
			System.out.println("failure");
			
			redirectView.setUrl("/opencourse.do");
			mav.setView(redirectView);
			mav.addObject("msg", "failure");
		}
		else {
			redirectView.setUrl("/opencourse.do");
			mav.setView(redirectView);
		}
		

		return mav;
	}
	@RequestMapping("/coursedelete.do")
	public ModelAndView course_delete(@ModelAttribute Student_c_VO s_vo ,Model model) {
		dept_s_Service.course_delete(s_vo.getS_id2(),s_vo.getInc_no());
		ModelAndView mav = new ModelAndView();
		redirectView.setUrl("/opencourse.do");
		mav.setView(redirectView);
		return mav;
	}

}
