package com.epidemic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.epidemic.*;
import com.epidemic.model.Patient;
import com.epidemic.services.GovernmentService;
import com.epidemic.services.HealthWorkerService;
import com.epidemic.services.PatientService;


@Controller
public class LoginController {
	
	@Autowired
	PatientService patient_service;
	
	@Autowired
	GovernmentService gov_service;
	
	@Autowired
	HealthWorkerService hw_service;
	
	@RequestMapping("/register")//first
	public String type() {
		return "first";
	}
	
	////////--------------------signup---------------------------////
	
	@RequestMapping("/signup") //catch the type
	public String signup(@RequestParam("Type") String type) {
		if(type.equals("Patient")) {
			return "patient";   //redirect to new jsp pages
		}
		if(type.equals("HealthWorker")) {
			return "redirect:/signup/healthworker";
		}
		return "";
	}
	
	@RequestMapping("/signup/patient")
	public String signupPatient(@ModelAttribute Patient patient,Model model) {
		boolean st=false;
		 st=patient_service.addPatient(patient);
		 model.addAttribute("patient",patient);
		System.out.println("added to db");
		if(st==true) {
			
			return "new"; // redirect to login 
		}
		
		return "error2"; // pop up 
	}
	 
	///-------------------------Login--------------------------------------------------
	
	
	@RequestMapping("/signin") // sign in
	public String type_login() {
		return "login";
	}
	
	@RequestMapping("/login") //catch the type
	public String login(@RequestParam("category") String type, @RequestParam("email") String email, @RequestParam("password") String password,Model model) {
		
		model.addAttribute("email",email);
		if(type.equals("Patient") &&  patient_service.validate(email,password)) {
			return "success";   //redirect to new jsp pages /home page
		}
		if(type.equals("Health Worker")) {
			return "redirect:/signup/healthworker";
		}
		
		return "";
	}
	
}
