package fr.ensma.a3.ia.carnetadressesdao.business;

import java.util.List;

import fr.ensma.a3.ia.carnetadressesdao.dao.AdressePoiDAO;
import fr.ensma.a3.ia.carnetadressesdao.dao.PersonnePoiDAO;
import fr.ensma.a3.ia.carnetadressesdao.dao.entity.AdresseEntity;
import fr.ensma.a3.ia.carnetadressesdao.dao.entity.PersonneEntity;

public class Traduction {
	private AdressePoiDAO adressedao = new AdressePoiDAO() ;

	private PersonnePoiDAO personnedao = new PersonnePoiDAO() ; 
	

	public Adresse AdresseEntitytoAdresse(AdresseEntity adr) {
		return new Adresse(adr.getNumRue(), adr.getNomRue(), adr.getNomVille(), adr.getCodePostal()) ;
	}
	
	public Personne PersonneEntitytoPersonne(PersonneEntity pers) {
		AdressePoiDAO adressedao = new AdressePoiDAO() ;
		if (adressedao.getById(pers.getAdressePers_FK()).isPresent()) {
		Adresse address = AdresseEntitytoAdresse(adressedao.getById(pers.getAdressePers_FK()).get()) ;
		return new Personne(pers.getNom(), pers.getPrenom(), address) ;
		}
		return null ;
	}
	
	public AdresseEntity AdressetoAdresseEntity(Adresse adr) {
		AdressePoiDAO adressedao = new AdressePoiDAO() ;
		boolean present = false;
		int indice = 0;
		List<AdresseEntity> liste_adresse = adressedao.getAll();
		while ((!present) &&(indice<liste_adresse.size())) {
			if (adr.equals(AdresseEntitytoAdresse(liste_adresse.get(indice)))) {
				present = true;
				
			}else {
				indice++;				
			}
		}
		if (present) {
			return liste_adresse.get(indice);
		}
		AdresseEntity adresse_entity = new AdresseEntity();
		adresse_entity.setCodePostal(adr.getCodePostal());
		adresse_entity.setNomRue(adr.getNomRue());
		adresse_entity.setNumRue(adr.getNumRue());
		adresse_entity.setNomVille(adr.getNomVille());
		return adresse_entity ;
		
	}
	
	public PersonneEntity PersonnetoPersonneEntity(Personne pers) {
		PersonnePoiDAO personnedao = new PersonnePoiDAO() ; 
		boolean present = false;
		int indice = 0;
		List<PersonneEntity> liste_personne = personnedao.getAll();
		while ((!present) &&(indice<liste_personne.size())) {
			if (pers.equals(PersonneEntitytoPersonne(liste_personne.get(indice)))) {
				present = true;
				
			}else {
				indice++;				
			}
		}
		if (present) {
			return liste_personne.get(indice);
		}
		PersonneEntity personne_entity = new PersonneEntity();
		personne_entity.setNom(pers.getNomPers());
		personne_entity.setPrenom(pers.getPrenomPers());
		personne_entity.setAdressePers_FK(AdressetoAdresseEntity(pers.getAdr()).getIdAdr());
		return personne_entity ;
	}

	public AdressePoiDAO getAdressedao() {
		return adressedao;
	}
	public PersonnePoiDAO getPersonnedao() {
		return personnedao;
	}
}
