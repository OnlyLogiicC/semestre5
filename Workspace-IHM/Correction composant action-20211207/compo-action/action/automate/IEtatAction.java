package fr.ensma.a3.ia.convertisseur.mvc.action.automate;

public interface IEtatAction {

	public void enableCombo() throws TransitionActionException;
	public void enableButton() throws TransitionActionException;
	public void disableCombo() throws TransitionActionException;
	public void disableButton() throws TransitionActionException;
	public void choixSens() throws TransitionActionException;
	public void action() throws TransitionActionException;
}
