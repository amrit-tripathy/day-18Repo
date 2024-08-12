package com.grayMatter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	@RequestMapping("/hello") //when a request is coming it will map to this 
	public String sayHello() {
		return "hello";
	}
	@RequestMapping("/namee")
	public ModelAndView printName() {
		ModelAndView mv = new ModelAndView("name");//creating instance of name.jsp
		mv.addObject("name","ram");//key-value pairs
		return mv;
	}
//	@RequestMapping("/name")
//	public Model printName(Model model) {
//		model.addAttribute("namee","ramm");
//		return model;
//	}

}
