package com.example.dependency_injection.util_constant;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UtilConstant {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/resources/UtilConstant.xml");
//        Week day  = ctx.getBean("day",Week.class);
//        System.out.println(day);
        
        DOB dob  = ctx.getBean("dob",DOB.class);
        System.out.println(dob);
	}

}
