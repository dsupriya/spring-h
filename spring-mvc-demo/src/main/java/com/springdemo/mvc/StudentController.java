package com.springdemo.mvc;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
@RequestMapping("/Student")
public class StudentController {
	
	@RequestMapping("/ShowForm")
	public String ShowForm(Model model) {
		Student studentOb = new Student();
		model.addAttribute("student", studentOb);
		return "student-show-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student studentOb) {
		System.out.println("Log "+studentOb.getFirstName() + " "+ studentOb.getLastName());
		return "student-confirm-form";
	}
	
	

}
