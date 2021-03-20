package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	Weather weatherService;
	
	@Autowired
	TennisCoach(Weather weatherService){
		this.weatherService =weatherService;
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
