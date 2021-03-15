package com.rough;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach test = context.getBean("BaseballCoach",Coach.class);
		String s = (test.getWorkout());
		System.out.println (s);
		System.out.println(test.getWeather());
		//test = context.getBean("RunningCoach",Coach.class);
		//s = (test.getWorkout());
		//System.out.println (s);
		context.close();
		

	}

}
