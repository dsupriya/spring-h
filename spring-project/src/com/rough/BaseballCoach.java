package com.rough;

public class BaseballCoach implements Coach {
	private Weather weather;
	//setter
	BaseballCoach(Weather weather)
	{
		this.weather = weather;
	}
	
	public String getWorkout() {
		return ("called from BaseballCoach");
	}

	@Override
	public String getWeather() {
		return weather.getWeather();
		 
	}

}
