package com.grayMatter.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@PropertySource("classpath:data.properties")
public class Employee {
	

	//setter based injection
//	@Value("amrit")
	@Value("${Employee.empName}")
	private String empName;
//	@Value("123")
	@Value("${Employee.empId}")
	private int empId;
//	@Value("23000")
	@Value("${Employee.empSal}")
	private double empSal;
	@Autowired  //by type autowiring so only one bean of department can be created
	private Department department;
	
	

	
	
	
	
}


