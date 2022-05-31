package com.spellhaven.profileHome;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spellhaven.profileHome.dao.IDao;

@Controller
public class WebController {

	@Autowired
	private SqlSession sqlSession; // Spring과 달리 세터 안 만들고 그냥 선언에다 @Autowired 하면 된다. (기억도않나요교수님;;^^)
	
	
	@RequestMapping(value = "/")
	public String home() {
		
		return "index";
	}
	
	@RequestMapping(value = "/index")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value = "/profile")
	public String profile() {
		
		return "profile";
	}
	
	@RequestMapping(value = "/contact")
	public String contact() {
		
		return "contact";
	}
	
	@RequestMapping(value = "/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(value = "/join")
	public String join() {
		
		return "join";
	}
	
	@RequestMapping(value = "/question")
	public String question() {
		
		return "question";
	}
	
	// 회원가입 폼 정보를 post 형식으로 보냈다고 명시해 줘야 한다. 킹받네.
	@RequestMapping(value = "/joinOk", method = RequestMethod.POST)
	public String joinOk(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		String mname = request.getParameter("mname");
		String memail = request.getParameter("memail");
		
		IDao dao = sqlSession.getMapper(IDao.class);
		
		int checkId = dao.checkIdDao(mid);
		
		if (checkId != 1) { // 아이디 중복체크를 통과했으면 회원가입을 해라.

			dao.joinDao(mid, mpw, mname, memail);
		
			// 회원가입 후 바로 로그인되게 하려면? 세션에다 올리면 된다 ㅋ.
			HttpSession session = request.getSession();
			session.setAttribute("id", mid);
			
			// 이 2줄은 그냥 '정지수님 회원가입 축하합니다' 이 화면 띄워 주려고 있는 거다.
			// Model(and view)에 attribute들을 실어보내!!
			model.addAttribute("mname", mname);
			model.addAttribute("mid", mid);
			
		}
		
		model.addAttribute("checkId", checkId);
		
		return "joinOk";
	}
	
	
}

















