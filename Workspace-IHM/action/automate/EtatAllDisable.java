package fr.ensma.a3.ia.convertisseur.mvp.action.automate;

import fr.ensma.a3.ia.convertisseur.mvp.action.ActionPresentation;

public class EtatAllDisable extends AbstractEtat{

	public EtatAllDisable(final ActionPresentation pr) {
		super(pr);
	}

	@Override
	public void enableCombo() throws TransitionActionException {
		autom.setEtatCourant(autom.getButtonDisable());
	}
}
