package com.grayMatter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.grayMatter.beans.Author;
import com.grayMatter.beans.Book;

@Configuration
//configuration file to application
//learn component
@ComponentScan("com.graymatter")
@PropertySource("classpath:data.properties")
public class BookConfig {
	
	//define beans
	//supply values to bean properties
	
//	@Bean
//	public Book book() {
//		return new Book("java","java123",100,getAuthor());
//	}
//	@Bean(name="author")
//	public Author getAuthor() {
//		return new Author("amrit","123");
//	}
	
}
