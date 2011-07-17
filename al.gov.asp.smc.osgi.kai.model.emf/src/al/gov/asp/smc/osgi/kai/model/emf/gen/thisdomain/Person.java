/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person#getIsEmployedBy <em>Is Employed By</em>}</li>
 * </ul>
 * </p>
 *
 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.ThisdomainPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.ThisdomainPackage#getPerson_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.ThisdomainPackage#getPerson_LastName()
	 * @model
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Is Employed By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Company#getEmploysPerson <em>Employs Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Employed By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Employed By</em>' reference.
	 * @see #setIsEmployedBy(Company)
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.ThisdomainPackage#getPerson_IsEmployedBy()
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Company#getEmploysPerson
	 * @model opposite="employsPerson" required="true"
	 * @generated
	 */
	Company getIsEmployedBy();

	/**
	 * Sets the value of the '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person#getIsEmployedBy <em>Is Employed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Employed By</em>' reference.
	 * @see #getIsEmployedBy()
	 * @generated
	 */
	void setIsEmployedBy(Company value);

} // Person
