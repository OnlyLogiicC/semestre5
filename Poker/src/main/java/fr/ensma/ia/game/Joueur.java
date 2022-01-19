package fr.ensma.ia.game;

import fr.ensma.ia.game.deck.Deck;

public class Joueur {
	
	private String id ;
	private Deck main ;
	private Integer solde ;
	
	public Joueur(String s) {
		this.id = s ;
		this.main = new Deck() ;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Deck getMain() {
		return main;
	}
	public void setMain(Deck main) {
		this.main = main;
	}


	public Integer getSolde() {
		return solde;
	}


	public void setSolde(Integer solde) {
		this.solde = solde;
	}
	
	public Integer miser(Integer m) {
		if (m >= solde) {
			Integer output = solde ;
			solde = 0 ;
			System.out.println("Joueur " + id + " fait tapis") ;
			return output ;
		}
		System.out.println("Joueur " + id + " mise " + m.toString() + "") ;
		this.solde -= m ;
		return m ;
	}
	
	@Override
	public String toString() {
		return "Joueur : " + id + "\nSolde = " + solde.toString() + "\n" ;
	}
	

}
