package com.rough;

public class BaseballCoach implements Coach {
	private Weather weather;
	
	
	BaseballCoach(Weather weather)
	{
		this.weather = weather;
	}
	
	public String getWorkout() {
		return ("called from BaseballCoach");
	}
	public void init()
	{
		System.out.println("BaseballCoach object is initiating");
		
	}
	public void destroy()
	{
		System.out.println("BaseballCoach object is destorying");
		
	}

	@Override
	public String getWeather() {
		return weather.getWeather();
		 
	}

}
