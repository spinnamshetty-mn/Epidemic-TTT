package com.epidemic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.epidemic.joinclass;
import com.epidemic.model.HealthWorker;
import com.epidemic.model.Patient;
import com.epidemic.model.TestRequest;
import com.epidemic.repositories.PatientRepo;
import com.epidemic.services.HealthWorkerService;
import com.epidemic.services.TestRequestService;


@Controller
@RequestMapping("/hw")
public class HealthWorkerController {
	
	@Autowired
	TestRequestService test_request_service;
	
	@Autowired
	HealthWorkerService hw_service;
	
	@Autowired
	PatientRepo patient_repo;
	
	
	
	@RequestMapping ("/{id}/hdash")    // display patient info
	public String home(@PathVariable("id")  int id,Model model) {
		HealthWorker hw=hw_service.searchWorker(id);
		model.addAttribute("name", hw.getName());
		model.addAttribute("id",hw.getId());
		model.addAttribute("address",hw.getAddress());
		model.addAttribute("type",hw.getType());
		return "h_worker/hdash";
	}
	
	@RequestMapping("/{id}/find_request")
	public String findRequest(@PathVariable("id") int id,Model model) {
		
		List<joinclass> request_list=test_request_service.getInformation(id);
		/*
		List<Patient> patient_list=new ArrayList<>();
		for(int i=0;i<request_list.size();i++) {
			patient_list.add(patient_repo.findById(request_list.get(i).getPatientId()));
		}
		model.addAttribute("patient_list",patient_list);
		*/
		model.addAttribute("request_list",request_list);
		return "h_worker/find_request";
	}
	

	//  testrequest->> p.id ->> patient table -->> patientlist
	
	
	
	
	@RequestMapping ("{id}/recommendations")
	public String recommendations() {
		return "pat/recommendations";
	}
	@RequestMapping ("{id}/results")
	public String results() {
		return "pat/results";
	}
	@RequestMapping ("{id}/update")
	public String update() {
		return "pat/update";
	}
	@RequestMapping ("{id}/settings")
	public String settings() {
		return "pat/settings";
	}
}
