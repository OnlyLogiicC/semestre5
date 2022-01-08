package fr.ensma.ia.elementsjeu.cartes.automateCarte;

import fr.ensma.ia.elementsjeu.cartes.AbstractCarte;

public class Cachee extends AbstractEtatCarte {
	
	private AbstractCarte carte ;
	
	public Cachee(AbstractCarte carte) {
		
		this.setCarte(carte) ;
	}
	
	public void Retourner() {
		
	}
	
	public void Retirer() {
		
	}
	
	public void Replacer() {
		
	}

	public AbstractCarte getCarte() {
		return carte;
	}

	public void setCarte(AbstractCarte carte) {
		this.carte = carte;
	}

}
