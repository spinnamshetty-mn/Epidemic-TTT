package epidemic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Government {
	
	private String id;
	private String password;
	private String xyz;
	
	private List<Patient> patients=new ArrayList<Patient>();
	private List<HealthWorker> healthworker=new ArrayList<HealthWorker>();
	private HashMap<String,Integer> location=new HashMap<String,Integer>();
	private HashMap<String,Boolean> zone=new HashMap<String, Boolean>();
	
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Government(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	
	public boolean getApprovalRequest() {
		//get list of approval of HW
		return true;
	}
	public boolean giveApproval() {
		return true;
	}
	public boolean viewRequests() {
		return true;
	}
	public boolean viewResults() {
		return true;
	}
	public boolean viewUpdatedStatus() {
		return true;
	}
	public boolean searchContacted(Patient patient) {
		//get the value of the location,update  and check the condition
		//if cond satisfied then call setzone 
		return true;
	}
	public boolean setZone() {
		// check if location exists in zone hmap and update
		return true;
	}
	public boolean viewPositiveResults() {
			return true;
	}
}
