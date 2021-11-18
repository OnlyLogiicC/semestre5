/**
 */
package fr.ensma.idm.projet.familydsl.model.arbregen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Femme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ensma.idm.projet.familydsl.model.arbregen.Femme#getEnfants <em>Enfants</em>}</li>
 * </ul>
 *
 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#getFemme()
 * @model
 * @generated
 */
public interface Femme extends Personne {
	/**
	 * Returns the value of the '<em><b>Enfants</b></em>' reference list.
	 * The list contents are of type {@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne}.
	 * It is bidirectional and its opposite is '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getMere <em>Mere</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enfants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enfants</em>' reference list.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#getFemme_Enfants()
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getMere
	 * @model opposite="mere"
	 * @generated
	 */
	EList<Personne> getEnfants();

} // Femme
