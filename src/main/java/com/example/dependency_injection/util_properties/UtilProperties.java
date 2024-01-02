package com.example.dependency_injection.util_properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.sql.SQLException;
import java.util.Properties;

public class UtilProperties {
	
	public static void main(String[] args) throws SQLException {
	  ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/resources/UtilProperties.xml");
      Properties devConfig  = ctx.getBean("devConfig",Properties.class);
      System.out.println(devConfig.getProperty("db.usr"));
	}

}
