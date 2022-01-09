package fr.ensma.a3.ia.convertisseur.mvp.action.automate;

import fr.ensma.a3.ia.convertisseur.mvp.action.ActionPresentation;

public class EtatAllEnable extends AbstractEtat {

	
	public EtatAllEnable(final ActionPresentation pr) {
		super(pr);
	}

	@Override
	public void action() throws TransitionActionException {
		autom.setEtatCourant(autom.getAllDisable());
	}
	
	@Override
	public void choixSens() throws TransitionActionException {
	}
	
	@Override
	public void disableButton() throws TransitionActionException {
		autom.setEtatCourant(autom.getButtonDisable());
	}
	
}
