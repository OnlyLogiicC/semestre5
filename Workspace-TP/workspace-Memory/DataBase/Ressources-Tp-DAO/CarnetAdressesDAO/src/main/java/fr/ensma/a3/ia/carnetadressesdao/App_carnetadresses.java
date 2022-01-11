package fr.ensma.a3.ia.carnetadressesdao;

import fr.ensma.a3.ia.carnetadressesdao.business.Adresse;
import fr.ensma.a3.ia.carnetadressesdao.business.CarnetAdresse;
import fr.ensma.a3.ia.carnetadressesdao.business.Personne;
import fr.ensma.a3.ia.carnetadressesdao.dao.AdressePoiDAO;
import fr.ensma.a3.ia.carnetadressesdao.dao.IDao;
import fr.ensma.a3.ia.carnetadressesdao.dao.PersonnePoiDAO;
import fr.ensma.a3.ia.carnetadressesdao.dao.entity.AdresseEntity;
import fr.ensma.a3.ia.carnetadressesdao.dao.entity.PersonneEntity;

import java.util.List;

public class App_carnetadresses {

	public static void main(String[] args) {
		
		CarnetAdresse carnet = new CarnetAdresse() ;
		IDao<PersonneEntity> persdao = new PersonnePoiDAO() ;
		List<PersonneEntity> allpers = persdao.getAll() ;
		
		Adresse adr = new Adresse(0, null, null, 0) ;
		Personne personne = new Personne(null, null, adr) ;
		for (PersonneEntity pers : allpers) {
			carnet.ajouterPers(personne.PersonneEntitytoPersonne(pers));
		}
		carnet.lister();
		
		adr.setCodePostal(31850) ;
		adr.setNomRue("Rue Lafayette") ;
		adr.setNomVille("Beaupuy") ;
		adr.setNumRue(12);
		personne.setAdr(adr);
		personne.setNomPers("PEREZ");
		personne.setPrenomPers("Martin");
		carnet.ajouterPers(personne);
		carnet.lister();
	}

}
