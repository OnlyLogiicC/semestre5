/**
 */
package fr.ensma.idm.projet.familydsl.model.arbregen.util;

import fr.ensma.idm.projet.familydsl.model.arbregen.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage
 * @generated
 */
public class ArbregenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArbregenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbregenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArbregenPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArbregenSwitch<Adapter> modelSwitch =
		new ArbregenSwitch<Adapter>() {
			@Override
			public Adapter casePersonne(Personne object) {
				return createPersonneAdapter();
			}
			@Override
			public Adapter caseFemme(Femme object) {
				return createFemmeAdapter();
			}
			@Override
			public Adapter caseHomme(Homme object) {
				return createHommeAdapter();
			}
			@Override
			public Adapter caseFamille(Famille object) {
				return createFamilleAdapter();
			}
			@Override
			public Adapter caseAdresse(Adresse object) {
				return createAdresseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Personne
	 * @generated
	 */
	public Adapter createPersonneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Femme <em>Femme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Femme
	 * @generated
	 */
	public Adapter createFemmeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Homme <em>Homme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Homme
	 * @generated
	 */
	public Adapter createHommeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Famille <em>Famille</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Famille
	 * @generated
	 */
	public Adapter createFamilleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Adresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Adresse
	 * @generated
	 */
	public Adapter createAdresseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArbregenAdapterFactory
