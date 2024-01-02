package com.example.dependency_injection.static_factory_method;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticFactoryMethod {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/resources/StaticFactoryBeanMethod.xml");
        Connection con  = ctx.getBean("CONNECTION",Connection.class);
        con.close();
	}
}
