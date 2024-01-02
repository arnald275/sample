package com.example.dependency_injection.setter_injection;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterBasedInjection {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/resources/SetterInjection.xml");
        Player con  = ctx.getBean("player",Player.class);
        System.out.println(con.getName()+"  "+con.getCity());
	}
}
