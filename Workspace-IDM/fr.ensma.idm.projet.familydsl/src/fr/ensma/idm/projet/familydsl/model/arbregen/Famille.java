/**
 */
package fr.ensma.idm.projet.familydsl.model.arbregen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Famille</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.Famille#getMembres <em>Membres</em>}</li>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.Famille#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#getFamille()
 * @model
 * @generated
 */
public interface Famille extends EObject {
	/**
	 * Returns the value of the '<em><b>Membres</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Membres</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Membres</em>' containment reference list.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#getFamille_Membres()
	 * @model containment="true"
	 * @generated
	 */
	EList<Personne> getMembres();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#getFamille_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Famille#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Famille
