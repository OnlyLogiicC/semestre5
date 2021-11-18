/**
 */
package fr.ensma.idm.projet.familydsl.model.arbregen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adresse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.Adresse#getNumero <em>Numero</em>}</li>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.Adresse#getRue <em>Rue</em>}</li>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.Adresse#getVille <em>Ville</em>}</li>
 * </ul>
 *
 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#getAdresse()
 * @model
 * @generated
 */
public interface Adresse extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(int)
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#getAdresse_Numero()
	 * @model
	 * @generated
	 */
	int getNumero();

	/**
	 * Sets the value of the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Adresse#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(int value);

	/**
	 * Returns the value of the '<em><b>Rue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rue</em>' attribute.
	 * @see #setRue(String)
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#getAdresse_Rue()
	 * @model
	 * @generated
	 */
	String getRue();

	/**
	 * Sets the value of the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Adresse#getRue <em>Rue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rue</em>' attribute.
	 * @see #getRue()
	 * @generated
	 */
	void setRue(String value);

	/**
	 * Returns the value of the '<em><b>Ville</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ville</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ville</em>' attribute.
	 * @see #setVille(String)
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#getAdresse_Ville()
	 * @model
	 * @generated
	 */
	String getVille();

	/**
	 * Sets the value of the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Adresse#getVille <em>Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ville</em>' attribute.
	 * @see #getVille()
	 * @generated
	 */
	void setVille(String value);

} // Adresse
