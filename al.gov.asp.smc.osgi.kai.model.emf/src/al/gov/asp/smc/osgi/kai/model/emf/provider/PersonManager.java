package al.gov.asp.smc.osgi.kai.model.emf.provider;

import java.util.ArrayList;
import java.util.List;

import al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Company;
import al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person;
import al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.ThisdomainFactory;

import com.siemens.ct.pm.model.IPerson;
import com.siemens.ct.pm.model.IPersonManager;

public class PersonManager implements IPersonManager {
	
	
	
	
	private ArrayList<IPerson> persons = new ArrayList<IPerson>();

	public PersonManager() {
		
		Company company = ThisdomainFactory.eINSTANCE.createCompany();
		company.setName("ASP EMF");
		Person person = ThisdomainFactory.eINSTANCE.createPerson();
		person.setFirstName("SopotEMF");
		person.setLastName("CelaEMF");
		person.setIsEmployedBy(company);
		
		persons.add(new EMFPerson(person.getFirstName(),person.getLastName(),person.getIsEmployedBy().getName()));
	}

	@Override
	public List<IPerson> getPersons() {
		
		return persons;
	}

	@Override
	public void deletePerson(IPerson selectedPerson) {
		// TODO Auto-generated method stub

	}

}
