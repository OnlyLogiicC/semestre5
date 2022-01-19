package fr.ensma.ia.game;

import java.util.ArrayList;
import java.util.List;

public class Table {
	
	private String id ;
	private List<Joueur> joueurs ;
	private Integer Pot ;
	
	
	public Table(String s) {
		this.id = s ;
		this.joueurs = new ArrayList<Joueur>() ;
		this.Pot = 0 ;
	}
	
	public void ajouterJoueur(Joueur j) {
		this.joueurs.add(j) ;
		System.out.println("Le Joueur " + j.getId() + " s'assoie à la table") ;
	}
	
	public void supprimerJoueur(Joueur j) {
		boolean b = this.joueurs.remove(j) ;
		if (b) {
			System.out.println("Joueur " + j.getId() + " quitte la table") ;
		} else {
			System.out.println("Echec suppression de Joueur " + j.getId()) ;
		}
	}
	
	public void augmenterPot(Integer i) {
		this.Pot += i ;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Joueur> getJoueurs() {
		return joueurs;
	}
	public void setJoueurs(List<Joueur> joueurs) {
		this.joueurs = joueurs;
	}

	public Integer getPot() {
		return Pot;
	}

	public void setPot(Integer pot) {
		Pot = pot;
	}

}
