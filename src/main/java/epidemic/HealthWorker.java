package epidemic;

import java.util.ArrayList;
import java.util.List;

public class HealthWorker {
	private String id;
	private String organisation;
	private String password;
	private List<Patient> patients=new ArrayList<Patient>();
	
	
	public HealthWorker(String id, String organisation, String password) {
		super();
		this.id = id;
		this.organisation = organisation;
		this.password = password;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrganisation() {
		return organisation;
	}
	
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean getTestRequest() {
		return true;
	}
	public boolean updateTestResult(Patient patient) {
		return true;
	}
	public boolean getHealthStatus(Patient patient) {
		return true;
	}
	public boolean updateRecommendation(Patient patient) {
		return true;
	}
	public boolean getPatientsList(){
		//get list of Patients (here patients var)
		return true;
	}
	public boolean requestApproval() {
		return true;
	}
	
}
