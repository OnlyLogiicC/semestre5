package fr.ensma.ia.game.deck;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import fr.ensma.ia.game.carte.Carte;
import fr.ensma.ia.game.carte.Couleur;
import fr.ensma.ia.game.carte.Hauteur;

public class Deck {
	
	private List<Carte> cartes ;
	
	public Deck() {
		this.cartes = new ArrayList<Carte>() ;
	}
	

	public List<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(List<Carte> cartes) {
		this.cartes = cartes;
	}
	
	public void addcarte(Carte c) {
		this.cartes.add(c) ;
	}
	
	public void removecarte(Carte c) {
		this.cartes.remove(c) ;
	}
	
	public void clearDeck() {
		this.cartes = new ArrayList<Carte>() ;
	}
	
	public void triCouleur() {
		List<Carte> cartestriees1 = new ArrayList<Carte>() ;
		Integer nbrouges = 0 ;
		for (Carte c : cartes) {
			if (c.getCouleur() == Couleur.Carreau || c.getCouleur() == Couleur.Coeur) {
				cartestriees1.add(0, c) ;
				nbrouges++ ;
			} else {
			cartestriees1.add(c) ; }
		}
		//System.out.println(cartestriees1.toString()) ;
		List<Carte> cartestriees2 = new ArrayList<Carte>() ;
		for (Carte c : cartestriees1.subList(0, nbrouges)) {
			if (c.getCouleur() == Couleur.Coeur) {
				cartestriees2.add(0,c) ;
			} else {
			cartestriees2.add(c) ;	}
		}
		for (Carte c : cartestriees1.subList(nbrouges, cartestriees1.size())) {
			if (c.getCouleur() == Couleur.Pique) {
				cartestriees2.add(nbrouges, c) ;
			} else {
			cartestriees2.add(c) ; }
		}
		this.cartes = cartestriees2 ;
		
	}
	
	public void triHauteur() {
		List<Carte> carteout = new ArrayList<Carte>() ;
		carteout.add(cartes.get(0)) ;
		for (Carte c : cartes.subList(1, cartes.size())) {
			int i = 0 ;
			while (i < carteout.size() && c.getInt_hauteur() > carteout.get(i).getInt_hauteur()) {
				i++ ;
			}
			carteout.add(i,c) ;
		}
		this.cartes = carteout ;
	}
	
	public void melanger() {
		Collections.shuffle(this.cartes) ;
	}
	
	public void pioche(Deck main) {
		main.addcarte(this.cartes.remove(cartes.size() - 1));
	}
	
	public void initDeck() {
		this.clearDeck(); ;
		for (Couleur color : Couleur.values()) {
			for (Hauteur h : Hauteur.values()) {
				this.addcarte(new Carte(color, h));
			}
		}
		this.melanger();
	}
	
	
	
	@Override
	public String toString() {
		String s = new String("") ;
		for (Carte c : cartes) {
			s += "-->  " + c.toString() + "\n" ;
		}
		return s ;
	}

}
