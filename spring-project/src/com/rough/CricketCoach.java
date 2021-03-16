package com.rough;

public class CricketCoach implements Coach {
	private Weather weather;

	
	
	CricketCoach(){}
	@Override
	public String getWorkout() {
		
		return "Do Bowling for 1 hour";
	}

	@Override
	public String getWeather() {
		
		return "CricketCoach Says "+weather.getWeather();
	}
	public void setWeather(Weather weather)
	{
		this.weather =weather;
	}

}
