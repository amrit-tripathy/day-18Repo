package com.grayMatter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.grayMatter.model.Employee;

@Controller
public class EmpController {
	
	@RequestMapping("/dologin")
	public String dologin() {
		return "login";
	}
	@RequestMapping("/empp")//here this the request which client is making in url
	public ModelAndView getEmployee() {
		Employee emps = new Employee("amrit",12,345.00);
		ModelAndView mv = new ModelAndView("emp");///refers to emp.jsp
		mv.addObject("emp1",emps);////key-value pair
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String uname,@RequestParam String pwd) {
		ModelAndView mv=null;
		if(uname.equals("amrit") && pwd.equals("123")) {
			 mv= new ModelAndView("addEmp");
		}
		else {
			mv = new ModelAndView("login");
		}
		return mv;
		
	}
	
	@RequestMapping("/employee/add")
	public ModelAndView addEmp(@RequestParam String empName,@RequestParam String empId,@RequestParam String empSal) {
		Employee e = new Employee(empName,Integer.parseInt(empId),Float.parseFloat(empSal));
		ModelAndView mv = new ModelAndView("emp");
		mv.addObject("emp1",e);
		return mv;
	}
	

}
