package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class indiaWeather implements Weather {

	@Override
	public String getWeather() {
		return "Hot and humid"; 
	}

}
