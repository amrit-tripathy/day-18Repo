package com.grayMatter.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import lombok.AllArgsConstructor;
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
public class Department {
	@Value("${Department.deptName}")
	private String deptName;
	@Value("${Department.deptId}")
	private int deptId;
	
}
