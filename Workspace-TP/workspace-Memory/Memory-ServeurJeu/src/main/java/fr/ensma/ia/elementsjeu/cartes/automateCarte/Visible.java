package fr.ensma.ia.elementsjeu.cartes.automateCarte;

import fr.ensma.ia.elementsjeu.cartes.AbstractCarte;

public class Visible extends AbstractEtatCarte {
	
	private AbstractCarte carte ;
	
	public Visible(AbstractCarte carte) {
		
		this.setCarte(carte) ;
	}
	
	public void Retourner() {
		//TODO : transition vers Cachee
	}
	
	public void Retirer() {
		//TODO : transition vers Gagnee
	}
	
	public void Replacer() {
		//TODO : transition impossible
	}

	public AbstractCarte getCarte() {
		return carte;
	}

	public void setCarte(AbstractCarte carte) {
		this.carte = carte;
	}

}
