package com.grayMatter.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
//@Component
public class Customer {
//	@Value("${Custsomer.custName}")
	private String custName;
//	@Value("${Cutsomer.id}")
	private int id;
//	@Value("${Cutsomer.mobile}")
	private String mobile;
//	@Value("${Cutsomer.email}")
	private String email;
	@Autowired
	private Order order;
}
