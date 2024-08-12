package com.grayMatter;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.grayMatter.beans.Customer;
import com.grayMatter.beans.DataSource;
import com.grayMatter.beans.DbUtils;
import com.grayMatter.beans.Regions;
import com.grayMatter.config.CustomerConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
//        ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
//        Customer c = (Customer) context.getBean("cust");
//        System.out.println(c);
    	  ApplicationContext context= new AnnotationConfigApplicationContext(CustomerConfig.class);
    	  DataSource ds=(DataSource) context.getBean("dataSource");//similar to creating a object of a class
    	  Connection con =ds.getConnection();
//    	  System.out.println("Connection established");
    	  DbUtils db = (DbUtils) context.getBean("DbUtils");
    	  db.setCon(con);
    	  List<Regions>rlist=db.getAll();
//    	  for(Regions r:rlist) {
//    		  System.out.println(r.getRid()+" "+r.getRname());
//    	  }
    	  
//    	  Regions r = db.addRegion(new Regions("myregion",99));
//    	  System.out.println(r.getRid()+" "+r.getRname());
    	  
    	  
    	  System.out.println(db.deleteRegion(1));
    	  
//    	  Regions r = db.updateRegion(new Regions("myAsia",3));
//    	  System.out.println(r.getRid()+" "+r.getRname());
    	  
    	  
    	  
    }
}
