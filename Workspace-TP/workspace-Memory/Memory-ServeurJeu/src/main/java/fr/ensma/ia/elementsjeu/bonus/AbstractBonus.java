package fr.ensma.ia.elementsjeu.bonus;

import fr.ensma.ia.elementsjeu.cartes.ICarte;

public abstract class AbstractBonus implements ICarte {
	
	private ICarte carte ;
	
	public AbstractBonus(ICarte carte) {
		this.carte = carte ;
	}

	public ICarte getDecorateur() {
		return carte;
	}

	public void setDecorateur(ICarte decorateur) {
		this.carte = decorateur;
	}

	public void tournerCarte() {
		//action classique
	}

}
