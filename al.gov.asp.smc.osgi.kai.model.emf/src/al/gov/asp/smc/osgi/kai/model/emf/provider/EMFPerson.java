package al.gov.asp.smc.osgi.kai.model.emf.provider;

import com.siemens.ct.pm.model.IPerson;

public class EMFPerson implements IPerson {

	private String firstName;
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	private String lastName;
	private String company;
	
	
	
	public EMFPerson(String firstName, String lastName, String company) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
	}

	
}
