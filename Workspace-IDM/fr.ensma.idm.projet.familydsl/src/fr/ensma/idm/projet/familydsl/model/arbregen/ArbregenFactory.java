/**
 */
package fr.ensma.idm.projet.familydsl.model.arbregen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage
 * @generated
 */
public interface ArbregenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArbregenFactory eINSTANCE = fr.ensma.idm.projet.familydsl.model.arbregen.impl.ArbregenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Femme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Femme</em>'.
	 * @generated
	 */
	Femme createFemme();

	/**
	 * Returns a new object of class '<em>Homme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Homme</em>'.
	 * @generated
	 */
	Homme createHomme();

	/**
	 * Returns a new object of class '<em>Famille</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Famille</em>'.
	 * @generated
	 */
	Famille createFamille();

	/**
	 * Returns a new object of class '<em>Adresse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adresse</em>'.
	 * @generated
	 */
	Adresse createAdresse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArbregenPackage getArbregenPackage();

} //ArbregenFactory
