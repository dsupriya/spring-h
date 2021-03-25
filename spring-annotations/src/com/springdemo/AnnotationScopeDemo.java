package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AnnotationScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("tennisCoach",Coach.class);
		Coach coach2 = context.getBean("tennisCoach",Coach.class);
		System.out.println(coach);
		System.out.println(coach2);
		
		context.close();

	}

}
