package al.gov.asp.smc.osgi.kai.model.jpa.entites;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PERSON database table.
 * 
 */
@Entity
@Table(name="PERSON")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=50)
	private String firstname;

	@Column(length=50)
	private String lastname;

	//bi-directional many-to-one association to Company
    @ManyToOne
	@JoinColumn(name="COMPANY_ID", nullable=false)
	private Company company;

    public Person() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
}