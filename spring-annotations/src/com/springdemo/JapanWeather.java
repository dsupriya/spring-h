package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class JapanWeather implements Weather {

	@Override
	public String getWeather() {
		return "JapanWeather is Cold and Windy";
	}

}
