package fr.ensma.a3.ia.mvc.action.automate;

import fr.ensma.a3.ia.mvc.action.ActionCtrl;

public class EtatButtonDisable extends AbstractEtat {

private ActionCtrl autom;
	
	public EtatButtonDisable(ActionCtrl ctrl) {
		autom = ctrl;
	}
	
	@Override
	public void enableButton() throws TransitionActionException {
		autom.setEtatCourant(autom.getAllEnable());
	}
	
	@Override
	public void disableCombo() throws TransitionActionException {
		autom.setEtatCourant(autom.getAllDisable());
	}
	
	@Override
	public void choixSens() throws TransitionActionException {
	}
	
}
