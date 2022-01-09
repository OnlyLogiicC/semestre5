package fr.ensma.a3.ia.convertisseur.mvp.action.automate;

import fr.ensma.a3.ia.convertisseur.mvp.action.ActionPresentation;

public abstract class AbstractEtat implements IEtatAction {

	protected ActionPresentation autom;
	
	public AbstractEtat(final ActionPresentation pr) {
		autom = pr;
	}
	
	@Override
	public void enableCombo() throws TransitionActionException {
		throw new TransitionActionException();
	}

	@Override
	public void enableButton() throws TransitionActionException {
		throw new TransitionActionException();		
	}

	@Override
	public void disableCombo() throws TransitionActionException {
		throw new TransitionActionException();		
	}

	@Override
	public void disableButton() throws TransitionActionException {
		throw new TransitionActionException();		
	}

	@Override
	public void choixSens() throws TransitionActionException {
		throw new TransitionActionException();		
	}

	@Override
	public void action() throws TransitionActionException {
		throw new TransitionActionException();
	}

}
