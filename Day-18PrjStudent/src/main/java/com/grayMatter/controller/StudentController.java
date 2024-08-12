package com.grayMatter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.grayMatter.model.Student;

@Controller
public class StudentController {
	
	List<Student>studlist=new ArrayList<Student>();
	
	@RequestMapping("/test")
	public String test() {
		
		return "test";
	}
	
	@RequestMapping(value = "/login")//by default it is get request
	public ModelAndView showlogin() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)//you need to mention what kind of request is mapped in specified url
	public ModelAndView dologin(@RequestParam String studName,@RequestParam String id,@RequestParam String dept) {
		ModelAndView mv = null;
		if(studName.equals("admin")&&id.equals("1")&&dept.equals("admin")){
			mv = new ModelAndView("welcome");
		}
		else {
			mv = new ModelAndView("login");
		}
		return mv;
	}
	@RequestMapping(value = "/addStud", method = RequestMethod.GET)
	public ModelAndView showaddStudjsp() {
		ModelAndView mv = new ModelAndView("addStudent");
		return mv;
	}
	
	@RequestMapping(value="/addStud", method = RequestMethod.POST)
	public ModelAndView addStudent(@RequestParam String studName,@RequestParam String id,@RequestParam String dept) {
		Student newst = new Student(studName,Integer.parseInt(id),dept);
		studlist.add(newst);
		return new ModelAndView("welcome");
	}
	@RequestMapping(value = "/getStud", method = RequestMethod.GET)
	public ModelAndView showgetAllStudjsp() {
		ModelAndView mv = new ModelAndView("getAllStudents");
		mv.addObject("studlist",studlist);
		return mv;
	}
	
}
