/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Company#getName <em>Name</em>}</li>
 *   <li>{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Company#getEmploysPerson <em>Employs Person</em>}</li>
 * </ul>
 * </p>
 *
 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.ThisdomainPackage#getCompany()
 * @model
 * @generated
 */
public interface Company extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.ThisdomainPackage#getCompany_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Company#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Employs Person</b></em>' reference list.
	 * The list contents are of type {@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person}.
	 * It is bidirectional and its opposite is '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person#getIsEmployedBy <em>Is Employed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employs Person</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employs Person</em>' reference list.
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.ThisdomainPackage#getCompany_EmploysPerson()
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person#getIsEmployedBy
	 * @model opposite="isEmployedBy" required="true"
	 * @generated
	 */
	EList<Person> getEmploysPerson();

} // Company
