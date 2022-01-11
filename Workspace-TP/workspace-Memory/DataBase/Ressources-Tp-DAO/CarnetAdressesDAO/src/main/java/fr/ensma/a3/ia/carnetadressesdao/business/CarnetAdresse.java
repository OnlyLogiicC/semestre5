package fr.ensma.a3.ia.carnetadressesdao.business;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CarnetAdresse {
	
	private List<Personne> ListPersonnes ;
	
	public CarnetAdresse() {
		setListPersonnes(new ArrayList<Personne>()) ;
	}

	public List<Personne> getListPersonnes() {
		return ListPersonnes;
	}

	public void setListPersonnes(List<Personne> listPersonnes) {
		ListPersonnes = listPersonnes;
	}
	
	public void ajouterPers(Personne pers) {
		ListPersonnes.add(pers) ;
		
	}
	
	public void modifierPers(Personne pers1, Personne pers2) {
		if (ListPersonnes.indexOf(pers1) != -1) {
			Personne pers = ListPersonnes.get(ListPersonnes.indexOf(pers1)) ;
			pers.setAdr(pers2.getAdr());
			pers.setNomPers(pers2.getNomPers());
			pers.setPrenomPers(pers2.getPrenomPers());
			System.out.println("personne modifiée") ;
			}
		else {
		System.out.println("cette personne n'est pas dans le carnet d'adresse") ;
			}
	}
	
	public void supprimerPers(Personne pers) {
		if (ListPersonnes.indexOf(pers) != -1) {
			ListPersonnes.remove(pers) ;
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
