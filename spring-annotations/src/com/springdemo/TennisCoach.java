package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do back-hand pratice for 30 min";
	}

}
