package fr.ensma.a3.ia.jeupersonnages.comportement;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.ElementJeuVivant;

public class EtatEnDefense extends AbstractEtats{
	
	public EtatEnDefense (ElementJeuVivant p) {
		super(p);
	}

	@Override
	public void FinAttaque() {}
}
