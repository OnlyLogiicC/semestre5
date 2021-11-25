package fr.ensma.a3.ia.jeupersonnages.comportement;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.ElementJeuVivant;

public class EtatAuRepos extends AbstractEtats{
	
	public EtatAuRepos(ElementJeuVivant p) {
		super(p);
	}
	
	@Override
	public void deplacer(){
		perso.setEtatCourant(perso.getEnDeplacement());
	}
	
	@Override 
	public void SubirAttaque() {}
	
}
