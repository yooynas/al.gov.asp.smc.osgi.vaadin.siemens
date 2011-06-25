package al.gov.asp.smc.osgi.kai.model.jpa.provider;

import java.awt.image.ImageProducer;

import com.siemens.ct.pm.model.IPerson;

public class CPerson implements IPerson
{

	private String firstName;
	private String lastName;
	private String company;
	
	public CPerson(String firstName, String lastName, String company) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
	}
	
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

}
