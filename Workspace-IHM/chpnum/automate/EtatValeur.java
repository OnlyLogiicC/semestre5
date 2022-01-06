package fr.ensma.a3.ia.convertisseur.mvc.chpnum.automate;

import fr.ensma.a3.ia.convertisseur.mvc.chpnum.ChpNumCtrl;

public class EtatValeur extends AbstractEtat{

	public EtatValeur(ChpNumCtrl aut) {
		super(aut);
	}
	
	@Override
	public void suppr() throws TransitionChpNumException { 
		autom.newValeurFired();
	}
	
	@Override
	public void chiffre() throws TransitionChpNumException { 
		autom.newValeurFired();
	}

	@Override
	public void supprEtVide() throws TransitionChpNumException {
		autom.setEtatCourant(autom.getChpVide());
		autom.champVideFired();
	}
}
