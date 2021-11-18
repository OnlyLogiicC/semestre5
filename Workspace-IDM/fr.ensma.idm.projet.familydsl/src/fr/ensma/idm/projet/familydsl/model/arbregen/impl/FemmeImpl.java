/**
 */
package fr.ensma.idm.projet.familydsl.model.arbregen.impl;

import fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage;
import fr.ensma.idm.projet.familydsl.model.arbregen.Femme;
import fr.ensma.idm.projet.familydsl.model.arbregen.Personne;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Femme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.FemmeImpl#getEnfants <em>Enfants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FemmeImpl extends PersonneImpl implements Femme {
	/**
	 * The cached value of the '{@link #getEnfants() <em>Enfants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnfants()
	 * @generated
	 * @ordered
	 */
	protected EList<Personne> enfants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FemmeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArbregenPackage.Literals.FEMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Personne> getEnfants() {
		if (enfants == null) {
			enfants = new EObjectWithInverseResolvingEList<Personne>(Personne.class, this, ArbregenPackage.FEMME__ENFANTS, ArbregenPackage.PERSONNE__MERE);
		}
		return enfants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArbregenPackage.FEMME__ENFANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnfants()).basicAdd(otherEnd, msgs);
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
			case ArbregenPackage.FEMME__ENFANTS:
				return ((InternalEList<?>)getEnfants()).basicRemove(otherEnd, msgs);
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
			case ArbregenPackage.FEMME__ENFANTS:
				return getEnfants();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArbregenPackage.FEMME__ENFANTS:
				getEnfants().clear();
				getEnfants().addAll((Collection<? extends Personne>)newValue);
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
			case ArbregenPackage.FEMME__ENFANTS:
				getEnfants().clear();
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
			case ArbregenPackage.FEMME__ENFANTS:
				return enfants != null && !enfants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FemmeImpl
