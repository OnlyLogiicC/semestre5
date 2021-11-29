package fr.ensma.a3.ia.convertisseur.mvc.action.automate;

public abstract class AbstractEtat implements IEtatAction {

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
