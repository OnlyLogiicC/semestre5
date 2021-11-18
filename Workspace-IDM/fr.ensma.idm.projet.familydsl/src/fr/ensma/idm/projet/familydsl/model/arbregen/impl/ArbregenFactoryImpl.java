/**
 */
package fr.ensma.idm.projet.familydsl.model.arbregen.impl;

import fr.ensma.idm.projet.familydsl.model.arbregen.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArbregenFactoryImpl extends EFactoryImpl implements ArbregenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArbregenFactory init() {
		try {
			ArbregenFactory theArbregenFactory = (ArbregenFactory)EPackage.Registry.INSTANCE.getEFactory(ArbregenPackage.eNS_URI);
			if (theArbregenFactory != null) {
				return theArbregenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArbregenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbregenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArbregenPackage.FEMME: return createFemme();
			case ArbregenPackage.HOMME: return createHomme();
			case ArbregenPackage.FAMILLE: return createFamille();
			case ArbregenPackage.ADRESSE: return createAdresse();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Femme createFemme() {
		FemmeImpl femme = new FemmeImpl();
		return femme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Homme createHomme() {
		HommeImpl homme = new HommeImpl();
		return homme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Famille createFamille() {
		FamilleImpl famille = new FamilleImpl();
		return famille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adresse createAdresse() {
		AdresseImpl adresse = new AdresseImpl();
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbregenPackage getArbregenPackage() {
		return (ArbregenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArbregenPackage getPackage() {
		return ArbregenPackage.eINSTANCE;
	}

} //ArbregenFactoryImpl
