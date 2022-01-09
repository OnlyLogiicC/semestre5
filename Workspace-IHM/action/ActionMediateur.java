package fr.ensma.a3.ia.convertisseur.mvp.action;

public class ActionMediateur implements IActionMediateur{

	private ActionPresentation presentation;
	private IActionVue vue;
	
	
	public ActionMediateur(ActionPresentation pr) {
		presentation = pr;
		vue = new ActionVue(this);
	}


	@Override
	public ActionVue getVue() {
		return (ActionVue)vue;
	}

	@Override
	public void setVue(IActionVue v) {
		vue = v;
		setComboAcces(false);
		setButtonAcces(false);
	}

	@Override
	public void choixSens() {
		presentation.choixSensFired();		
	}

	@Override
	public void action() {
		presentation.actionFired();
		
	}


	@Override
	public int getConversionIndex() {
		return vue.getConversionIndex();
	}


	@Override
	public void setComboAcces(boolean enable) {
		vue.setComboAcces(enable);
	}

	@Override
	public void setButtonAcces(boolean enable) {
		vue.setButtonAcces(enable);		
	}
	
}
