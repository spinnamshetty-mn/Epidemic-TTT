package com.epidemic.model;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="Patient")

public class Patient {
	
	@Id
	@Column(name="patient_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private	String name;
	private	String address;
	private	String email;
	private	String password;
	//private	String healthworker;
	private	Long mobile;
	//private	List<Integer> list=new ArrayList<Integer>();
	
	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Patient() {
		
	}
	
	public Patient(String name, String address, String email, String password,String mobile) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
		this.mobile=Long.parseLong(mobile);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	
	/*
	public int getResult(){
		//System.out.print("Result is generated");
		
		return 0;
	}
	
	public int requestTest() {
		//System.out.print("Result is requested");
		//update healthworker
		return 1;
		//boolean
	}
	
	public int viewRecommendation() {
		return 1;
	}
	
	public int uploadStatus() {
		return 1;
	}
	
	public List<Integer> getList(){
		return list;
	}
	
	public void updateList(){
		// update list;
	}
	*/
	
}
