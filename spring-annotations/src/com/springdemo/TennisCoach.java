package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	private Weather weatherService;
	
	
	TennisCoach(){
		System.out.println("Inside No arg constructor");
	
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
