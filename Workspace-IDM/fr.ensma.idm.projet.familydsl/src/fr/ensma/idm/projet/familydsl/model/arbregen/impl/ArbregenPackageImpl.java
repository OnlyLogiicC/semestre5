/**
 */
package fr.ensma.idm.projet.familydsl.model.arbregen.impl;

import fr.ensma.idm.projet.familydsl.model.arbregen.Adresse;
import fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenFactory;
import fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage;
import fr.ensma.idm.projet.familydsl.model.arbregen.Famille;
import fr.ensma.idm.projet.familydsl.model.arbregen.Femme;
import fr.ensma.idm.projet.familydsl.model.arbregen.Homme;
import fr.ensma.idm.projet.familydsl.model.arbregen.Personne;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArbregenPackageImpl extends EPackageImpl implements ArbregenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass femmeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hommeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adresseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArbregenPackageImpl() {
		super(eNS_URI, ArbregenFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ArbregenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArbregenPackage init() {
		if (isInited) return (ArbregenPackage)EPackage.Registry.INSTANCE.getEPackage(ArbregenPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArbregenPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArbregenPackageImpl theArbregenPackage = registeredArbregenPackage instanceof ArbregenPackageImpl ? (ArbregenPackageImpl)registeredArbregenPackage : new ArbregenPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theArbregenPackage.createPackageContents();

		// Initialize created meta-data
		theArbregenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArbregenPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArbregenPackage.eNS_URI, theArbregenPackage);
		return theArbregenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonne() {
		return personneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Nom() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Age() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_SesParents() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonne_Habitation() {
		return (EReference)personneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonne_Mere() {
		return (EReference)personneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonne_Pere() {
		return (EReference)personneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPersonne__Afficher() {
		return personneEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFemme() {
		return femmeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFemme_Enfants() {
		return (EReference)femmeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHomme() {
		return hommeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHomme_Enfants() {
		return (EReference)hommeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamille() {
		return familleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamille_Membres() {
		return (EReference)familleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFamille_Id() {
		return (EAttribute)familleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdresse() {
		return adresseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdresse_Numero() {
		return (EAttribute)adresseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdresse_Rue() {
		return (EAttribute)adresseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdresse_Ville() {
		return (EAttribute)adresseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbregenFactory getArbregenFactory() {
		return (ArbregenFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		personneEClass = createEClass(PERSONNE);
		createEAttribute(personneEClass, PERSONNE__NOM);
		createEAttribute(personneEClass, PERSONNE__AGE);
		createEAttribute(personneEClass, PERSONNE__SES_PARENTS);
		createEReference(personneEClass, PERSONNE__HABITATION);
		createEReference(personneEClass, PERSONNE__MERE);
		createEReference(personneEClass, PERSONNE__PERE);
		createEOperation(personneEClass, PERSONNE___AFFICHER);

		femmeEClass = createEClass(FEMME);
		createEReference(femmeEClass, FEMME__ENFANTS);

		hommeEClass = createEClass(HOMME);
		createEReference(hommeEClass, HOMME__ENFANTS);

		familleEClass = createEClass(FAMILLE);
		createEReference(familleEClass, FAMILLE__MEMBRES);
		createEAttribute(familleEClass, FAMILLE__ID);

		adresseEClass = createEClass(ADRESSE);
		createEAttribute(adresseEClass, ADRESSE__NUMERO);
		createEAttribute(adresseEClass, ADRESSE__RUE);
		createEAttribute(adresseEClass, ADRESSE__VILLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		femmeEClass.getESuperTypes().add(this.getPersonne());
		hommeEClass.getESuperTypes().add(this.getPersonne());

		// Initialize classes, features, and operations; add parameters
		initEClass(personneEClass, Personne.class, "Personne", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonne_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonne_Age(), ecorePackage.getEInt(), "age", null, 1, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonne_SesParents(), ecorePackage.getEString(), "sesParents", null, 1, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPersonne_Habitation(), this.getAdresse(), null, "habitation", null, 1, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonne_Mere(), this.getFemme(), this.getFemme_Enfants(), "mere", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonne_Pere(), this.getHomme(), this.getHomme_Enfants(), "pere", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPersonne__Afficher(), ecorePackage.getEString(), "afficher", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(femmeEClass, Femme.class, "Femme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFemme_Enfants(), this.getPersonne(), this.getPersonne_Mere(), "enfants", null, 0, -1, Femme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hommeEClass, Homme.class, "Homme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHomme_Enfants(), this.getPersonne(), this.getPersonne_Pere(), "enfants", null, 0, -1, Homme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(familleEClass, Famille.class, "Famille", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFamille_Membres(), this.getPersonne(), null, "membres", null, 0, -1, Famille.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFamille_Id(), ecorePackage.getEString(), "id", null, 0, 1, Famille.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adresseEClass, Adresse.class, "Adresse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdresse_Numero(), ecorePackage.getEInt(), "numero", null, 0, 1, Adresse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdresse_Rue(), ecorePackage.getEString(), "rue", null, 0, 1, Adresse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdresse_Ville(), ecorePackage.getEString(), "ville", null, 0, 1, Adresse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ArbregenPackageImpl
