/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl;

import al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Company;
import al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.Person;
import al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.ThisdomainPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl.PersonImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link al.gov.asp.smc.osgi.kai.model.emf.gen.thisdomain.impl.PersonImpl#getIsEmployedBy <em>Is Employed By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsEmployedBy() <em>Is Employed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEmployedBy()
	 * @generated
	 * @ordered
	 */
	protected Company isEmployedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThisdomainPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThisdomainPackage.PERSON__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThisdomainPackage.PERSON__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company getIsEmployedBy() {
		if (isEmployedBy != null && isEmployedBy.eIsProxy()) {
			InternalEObject oldIsEmployedBy = (InternalEObject)isEmployedBy;
			isEmployedBy = (Company)eResolveProxy(oldIsEmployedBy);
			if (isEmployedBy != oldIsEmployedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThisdomainPackage.PERSON__IS_EMPLOYED_BY, oldIsEmployedBy, isEmployedBy));
			}
		}
		return isEmployedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company basicGetIsEmployedBy() {
		return isEmployedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsEmployedBy(Company newIsEmployedBy, NotificationChain msgs) {
		Company oldIsEmployedBy = isEmployedBy;
		isEmployedBy = newIsEmployedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThisdomainPackage.PERSON__IS_EMPLOYED_BY, oldIsEmployedBy, newIsEmployedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEmployedBy(Company newIsEmployedBy) {
		if (newIsEmployedBy != isEmployedBy) {
			NotificationChain msgs = null;
			if (isEmployedBy != null)
				msgs = ((InternalEObject)isEmployedBy).eInverseRemove(this, ThisdomainPackage.COMPANY__EMPLOYS_PERSON, Company.class, msgs);
			if (newIsEmployedBy != null)
				msgs = ((InternalEObject)newIsEmployedBy).eInverseAdd(this, ThisdomainPackage.COMPANY__EMPLOYS_PERSON, Company.class, msgs);
			msgs = basicSetIsEmployedBy(newIsEmployedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThisdomainPackage.PERSON__IS_EMPLOYED_BY, newIsEmployedBy, newIsEmployedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThisdomainPackage.PERSON__IS_EMPLOYED_BY:
				if (isEmployedBy != null)
					msgs = ((InternalEObject)isEmployedBy).eInverseRemove(this, ThisdomainPackage.COMPANY__EMPLOYS_PERSON, Company.class, msgs);
				return basicSetIsEmployedBy((Company)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThisdomainPackage.PERSON__IS_EMPLOYED_BY:
				return basicSetIsEmployedBy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThisdomainPackage.PERSON__FIRST_NAME:
				return getFirstName();
			case ThisdomainPackage.PERSON__LAST_NAME:
				return getLastName();
			case ThisdomainPackage.PERSON__IS_EMPLOYED_BY:
				if (resolve) return getIsEmployedBy();
				return basicGetIsEmployedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ThisdomainPackage.PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case ThisdomainPackage.PERSON__LAST_NAME:
				setLastName((String)newValue);
				return;
			case ThisdomainPackage.PERSON__IS_EMPLOYED_BY:
				setIsEmployedBy((Company)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ThisdomainPackage.PERSON__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case ThisdomainPackage.PERSON__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case ThisdomainPackage.PERSON__IS_EMPLOYED_BY:
				setIsEmployedBy((Company)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ThisdomainPackage.PERSON__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case ThisdomainPackage.PERSON__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case ThisdomainPackage.PERSON__IS_EMPLOYED_BY:
				return isEmployedBy != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
