package fr.ensma.ia.joueurs;

public abstract class AbstractJoueur {
	
	private String pseudo ;
	private Integer NbPairesGagnees ;
	
	public AbstractJoueur(String pseudo) {
		this.pseudo = pseudo ;
		this.NbPairesGagnees = 0 ;
		
	}
	
	public void Jouer() {
		// TODO : fonction qui gère les actions du joueur pendant son tour
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public Integer getNbPairesGagnees() {
		return NbPairesGagnees;
	}

	public void setNbPairesGagnees(Integer nbPairesGagnees) {
		NbPairesGagnees = nbPairesGagnees;
	}
	

}
