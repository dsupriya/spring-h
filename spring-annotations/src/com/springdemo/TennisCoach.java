package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Application Context
@Component

public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("japanWeather")
	private Weather weatherService;
	
	
	
	
	
	TennisCoach(){
		System.out.println("Inside No arg constructor here");
	
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Do back-hand pratice for 30 min";
	}
		@Override
	public String getWeather() {
			return  weatherService.getWeather();
	}
	
	

}
