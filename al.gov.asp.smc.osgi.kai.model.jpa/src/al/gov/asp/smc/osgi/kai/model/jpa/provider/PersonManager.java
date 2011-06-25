package al.gov.asp.smc.osgi.kai.model.jpa.provider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.eclipse.persistence.jpa.osgi.PersistenceProvider;

import al.gov.asp.smc.osgi.kai.model.jpa.entites.Person;

import com.siemens.ct.pm.model.IPerson;
import com.siemens.ct.pm.model.IPersonManager;

public class PersonManager implements IPersonManager {

	private EntityManagerFactory emf;
	private EntityManager em;
	private List<IPerson> persons = new ArrayList<IPerson>();

	@SuppressWarnings({ "unchecked" })
	public PersonManager() {
		HashMap<String, ClassLoader> properties = new HashMap<String, ClassLoader>();
		properties.put(PersistenceUnitProperties.CLASSLOADER, this.getClass()
				.getClassLoader());
		emf = new PersistenceProvider().createEntityManagerFactory(
				"al.gov.asp.smc.osgi.kai.model.jpa", properties);
		em = emf.createEntityManager();
		
		List<Person> resultList = em.createQuery("select p from Person p").getResultList();
		for (Person person : resultList) {
			
			persons.add(new CPerson(person.getFirstname(), person.getLastname(), person.getCompany().getName()));
			
		}
		
	}
	
	@Override
	public List<IPerson> getPersons() {
		return persons;
	}

	@Override
	public void deletePerson(IPerson selectedPerson) {
		
		persons.remove(selectedPerson);
		em.getTransaction().begin();
		em.createQuery("delete from Person p where p.firstName="+selectedPerson.getFirstName()+" and p.lastName="+selectedPerson.getLastName());
		em.getTransaction().commit();

	}

}
