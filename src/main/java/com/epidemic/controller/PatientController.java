package com.epidemic.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.epidemic.model.HealthWorker;
import com.epidemic.model.Patient;
import com.epidemic.model.TestRequest;
import com.epidemic.services.HealthWorkerService;
import com.epidemic.services.PatientService;
import com.epidemic.services.TestRequestService;


@Controller
@RequestMapping("/patient")

public class PatientController {
	
	@Autowired
	PatientService patient_service;
	
	@Autowired
	TestRequestService test_request_service;
	
	@Autowired
	HealthWorkerService hw_service;
	
	@RequestMapping ("/{id}/p_home")    // display patient info
	public String home(@PathVariable("id")  int id,Model model) {
		Patient p=patient_service.searchPatient(id);
		model.addAttribute("name", p.getName());
		model.addAttribute("id",p.getId());
		model.addAttribute("address",p.getAddress());
		
		return "pat/p_home";
	}
	
	
	@RequestMapping ("/{id}/test_request")  // if not already booked -> choose hw from dd and request test
												// else show already booked
												// update in home page as well
												// redirect to test_request/process for validation and booking
	
	public String test_request(@PathVariable("id") int id, Model model ,HttpServletRequest request) {
		
			
		if(test_request_service.findTest(id) !=null) {
			//model.addAttribute("msg", "Oops, Looks Like You Have Already Requested. Try Again Later");
			//System.out.println("Already requested");
			
			
			//String msg1="Already Exists";
			model.addAttribute("msg1","Oops, Looks Like You Have Already Requested. Try Again Later");
		}
		else {
		String hw_id=(String)request.getParameter("hw");
		
		if(hw_id==null) {
			hw_id="sel";
			List<HealthWorker> hw_list=hw_service.findActiveHW();
			for(int i=0;i<hw_list.size();i++) {
				System.out.println(hw_list.get(i).getId());
			}
			model.addAttribute("hw_list",hw_list);
		}
		if(hw_id=="sel") {
			model.addAttribute("msg1","");
			
			return "pat/test_request";
		}
		
		model.addAttribute("msg1","Request Sent");
	
		System.out.println(hw_id);
		TestRequest tr=new TestRequest(id,Integer.parseInt(hw_id));
		test_request_service.add(tr);
		return "pat/test_request";
		
		}
		
		return "pat/test_request";
	}
	@RequestMapping ("/recommendations")
	public String recommendations() {
		return "pat/recommendations";
	}
	@RequestMapping ("/results")
	public String results() {
		return "pat/results";
	}
	@RequestMapping ("patient/update")
	public String update() {
		return "pat/update";
	}
	@RequestMapping ("/settings")
	public String settings() {
		return "pat/settings";
	}
	//---------------------------hw & g controller--------------------------
	/*
	@RequestMapping ("/hdash")
	public String hdash() {
		return "h_worker/hdash";
	}
	@RequestMapping ("/hsettings")
	public String hsettings() {
		return "h_worker/hsettings";
	}
	@RequestMapping ("/status&recommend")
	public String status_recommend() {
		return "h_worker/status&recommend";
	}
	@RequestMapping ("/Upload_results")
	public String upload_results() {
		return "h_worker/Upload_results";
	}
	@RequestMapping ("/find_request")
	public String find_request() {
		return "h_worker/find_request";
	}

	@RequestMapping ("/active_cases")
	public String active_cases() {
		return "g_entity/active_cases";
	}
	@RequestMapping ("/gdash")
	public String gdash() {
		return "g_entity/gdash";
	}
	@RequestMapping ("/gsettings")
	public String gsettings() {
		return "g_entity/gsettings";
	}
	*/
	
	
	
}
