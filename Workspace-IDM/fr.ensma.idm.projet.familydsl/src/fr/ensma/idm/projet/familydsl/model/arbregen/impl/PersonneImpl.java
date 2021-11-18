/**
 */
package fr.ensma.idm.projet.familydsl.model.arbregen.impl;

import fr.ensma.idm.projet.familydsl.model.arbregen.Adresse;
import fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage;
import fr.ensma.idm.projet.familydsl.model.arbregen.Femme;
import fr.ensma.idm.projet.familydsl.model.arbregen.Homme;
import fr.ensma.idm.projet.familydsl.model.arbregen.Personne;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.PersonneImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.PersonneImpl#getAge <em>Age</em>}</li>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.PersonneImpl#getSesParents <em>Ses Parents</em>}</li>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.PersonneImpl#getHabitation <em>Habitation</em>}</li>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.PersonneImpl#getMere <em>Mere</em>}</li>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.PersonneImpl#getPere <em>Pere</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PersonneImpl extends MinimalEObjectImpl.Container implements Personne {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSesParents() <em>Ses Parents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSesParents()
	 * @generated
	 * @ordered
	 */
	protected static final String SES_PARENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSesParents() <em>Ses Parents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSesParents()
	 * @generated
	 * @ordered
	 */
	protected String sesParents = SES_PARENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHabitation() <em>Habitation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHabitation()
	 * @generated
	 * @ordered
	 */
	protected Adresse habitation;

	/**
	 * The cached value of the '{@link #getMere() <em>Mere</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMere()
	 * @generated
	 * @ordered
	 */
	protected Femme mere;

	/**
	 * The cached value of the '{@link #getPere() <em>Pere</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPere()
	 * @generated
	 * @ordered
	 */
	protected Homme pere;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArbregenPackage.Literals.PERSONNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArbregenPackage.PERSONNE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArbregenPackage.PERSONNE__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSesParents() {
		return sesParents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSesParents(String newSesParents) {
		String oldSesParents = sesParents;
		sesParents = newSesParents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArbregenPackage.PERSONNE__SES_PARENTS, oldSesParents, sesParents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adresse getHabitation() {
		return habitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHabitation(Adresse newHabitation, NotificationChain msgs) {
		Adresse oldHabitation = habitation;
		habitation = newHabitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArbregenPackage.PERSONNE__HABITATION, oldHabitation, newHabitation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHabitation(Adresse newHabitation) {
		if (newHabitation != habitation) {
			NotificationChain msgs = null;
			if (habitation != null)
				msgs = ((InternalEObject)habitation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArbregenPackage.PERSONNE__HABITATION, null, msgs);
			if (newHabitation != null)
				msgs = ((InternalEObject)newHabitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArbregenPackage.PERSONNE__HABITATION, null, msgs);
			msgs = basicSetHabitation(newHabitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArbregenPackage.PERSONNE__HABITATION, newHabitation, newHabitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Femme getMere() {
		if (mere != null && mere.eIsProxy()) {
			InternalEObject oldMere = (InternalEObject)mere;
			mere = (Femme)eResolveProxy(oldMere);
			if (mere != oldMere) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArbregenPackage.PERSONNE__MERE, oldMere, mere));
			}
		}
		return mere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Femme basicGetMere() {
		return mere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMere(Femme newMere, NotificationChain msgs) {
		Femme oldMere = mere;
		mere = newMere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArbregenPackage.PERSONNE__MERE, oldMere, newMere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMere(Femme newMere) {
		if (newMere != mere) {
			NotificationChain msgs = null;
			if (mere != null)
				msgs = ((InternalEObject)mere).eInverseRemove(this, ArbregenPackage.FEMME__ENFANTS, Femme.class, msgs);
			if (newMere != null)
				msgs = ((InternalEObject)newMere).eInverseAdd(this, ArbregenPackage.FEMME__ENFANTS, Femme.class, msgs);
			msgs = basicSetMere(newMere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArbregenPackage.PERSONNE__MERE, newMere, newMere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Homme getPere() {
		if (pere != null && pere.eIsProxy()) {
			InternalEObject oldPere = (InternalEObject)pere;
			pere = (Homme)eResolveProxy(oldPere);
			if (pere != oldPere) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArbregenPackage.PERSONNE__PERE, oldPere, pere));
			}
		}
		return pere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Homme basicGetPere() {
		return pere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPere(Homme newPere, NotificationChain msgs) {
		Homme oldPere = pere;
		pere = newPere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArbregenPackage.PERSONNE__PERE, oldPere, newPere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPere(Homme newPere) {
		if (newPere != pere) {
			NotificationChain msgs = null;
			if (pere != null)
				msgs = ((InternalEObject)pere).eInverseRemove(this, ArbregenPackage.HOMME__ENFANTS, Homme.class, msgs);
			if (newPere != null)
				msgs = ((InternalEObject)newPere).eInverseAdd(this, ArbregenPackage.HOMME__ENFANTS, Homme.class, msgs);
			msgs = basicSetPere(newPere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArbregenPackage.PERSONNE__PERE, newPere, newPere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String afficher() {
		StringBuffer sb = new StringBuffer() ;
		sb.append("Prenom : ").append(this.getNom())
				.append(" Age : ").append(this.getAge())
				.append("Adresse : ").append(this.getHabitation()) ;
		return sb.toString() ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArbregenPackage.PERSONNE__MERE:
				if (mere != null)
					msgs = ((InternalEObject)mere).eInverseRemove(this, ArbregenPackage.FEMME__ENFANTS, Femme.class, msgs);
				return basicSetMere((Femme)otherEnd, msgs);
			case ArbregenPackage.PERSONNE__PERE:
				if (pere != null)
					msgs = ((InternalEObject)pere).eInverseRemove(this, ArbregenPackage.HOMME__ENFANTS, Homme.class, msgs);
				return basicSetPere((Homme)otherEnd, msgs);
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
			case ArbregenPackage.PERSONNE__HABITATION:
				return basicSetHabitation(null, msgs);
			case ArbregenPackage.PERSONNE__MERE:
				return basicSetMere(null, msgs);
			case ArbregenPackage.PERSONNE__PERE:
				return basicSetPere(null, msgs);
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
			case ArbregenPackage.PERSONNE__NOM:
				return getNom();
			case ArbregenPackage.PERSONNE__AGE:
				return getAge();
			case ArbregenPackage.PERSONNE__SES_PARENTS:
				return getSesParents();
			case ArbregenPackage.PERSONNE__HABITATION:
				return getHabitation();
			case ArbregenPackage.PERSONNE__MERE:
				if (resolve) return getMere();
				return basicGetMere();
			case ArbregenPackage.PERSONNE__PERE:
				if (resolve) return getPere();
				return basicGetPere();
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
			case ArbregenPackage.PERSONNE__NOM:
				setNom((String)newValue);
				return;
			case ArbregenPackage.PERSONNE__AGE:
				setAge((Integer)newValue);
				return;
			case ArbregenPackage.PERSONNE__SES_PARENTS:
				setSesParents((String)newValue);
				return;
			case ArbregenPackage.PERSONNE__HABITATION:
				setHabitation((Adresse)newValue);
				return;
			case ArbregenPackage.PERSONNE__MERE:
				setMere((Femme)newValue);
				return;
			case ArbregenPackage.PERSONNE__PERE:
				setPere((Homme)newValue);
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
			case ArbregenPackage.PERSONNE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case ArbregenPackage.PERSONNE__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case ArbregenPackage.PERSONNE__SES_PARENTS:
				setSesParents(SES_PARENTS_EDEFAULT);
				return;
			case ArbregenPackage.PERSONNE__HABITATION:
				setHabitation((Adresse)null);
				return;
			case ArbregenPackage.PERSONNE__MERE:
				setMere((Femme)null);
				return;
			case ArbregenPackage.PERSONNE__PERE:
				setPere((Homme)null);
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
			case ArbregenPackage.PERSONNE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case ArbregenPackage.PERSONNE__AGE:
				return age != AGE_EDEFAULT;
			case ArbregenPackage.PERSONNE__SES_PARENTS:
				return SES_PARENTS_EDEFAULT == null ? sesParents != null : !SES_PARENTS_EDEFAULT.equals(sesParents);
			case ArbregenPackage.PERSONNE__HABITATION:
				return habitation != null;
			case ArbregenPackage.PERSONNE__MERE:
				return mere != null;
			case ArbregenPackage.PERSONNE__PERE:
				return pere != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ArbregenPackage.PERSONNE___AFFICHER:
				return afficher();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(", age: ");
		result.append(age);
		result.append(", sesParents: ");
		result.append(sesParents);
		result.append(')');
		return result.toString();
	}

} //PersonneImpl
