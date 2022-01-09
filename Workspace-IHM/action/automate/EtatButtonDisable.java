package fr.ensma.a3.ia.convertisseur.mvp.action.automate;

import fr.ensma.a3.ia.convertisseur.mvp.action.ActionPresentation;

public class EtatButtonDisable extends AbstractEtat {
	
	public EtatButtonDisable(ActionPresentation pr) {
		super(pr);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enableButton() throws TransitionActionException {
		autom.setEtatCourant(autom.getAllEnable());
	}
	
	@Override
	public void choixSens() throws TransitionActionException {
	}
	
	@Override
	public void disableCombo() throws TransitionActionException {
		autom.setEtatCourant(autom.getAllDisable());
	}

}
