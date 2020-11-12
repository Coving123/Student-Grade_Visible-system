package com.learn.springmvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/redirect")
public class aController{

	/*@RequestMapping(value="/aController")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","springmvc is already!");
		mv.setViewName("/WEB-INF/jsp/a.jsp");
		return mv;
	}*/

	@RequestMapping(value="/aController")
	public String handleRequest(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception {
		// TODO Auto-generated method stub
		model.addAttribute("msg", "springmvc annotation is already!");
		return "a";
	}
}
