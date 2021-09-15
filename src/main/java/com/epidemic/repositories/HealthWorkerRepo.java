package com.epidemic.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.epidemic.model.HealthWorker;

public interface HealthWorkerRepo extends CrudRepository<HealthWorker,Integer>{
	HealthWorker findByEmail(String email);
	HealthWorker findById(int id);
	void deleteById(int id);
	
	@Query(value="select * from healthworker hw where hw.approved_status like 'approved' " ,nativeQuery=true)
	List<HealthWorker> findByActiveHw();
	
	
}
