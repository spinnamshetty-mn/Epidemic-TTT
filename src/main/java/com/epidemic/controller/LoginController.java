package com.epidemic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.epidemic.*;
import com.epidemic.model.HealthWorker;
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
		//hw_service.Update(7); // approving ///updating record// remove after testing
		//hw_service.Delete(5);
		return "register";
	}
	
	////////--------------------signup---------------------------////
	
	@RequestMapping("/signup") //catch the type
	public String signup(@RequestParam("Type") String type) {
		if(type.equals("Patient")) {
			return "patient";   //redirect to new jsp pages
		}
		if(type.equals("HealthWorker")) {
			return "healthworker";
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
			
			
			
			return "login"; // redirect to home
		}
		
		return "already_exists"; // pop up 
	}
	
	@RequestMapping("/signup/healthworker")
	public String signupPatient(@ModelAttribute HealthWorker hw,Model model) {
		boolean st=false;
		 st=hw_service.addWorker(hw);
		 model.addAttribute("healthworker",hw);
		System.out.println("added to db");
		if(st==true) {
			
			
			return "login"; // redirect to login 
		}
		
		return "already_exists"; // pop up 
	}
	 
	///-------------------------Login--------------------------------------------------
	
	
	@RequestMapping("/signin") // sign in
	public String type_login() {
		
		return "login";
	}
	
	@RequestMapping("/login") //catch the type
	public String login(@RequestParam("category") String type, @RequestParam("email") String email, @RequestParam("password") String password,Model model) {
		
		if(type.equals("Patient") &&  patient_service.validate(email,password)) {
			int id = patient_service.searchPatient(email).getId();
			return "redirect:/patient/" + id +"/p_home";  //redirect to new jsp pages patient/home page
		}	
			if(type.equals("Health Worker") && hw_service.validate(email,password)) {
				HealthWorker hw_db=hw_service.searchWorker(email);
				if(hw_db.getApproved_status().equals("pending")) {
					return "pending_hw"; // on same page --> Sorry your request is still pending...
				}
				return "redirect:/hw/" + hw_db.getId() +"/hdash"; // //redirect to new jsp pages hw/home page
			}
			
			return "already_exists";
		
	}
	
}
