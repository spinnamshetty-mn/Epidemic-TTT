package com.epidemic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.epidemic.joinclass;
import com.epidemic.model.TestRequest;
import com.epidemic.repositories.TestRequestRepo;

@Service
@Transactional
public class TestRequestService {
	
	@Autowired
	TestRequestRepo test_request_repo;
	
	public TestRequest findTest(int patient_id) {
		return test_request_repo.findByPatientId(patient_id);
	}
	
	public void add(TestRequest test) {
		test_request_repo.save(test);
	}
	
	public  List<TestRequest> displayRequest(int hwId){
		
		return test_request_repo.findByHwId( hwId);
	}

	public List<joinclass> getInformation(int id) {
		// TODO Auto-generated method stub
		
		return test_request_repo.getInfo(id);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public void MoveRequest(int hw_id) {
		test_request_repo.deleteByHwId(hw_id);
	}
	
	public List<TestRequest> acceptRequest(int hw_id) {
		List<TestRequest> list=test_request_repo.findByHwId(hw_id);
		for(int i=0;i<list.size();i++) {
			
			int hw_id2=list.get(i).getHw_id();
			MoveRequest(hw_id2);   //// save it to test result table with extra coloumn entry (status) as processing...
		}
		return list;
		
	}
	public List<TestRequest> rejectRequest(int hw_id) {
		List<TestRequest> list=test_request_repo.findByHwId(hw_id);
		for(int i=0;i<list.size();i++) {
			int hw_id2=list.get(i).getHw_id();
			test_request_repo.deleteByHwId(hw_id2);
		}
		return list;
		
	}
	*/
	
	
}
