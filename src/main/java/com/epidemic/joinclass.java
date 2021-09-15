package com.epidemic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class joinclass {
	
	private int patient_id;
	
	private long report_id;
	
	private String name;
	
	private int hw_id;
	
	

	public joinclass(){
		
	}
	
	public joinclass(int patient_id, long report_id, String name,int hw_id) {
		super();
		this.patient_id = patient_id;
		this.report_id = report_id;
		this.name = name;
		this.hw_id=hw_id;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public long getReport_id() {
		return report_id;
	}

	public void setReport_id(long report_id) {
		this.report_id = report_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getHw_id() {
		return hw_id;
	}

	public void setHw_id(int hw_id) {
		this.hw_id = hw_id;
	}

	
	
	
	
}
