package fr.ensma.a3.ia.convertisseur.mvc.action.automate;

import fr.ensma.a3.ia.convertisseur.mvc.action.ActionCtrl;

public class EtatAllDisable extends AbstractEtat{

	private ActionCtrl autom;
	
	public EtatAllDisable(ActionCtrl ctrl) {
		autom = ctrl;
	}
	
	@Override
	public void enableCombo() throws TransitionActionException {
		autom.setEtatCourant(autom.getButtonDisable());
	}
}
