package fr.ensma.ia.joueurs;

import java.util.List;

public class BaseJoueurs {
	
	private List<AbstractJoueur> joueurs ;
	
	public BaseJoueurs() {
		
	}
	
	public void ajouterJoueur(JoueurReel j) {
		
	}

	public List<AbstractJoueur> getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(List<AbstractJoueur> joueurs) {
		this.joueurs = joueurs;
	}

}
