package fr.ensma.ia.partie;

import java.util.ArrayList;
import java.util.List;

import fr.ensma.ia.joueurs.AbstractJoueur;
import fr.ensma.ia.plateau.Plateau;

public class Partie {
	
	private String id ;
	private Integer NbJoueursReels ;
	private Plateau plateau ;
	private List<AbstractJoueur> ListJoueurs;
	
	public Partie(String id, Integer nbjoueursreels, Integer NbPaires, Integer taille, Integer nbcartemyst) {
		
		this.id = id ;
		this.NbJoueursReels = nbjoueursreels ;
		this.plateau = new Plateau("plateau " + id, taille, NbPaires, nbcartemyst) ; // il faut (taille - nbcartemyst)/2 >= NbPaires : le plateau doit être plus grand que le nombre de carte mini
		this.ListJoueurs = new ArrayList<AbstractJoueur>() ;

	}
	
	public void start() {
		
	}
	
	public void ajoutJoueur(AbstractJoueur j) {
		
		//mettre à 0 le nombre de paires gagnées du joueur et l'ajouter à la liste de joueurs
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getNbJoueursReels() {
		return NbJoueursReels;
	}

	public void setNbJoueursReels(Integer nbJoueursReels) {
		NbJoueursReels = nbJoueursReels;
	}

	public Plateau getPlateau() {
		return plateau;
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}

	public List<AbstractJoueur> getListJoueurs() {
		return ListJoueurs;
	}

	public void setListJoueurs(List<AbstractJoueur> listJoueurs) {
		ListJoueurs = listJoueurs;
	}
}