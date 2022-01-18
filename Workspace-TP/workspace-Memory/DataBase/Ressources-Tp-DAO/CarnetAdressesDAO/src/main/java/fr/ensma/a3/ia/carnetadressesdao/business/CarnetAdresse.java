package fr.ensma.a3.ia.carnetadressesdao.business;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import fr.ensma.a3.ia.carnetadressesdao.dao.AdressePoiDAO;
import fr.ensma.a3.ia.carnetadressesdao.dao.PersonnePoiDAO;
import fr.ensma.a3.ia.carnetadressesdao.dao.entity.PersonneEntity;
import fr.ensma.a3.ia.carnetadressesdao.business.Traduction;

public class CarnetAdresse {
	
	private List<Personne> ListPersonnes ;
	private Traduction trad = new Traduction();
	
	
	public CarnetAdresse() {
		
		ListPersonnes = new ArrayList<Personne>() ;
		List<PersonneEntity> liste_personne_entity = trad.getPersonnedao().getAll();
		for (PersonneEntity personneEntity : liste_personne_entity) {
			ListPersonnes.add(trad.PersonneEntitytoPersonne(personneEntity));
		}
				
	}

	public List<Personne> getListPersonnes() {
		return ListPersonnes;
	}
	
	public void ajouterPers(Personne pers) {
		ListPersonnes.add(pers) ;
		trad.getAdressedao().create(trad.AdressetoAdresseEntity(pers.getAdr()));
		trad.getPersonnedao().create(trad.PersonnetoPersonneEntity(pers));
		
	}
	
	public void modifierPers(Personne pers1, Personne pers2) {
		if (ListPersonnes.indexOf(pers1) != -1) {
			Personne pers = ListPersonnes.get(ListPersonnes.indexOf(pers1)) ;
			pers.setAdr(pers2.getAdr());
			pers.setNomPers(pers2.getNomPers());
			pers.setPrenomPers(pers2.getPrenomPers());
			trad.getAdressedao().update(trad.AdressetoAdresseEntity(pers.getAdr()));
			trad.getPersonnedao().update(trad.PersonnetoPersonneEntity(pers));
			System.out.println("personne modifiée") ;
			}
		else {
		System.out.println("cette personne n'est pas dans le carnet d'adresse") ;
			}
	}
	
	public void supprimerPers(Personne pers) {
		if (ListPersonnes.indexOf(pers) != -1) {
			ListPersonnes.remove(pers) ;
			trad.getPersonnedao().delete(trad.PersonnetoPersonneEntity(pers));
			trad.getAdressedao().delete(trad.AdressetoAdresseEntity(pers.getAdr()));
		} else {
			System.out.println("cette personne n'est pas dans le carnet d'adresse") ;
		}
	}
		
	
	public void lister() {
		for (Personne pers : ListPersonnes) {
			System.out.println(pers.toString() + "\n") ;
		}
	}

}
