package com.example.dependency_injection.instance_factory_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceFactoryMethod {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/resources/InstanceFactoryBeanMethod.xml");
		for(int i=0;i<5;i++) {
			User u= ctx.getBean("user",User.class);
			System.out.println(u.getName()+"  "+u.getCity());
		}
		
	}

}
