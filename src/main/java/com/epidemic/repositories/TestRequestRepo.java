package com.epidemic.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.epidemic.joinclass;
import com.epidemic.model.TestRequest;

public interface TestRequestRepo extends CrudRepository<TestRequest,Long> {

	TestRequest findById(int report_id);
	
	//@Query(value="select * from testrequest tr where tr.patient_id=7",nativeQuery=true)
	TestRequest findByPatientId(int patientId);
	
	//@Query(" select new com.epidemic.joinclass(t.patient_id, t.report_id, p.name) from testrequest t join t.Patient p ")
	List<TestRequest> findByHwId(int hwId); 
	
	@Query(" SELECT new com.epidemic.joinclass(t.patientId, t.id, p.name ,t.hwId) FROM TestRequest t JOIN t.patient p WHERE t.hwId= :id  ")
	public List<joinclass> getInfo(@Param("id") int id);
	
	void deleteByHwId(int hw_id);
}
