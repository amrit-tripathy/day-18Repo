package com.grayMatter.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.grayMatter.beans.Customer;
import com.grayMatter.beans.DataSource;
import com.grayMatter.beans.Item;
import com.grayMatter.beans.Order;

@ComponentScan("com.grayMatter")
//@PropertySource("classpath:data.properties")

public class CustomerConfig {
	
	@Bean(name="cust")
	public Customer cust() {
		return new Customer("custname1",12,"5556666666","abc@gmail.com",order());
	}
	@Bean
	public Order order(){
		return new Order(456,"12/2/2020",itemlist());
	}
	@Bean
	public List<Item>itemlist(){
		Item i1= new Item(12,"item1","cpu1");
		Item i2= new Item(12,"item2","cpu2");
		Item i3 = new Item(12,"item3","cpu3");
		return (List<Item>) Arrays.asList(i1,i2,i3);
	}
//	@Bean
//	public Item item1() {
//		return new Item(12,"item1","cpu1");
//	}
//	@Bean
//	public Item item2() {
//		return new Item(12,"item2","cpu2");
//	}
//	@Bean
//	public Item item3() {
//		return new Item(12,"item3","cpu3");
//	}
//	@Bean
//	public DataSource db() {
//		return new DataSource("com.mysql.cj.jdbc.Driver","jdbc:mysql://localhost:3306/graymatterdb",
//				"root","Amrit18#");
//	}
	
	
}
