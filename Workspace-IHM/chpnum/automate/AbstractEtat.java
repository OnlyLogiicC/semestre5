package fr.ensma.a3.ia.convertisseur.mvc.chpnum.automate;

import fr.ensma.a3.ia.convertisseur.mvc.chpnum.ChpNumCtrl;

public abstract class AbstractEtat implements IEtatChpNum {

	protected ChpNumCtrl autom;

	public AbstractEtat(final ChpNumCtrl aut) {
		autom = aut;
	}
	
	@Override
	public void enableChp() throws TransitionChpNumException {
		throw new TransitionChpNumException();
	}

	@Override
	public void diableChp() throws TransitionChpNumException {
		throw new TransitionChpNumException();
	}

	@Override
	public void chiffre() throws TransitionChpNumException {
		throw new TransitionChpNumException();
	}
	
	@Override
	public void suppr() throws TransitionChpNumException {
		throw new TransitionChpNumException();
	}
	
	@Override
	public void supprEtVide() throws TransitionChpNumException {
		throw new TransitionChpNumException();
	}

}
