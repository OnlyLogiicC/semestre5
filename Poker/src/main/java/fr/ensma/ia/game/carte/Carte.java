package fr.ensma.ia.game.carte;

public class Carte {
	
	private Couleur couleur ;
	private Hauteur hauteur ;
	private int int_hauteur ;
	
	public Carte(Couleur c, Hauteur h) {
		this.couleur = c ;
		this.hauteur = h ;
		this.int_hauteur = h.ordinal() ;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public Hauteur getHauteur() {
		return hauteur;
	}

	public void setHauteur(Hauteur hauteur) {
		this.hauteur = hauteur;
	}
	
	@Override
	public String toString() {
		return hauteur.toString() + " de " + couleur.toString() ;
	}

	public int getInt_hauteur() {
		return int_hauteur;
	}

	public void setInt_hauteur(int int_hauteur) {
		this.int_hauteur = int_hauteur;
	}

}
