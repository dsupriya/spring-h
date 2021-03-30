package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "hello-world";
	}
	@RequestMapping("/processForm")
	public String processPage() {
		return "process-page";
		
	}

}
