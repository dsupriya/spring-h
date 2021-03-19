package com.rough;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		Coach test1 = context.getBean("BaseballCoach", Coach.class);
		System.out.println(test1);
		context.close();
		

	}

}
