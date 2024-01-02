package com.example.dependency_injection.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/resources/LifeCycle.xml");
		LifeCycleDemo con  = ctx.getBean("lifeCycleDemo",LifeCycleDemo.class);
    
	}

}
