package epidemic;

import java.util.*;

public class Patient {
	String name;
	String username;
	String location;
	String email;
	String password;
	String healthworker;
	List<Integer> list=new ArrayList<Integer>();
	
	public Patient(String name, String username, String address, String email, String password) {
		super();
		this.name = name;
		this.username = username;
		this.location = address;
		this.email = email;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return location;
	}
	public void setAddress(String address) {
		this.location = address;
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
	
}
