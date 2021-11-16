package fr.ensma.a3.ia.jeupersonnages.comportement;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.ElementJeuVivant;

public class EtatEnDeplacement extends AbstractEtats {
	
	public EtatEnDeplacement (ElementJeuVivant p) {
		super(p);
	}

	@Override
	public void arret() {
		perso.setEtatCourant(perso.getAuRepos());
	}
}
