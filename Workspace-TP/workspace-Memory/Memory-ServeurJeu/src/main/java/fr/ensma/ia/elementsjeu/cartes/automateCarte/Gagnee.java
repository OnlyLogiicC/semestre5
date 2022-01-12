package fr.ensma.ia.elementsjeu.cartes.automateCarte;

import fr.ensma.ia.elementsjeu.cartes.AbstractCarte;

public class Gagnee extends AbstractEtatCarte {
	
	private AbstractCarte carte ;
	
	public Gagnee(AbstractCarte carte) {
		
		this.setCarte(carte) ;
	}
	
	public void Retourner() {
		//TODO : transition impossible
	}
	
	public void Retirer() {
		//TODO : transition impossible
	}
	
	public void Replacer() {
		//TODO : transition vers cachee
	}

	public AbstractCarte getCarte() {
		return carte;
	}

	public void setCarte(AbstractCarte carte) {
		this.carte = carte;
	}

}
