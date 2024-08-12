package com.grayMatter.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.annotation.PostConstruct;

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
@Component
public class DataSource {
	//@Value("com.mysql.cj.jdbc.Driver")
	private String Drivername;
	//@Value("jdbc:mysql://localhost:3306/graymatterdb")
	private String url;
	//@Value("root")
	private String username;
	//@Value("Amrit18#")
	private String password;
	
	@PostConstruct
	public void setup() {
		Drivername = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/graymatterdb";
		username = "root";
		password = "Amrit18#";
	}
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(Drivername);
		Connection con = DriverManager.getConnection(url,username,password);
		return con;
	}
}





