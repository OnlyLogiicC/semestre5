package fr.ensma.a3.ia.convertisseur.mvc.chpnum.automate;

import fr.ensma.a3.ia.convertisseur.mvc.chpnum.ChpNumCtrl;

public class EtatVide extends AbstractEtat{

	public EtatVide(ChpNumCtrl aut) {
		super(aut);
	}

	@Override
	public void chiffre() throws TransitionChpNumException {
		autom.setEtatCourant(autom.getChpVal());
		autom.champValeurFired();
		autom.newValeurFired();
	}
	
}
