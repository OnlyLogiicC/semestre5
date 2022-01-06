package fr.ensma.a3.ia.convertisseur.mvc.chpnum.automate;

import fr.ensma.a3.ia.convertisseur.mvc.chpnum.ChpNumCtrl;

public class EtatDisable extends AbstractEtat {

	public EtatDisable(ChpNumCtrl aut) {
		super(aut);
	}

	@Override
	public void enableChp() throws TransitionChpNumException {
		autom.setEtatCourant(autom.getChpVide());
	}
	
}
