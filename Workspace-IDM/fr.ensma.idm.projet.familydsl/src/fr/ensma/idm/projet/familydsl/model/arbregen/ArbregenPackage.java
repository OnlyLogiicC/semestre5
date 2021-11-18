/**
 */
package fr.ensma.idm.projet.familydsl.model.arbregen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenFactory
 * @model kind="package"
 * @generated
 */
public interface ArbregenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arbregen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/arbregen";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arbregen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArbregenPackage eINSTANCE = fr.ensma.idm.projet.familydsl.model.arbregen.impl.ArbregenPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.PersonneImpl <em>Personne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.PersonneImpl
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.ArbregenPackageImpl#getPersonne()
	 * @generated
	 */
	int PERSONNE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__AGE = 1;

	/**
	 * The feature id for the '<em><b>Ses Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__SES_PARENTS = 2;

	/**
	 * The feature id for the '<em><b>Habitation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__HABITATION = 3;

	/**
	 * The feature id for the '<em><b>Mere</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__MERE = 4;

	/**
	 * The feature id for the '<em><b>Pere</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__PERE = 5;

	/**
	 * The number of structural features of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Afficher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE___AFFICHER = 0;

	/**
	 * The number of operations of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.FemmeImpl <em>Femme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.FemmeImpl
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.ArbregenPackageImpl#getFemme()
	 * @generated
	 */
	int FEMME = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMME__NOM = PERSONNE__NOM;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMME__AGE = PERSONNE__AGE;

	/**
	 * The feature id for the '<em><b>Ses Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMME__SES_PARENTS = PERSONNE__SES_PARENTS;

	/**
	 * The feature id for the '<em><b>Habitation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMME__HABITATION = PERSONNE__HABITATION;

	/**
	 * The feature id for the '<em><b>Mere</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMME__MERE = PERSONNE__MERE;

	/**
	 * The feature id for the '<em><b>Pere</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMME__PERE = PERSONNE__PERE;

	/**
	 * The feature id for the '<em><b>Enfants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMME__ENFANTS = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Femme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMME_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Afficher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMME___AFFICHER = PERSONNE___AFFICHER;

	/**
	 * The number of operations of the '<em>Femme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEMME_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.HommeImpl <em>Homme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.HommeImpl
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.ArbregenPackageImpl#getHomme()
	 * @generated
	 */
	int HOMME = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOMME__NOM = PERSONNE__NOM;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOMME__AGE = PERSONNE__AGE;

	/**
	 * The feature id for the '<em><b>Ses Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOMME__SES_PARENTS = PERSONNE__SES_PARENTS;

	/**
	 * The feature id for the '<em><b>Habitation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOMME__HABITATION = PERSONNE__HABITATION;

	/**
	 * The feature id for the '<em><b>Mere</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOMME__MERE = PERSONNE__MERE;

	/**
	 * The feature id for the '<em><b>Pere</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOMME__PERE = PERSONNE__PERE;

	/**
	 * The feature id for the '<em><b>Enfants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOMME__ENFANTS = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Homme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOMME_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Afficher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOMME___AFFICHER = PERSONNE___AFFICHER;

	/**
	 * The number of operations of the '<em>Homme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOMME_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.FamilleImpl <em>Famille</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.FamilleImpl
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.ArbregenPackageImpl#getFamille()
	 * @generated
	 */
	int FAMILLE = 3;

	/**
	 * The feature id for the '<em><b>Membres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILLE__MEMBRES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILLE__ID = 1;

	/**
	 * The number of structural features of the '<em>Famille</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Famille</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.AdresseImpl <em>Adresse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.AdresseImpl
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.ArbregenPackageImpl#getAdresse()
	 * @generated
	 */
	int ADRESSE = 4;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSE__NUMERO = 0;

	/**
	 * The feature id for the '<em><b>Rue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSE__RUE = 1;

	/**
	 * The feature id for the '<em><b>Ville</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSE__VILLE = 2;

	/**
	 * The number of structural features of the '<em>Adresse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Adresse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESSE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personne</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Personne
	 * @generated
	 */
	EClass getPersonne();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getNom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Nom();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getAge()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Age();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getSesParents <em>Ses Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ses Parents</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getSesParents()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_SesParents();

	/**
	 * Returns the meta object for the containment reference '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getHabitation <em>Habitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Habitation</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getHabitation()
	 * @see #getPersonne()
	 * @generated
	 */
	EReference getPersonne_Habitation();

	/**
	 * Returns the meta object for the reference '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getMere <em>Mere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mere</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getMere()
	 * @see #getPersonne()
	 * @generated
	 */
	EReference getPersonne_Mere();

	/**
	 * Returns the meta object for the reference '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getPere <em>Pere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pere</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Personne#getPere()
	 * @see #getPersonne()
	 * @generated
	 */
	EReference getPersonne_Pere();

	/**
	 * Returns the meta object for the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Personne#afficher() <em>Afficher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Afficher</em>' operation.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Personne#afficher()
	 * @generated
	 */
	EOperation getPersonne__Afficher();

	/**
	 * Returns the meta object for class '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Femme <em>Femme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Femme</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Femme
	 * @generated
	 */
	EClass getFemme();

	/**
	 * Returns the meta object for the reference list '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Femme#getEnfants <em>Enfants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enfants</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Femme#getEnfants()
	 * @see #getFemme()
	 * @generated
	 */
	EReference getFemme_Enfants();

	/**
	 * Returns the meta object for class '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Homme <em>Homme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Homme</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Homme
	 * @generated
	 */
	EClass getHomme();

	/**
	 * Returns the meta object for the reference list '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Homme#getEnfants <em>Enfants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enfants</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Homme#getEnfants()
	 * @see #getHomme()
	 * @generated
	 */
	EReference getHomme_Enfants();

	/**
	 * Returns the meta object for class '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Famille <em>Famille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Famille</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Famille
	 * @generated
	 */
	EClass getFamille();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Famille#getMembres <em>Membres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Membres</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Famille#getMembres()
	 * @see #getFamille()
	 * @generated
	 */
	EReference getFamille_Membres();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Famille#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Famille#getId()
	 * @see #getFamille()
	 * @generated
	 */
	EAttribute getFamille_Id();

	/**
	 * Returns the meta object for class '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Adresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adresse</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Adresse
	 * @generated
	 */
	EClass getAdresse();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Adresse#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Adresse#getNumero()
	 * @see #getAdresse()
	 * @generated
	 */
	EAttribute getAdresse_Numero();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Adresse#getRue <em>Rue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rue</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Adresse#getRue()
	 * @see #getAdresse()
	 * @generated
	 */
	EAttribute getAdresse_Rue();

	/**
	 * Returns the meta object for the attribute '{@link fr.ensma.idm.projet.familydsl.model.arbregen.Adresse#getVille <em>Ville</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ville</em>'.
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.Adresse#getVille()
	 * @see #getAdresse()
	 * @generated
	 */
	EAttribute getAdresse_Ville();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArbregenFactory getArbregenFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.PersonneImpl <em>Personne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.PersonneImpl
		 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.ArbregenPackageImpl#getPersonne()
		 * @generated
		 */
		EClass PERSONNE = eINSTANCE.getPersonne();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NOM = eINSTANCE.getPersonne_Nom();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__AGE = eINSTANCE.getPersonne_Age();

		/**
		 * The meta object literal for the '<em><b>Ses Parents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__SES_PARENTS = eINSTANCE.getPersonne_SesParents();

		/**
		 * The meta object literal for the '<em><b>Habitation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNE__HABITATION = eINSTANCE.getPersonne_Habitation();

		/**
		 * The meta object literal for the '<em><b>Mere</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNE__MERE = eINSTANCE.getPersonne_Mere();

		/**
		 * The meta object literal for the '<em><b>Pere</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNE__PERE = eINSTANCE.getPersonne_Pere();

		/**
		 * The meta object literal for the '<em><b>Afficher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSONNE___AFFICHER = eINSTANCE.getPersonne__Afficher();

		/**
		 * The meta object literal for the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.FemmeImpl <em>Femme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.FemmeImpl
		 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.ArbregenPackageImpl#getFemme()
		 * @generated
		 */
		EClass FEMME = eINSTANCE.getFemme();

		/**
		 * The meta object literal for the '<em><b>Enfants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEMME__ENFANTS = eINSTANCE.getFemme_Enfants();

		/**
		 * The meta object literal for the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.HommeImpl <em>Homme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.HommeImpl
		 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.ArbregenPackageImpl#getHomme()
		 * @generated
		 */
		EClass HOMME = eINSTANCE.getHomme();

		/**
		 * The meta object literal for the '<em><b>Enfants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOMME__ENFANTS = eINSTANCE.getHomme_Enfants();

		/**
		 * The meta object literal for the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.FamilleImpl <em>Famille</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.FamilleImpl
		 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.ArbregenPackageImpl#getFamille()
		 * @generated
		 */
		EClass FAMILLE = eINSTANCE.getFamille();

		/**
		 * The meta object literal for the '<em><b>Membres</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILLE__MEMBRES = eINSTANCE.getFamille_Membres();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAMILLE__ID = eINSTANCE.getFamille_Id();

		/**
		 * The meta object literal for the '{@link fr.ensma.idm.projet.familydsl.model.arbregen.impl.AdresseImpl <em>Adresse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.AdresseImpl
		 * @see fr.ensma.idm.projet.familydsl.model.arbregen.impl.ArbregenPackageImpl#getAdresse()
		 * @generated
		 */
		EClass ADRESSE = eINSTANCE.getAdresse();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESSE__NUMERO = eINSTANCE.getAdresse_Numero();

		/**
		 * The meta object literal for the '<em><b>Rue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESSE__RUE = eINSTANCE.getAdresse_Rue();

		/**
		 * The meta object literal for the '<em><b>Ville</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESSE__VILLE = eINSTANCE.getAdresse_Ville();

	}

} //ArbregenPackage
