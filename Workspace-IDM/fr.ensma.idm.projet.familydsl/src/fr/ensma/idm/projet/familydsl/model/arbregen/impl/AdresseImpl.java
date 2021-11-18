/**
 */
package fr.ensma.idm.projet.familydsl.model.arbregen.impl;

import fr.ensma.idm.projet.familydsl.model.arbregen.Adresse;
import fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adresse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.AdresseImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.AdresseImpl#getRue <em>Rue</em>}</li>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.AdresseImpl#getVille <em>Ville</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdresseImpl extends MinimalEObjectImpl.Container implements Adresse {
	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected int numero = NUMERO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRue() <em>Rue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRue()
	 * @generated
	 * @ordered
	 */
	protected static final String RUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRue() <em>Rue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRue()
	 * @generated
	 * @ordered
	 */
	protected String rue = RUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVille() <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVille()
	 * @generated
	 * @ordered
	 */
	protected static final String VILLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVille() <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVille()
	 * @generated
	 * @ordered
	 */
	protected String ville = VILLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdresseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArbregenPackage.Literals.ADRESSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(int newNumero) {
		int oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArbregenPackage.ADRESSE__NUMERO, oldNumero, numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRue(String newRue) {
		String oldRue = rue;
		rue = newRue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArbregenPackage.ADRESSE__RUE, oldRue, rue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVille(String newVille) {
		String oldVille = ville;
		ville = newVille;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArbregenPackage.ADRESSE__VILLE, oldVille, ville));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArbregenPackage.ADRESSE__NUMERO:
				return getNumero();
			case ArbregenPackage.ADRESSE__RUE:
				return getRue();
			case ArbregenPackage.ADRESSE__VILLE:
				return getVille();
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
			case ArbregenPackage.ADRESSE__NUMERO:
				setNumero((Integer)newValue);
				return;
			case ArbregenPackage.ADRESSE__RUE:
				setRue((String)newValue);
				return;
			case ArbregenPackage.ADRESSE__VILLE:
				setVille((String)newValue);
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
			case ArbregenPackage.ADRESSE__NUMERO:
				setNumero(NUMERO_EDEFAULT);
				return;
			case ArbregenPackage.ADRESSE__RUE:
				setRue(RUE_EDEFAULT);
				return;
			case ArbregenPackage.ADRESSE__VILLE:
				setVille(VILLE_EDEFAULT);
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
			case ArbregenPackage.ADRESSE__NUMERO:
				return numero != NUMERO_EDEFAULT;
			case ArbregenPackage.ADRESSE__RUE:
				return RUE_EDEFAULT == null ? rue != null : !RUE_EDEFAULT.equals(rue);
			case ArbregenPackage.ADRESSE__VILLE:
				return VILLE_EDEFAULT == null ? ville != null : !VILLE_EDEFAULT.equals(ville);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (numero: ");
		result.append(numero);
		result.append(", rue: ");
		result.append(rue);
		result.append(", ville: ");
		result.append(ville);
		result.append(')');
		return result.toString();
	}

} //AdresseImpl
