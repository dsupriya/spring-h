package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class IndiaWeather implements Weather {

	@Override
	public String getWeather() {
		return "Hot and humid"; 
	}

}
