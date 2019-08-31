# Application-For-Classes

Application-for-classes system using Spring boot and Mybatis.

## Installation

```bash
https://github.com/dahoonchoi/SpringBoot_Application-for-classes.git

```
Because h2 database is used, h2 must be installed.
```bash
in http://www.h2database.com 
```
## Usage

```bash
Install 'org.springframework', 'com.h2database',  'javax.inject'in addition to dependencies.
```
### JSTL
 Write down the JSTL used by 'jsp' at the top of the jsp file.
```jsp
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
```

## Contributing
When you log in, the boolean value is returned depending on the user's information.

```java
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
```
When you log in, you will receive the value from 'controller' to 'DAO', which is 'Model' to show the class you applied for and the class you can apply for.
```java
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
```
This is 'Service' that students can do.
```java
public interface Dept_s_Service {
	
	/* 로그인 */
	public boolean loginCheck(StudentVO s_vo, HttpSession session);
	
	
	public Dept_s_VO Viewinfo(String s_id);
	
	/* 로그아웃 */
	public void s_logout(HttpSession session);
	
	/* 수강신청 */
	public boolean s_addcourse(String s_id, int inc_no); 
	
	/* 신청한 수강 조회 */
	public List<Pro_Course_VO> addcourselist(String s_id2);
	
	/* 수강 신청 삭제 */
	public void course_delete(String s_id, int inc_no);
}
```
This is 'Service' that professiors can do.
```java
public interface Pro_Service {

	/* 로그인 */
	public boolean loginCheck(Pro_VO p_vo, HttpSession session);

	public Pro_VO Viewinfo(String p_vo);
	
	/* 로그아웃 */
	public void p_logout(HttpSession session);
	
	/* 수강신청 */
	public void insertCo(Course_VO co_vo,Pro_Course_VO pr_vo);

	/* 개설된 수강조회 */
	public List<Pro_Course_VO> opencourselist();
}
```

## GIF
Professior

![professior](https://user-images.githubusercontent.com/41640324/64064701-d5979d80-cc3f-11e9-8806-32f990d99e6e.gif)

Student

![student](https://user-images.githubusercontent.com/41640324/64065245-62455a00-cc46-11e9-87a6-f3bd6b8a1a96.gif)
