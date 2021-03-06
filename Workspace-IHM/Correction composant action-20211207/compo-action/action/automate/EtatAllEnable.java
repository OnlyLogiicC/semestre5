package fr.ensma.a3.ia.convertisseur.mvc.action.automate;

import fr.ensma.a3.ia.convertisseur.mvc.action.ActionCtrl;

public class EtatAllEnable extends AbstractEtat {

	private ActionCtrl autom;
	
	public EtatAllEnable(ActionCtrl ctrl) {
		autom = ctrl;
	}
	
	@Override
	public void action() throws TransitionActionException {
		autom.setEtatCourant(autom.getAllDisable());
	}
	
	@Override
	public void choixSens() throws TransitionActionException {
	}
	
}
