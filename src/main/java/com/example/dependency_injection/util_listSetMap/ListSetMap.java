package com.example.dependency_injection.util_listSetMap;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

class ListSetMap {

	public static void main(String[] args) {
//		You can also explicitly control the exact type of List that will be instantiated and populated via the use of the 'list-class' attribute on the <util:list/> element. For example, if we really need a java.util.LinkedList to be instantiate
		ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/resources/ListSetMap.xml");
        List  l1  = ctx.getBean("emailsArrayList",ArrayList.class);
        List  l2  = ctx.getBean("emailsLinkedList",LinkedList.class);
        System.out.println(l1);
        System.out.println(l2);
	}

}
