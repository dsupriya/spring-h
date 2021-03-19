package com.rough;

public class CricketCoach implements Coach {
	private Weather weather;
	private String name;
	private String email;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setting name");
		this.name = name;
	}

	public String getEmail() {
		
		return email;
	}

	public void setEmail(String email) {
		System.out.println("setting email");
		this.email = email;
	}

	
	
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
