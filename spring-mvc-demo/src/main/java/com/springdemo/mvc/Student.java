package com.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName, lastName,country,favLanguage;
	private LinkedHashMap <String,String> countryOptions;
	private String[] OS;
	
	
	Student(){
		countryOptions = new LinkedHashMap();
		countryOptions.put("India", "India");
		countryOptions.put("US", "US");
		countryOptions.put("UK", "UK");
		countryOptions.put("Germany", "Germany");
		countryOptions.put("Maldives", "Maldives");
		
		
	}
	public String getFavLanguage() {
		return favLanguage;
	}

	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}


	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String[] getOS() {
		return OS;
	}
	public void setOS(String[] oS) {
		OS = oS;
	}
	
	

}
