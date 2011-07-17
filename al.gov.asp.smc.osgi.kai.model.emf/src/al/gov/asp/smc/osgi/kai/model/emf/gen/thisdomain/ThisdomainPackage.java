/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.ThisdomainFactory
 * @model kind="package"
 * @generated
 */
public interface ThisdomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "thisdomain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://thisdomain/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "thisdomain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThisdomainPackage eINSTANCE = al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl.ThisdomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl.PersonImpl
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl.ThisdomainPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Employed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IS_EMPLOYED_BY = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl.CompanyImpl <em>Company</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl.CompanyImpl
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl.ThisdomainPackageImpl#getCompany()
	 * @generated
	 */
	int COMPANY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Employs Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__EMPLOYS_PERSON = 1;

	/**
	 * The number of structural features of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the reference '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person#getIsEmployedBy <em>Is Employed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Employed By</em>'.
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person#getIsEmployedBy()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_IsEmployedBy();

	/**
	 * Returns the meta object for class '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Company <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company</em>'.
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Company
	 * @generated
	 */
	EClass getCompany();

	/**
	 * Returns the meta object for the attribute '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Company#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Company#getName()
	 * @see #getCompany()
	 * @generated
	 */
	EAttribute getCompany_Name();

	/**
	 * Returns the meta object for the reference list '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Company#getEmploysPerson <em>Employs Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employs Person</em>'.
	 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Company#getEmploysPerson()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_EmploysPerson();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ThisdomainFactory getThisdomainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl.PersonImpl
		 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl.ThisdomainPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Is Employed By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__IS_EMPLOYED_BY = eINSTANCE.getPerson_IsEmployedBy();

		/**
		 * The meta object literal for the '{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl.CompanyImpl <em>Company</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl.CompanyImpl
		 * @see al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl.ThisdomainPackageImpl#getCompany()
		 * @generated
		 */
		EClass COMPANY = eINSTANCE.getCompany();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY__NAME = eINSTANCE.getCompany_Name();

		/**
		 * The meta object literal for the '<em><b>Employs Person</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__EMPLOYS_PERSON = eINSTANCE.getCompany_EmploysPerson();

	}

} //ThisdomainPackage
