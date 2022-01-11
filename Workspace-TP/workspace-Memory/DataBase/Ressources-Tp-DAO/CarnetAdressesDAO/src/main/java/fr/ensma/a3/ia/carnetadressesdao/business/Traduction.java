package fr.ensma.a3.ia.carnetadressesdao.business;

import fr.ensma.a3.ia.carnetadressesdao.dao.AdressePoiDAO;
import fr.ensma.a3.ia.carnetadressesdao.dao.PersonnePoiDAO;
import fr.ensma.a3.ia.carnetadressesdao.dao.entity.AdresseEntity;
import fr.ensma.a3.ia.carnetadressesdao.dao.entity.PersonneEntity;

public class Traduction {
	
	private static AdressePoiDAO adressedao = new AdressePoiDAO() ;
	private static PersonnePoiDAO personnedao = new PersonnePoiDAO() ;
	
	
	public static Adresse AdresseEntitytoAdresse(AdresseEntity adr) {
		return new Adresse(adr.getNumRue(), adr.getNomRue(), adr.getNomVille(), adr.getCodePostal()) ;
	}
	
	public static Personne PersonneEntitytoPersonne(PersonneEntity pers) {
		if (adressedao.getById(pers.getAdressePers_FK()).isPresent()) {
		Adresse address = AdresseEntitytoAdresse(adressedao.getById(pers.getAdressePers_FK()).get()) ;
		return new Personne(pers.getNomPers(), pers.getPrenomPers(), address) ;
		}
		return null ;
	}
	
	public static AdresseEntity AdressetoAdresseEntity(Adresse adr) {
		return null ;
		
	}
	
	public static PersonneEntity PersonnetoPersonneEntity(Personne pers) {
		return null ;
	}

}
