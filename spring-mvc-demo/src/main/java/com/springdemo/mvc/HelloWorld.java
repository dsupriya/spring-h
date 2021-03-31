package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@RequestMapping("/processFormV2")
	public String processPageV2(HttpServletRequest request, Model model) {
		
		String studentName = request.getParameter("studentName");
		String studentNameCaps = studentName.toUpperCase();
		model.addAttribute("data",studentNameCaps);
		return "process-page-v2";
		
	}
	@RequestMapping("/processFormV3")
	public String processPageV3(@RequestParam("studentName") String studentName, Model model) {
		
		//String studentName = request.getParameter("studentName");
		String studentNameCaps = "Hey hi there from V3"+studentName.toUpperCase();
		model.addAttribute("data",studentNameCaps);
		return "process-page-v2";
		
	}


}
