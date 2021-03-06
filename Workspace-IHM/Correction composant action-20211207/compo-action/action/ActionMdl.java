package fr.ensma.a3.ia.convertisseur.mvc.action;

import java.util.ArrayList;
import java.util.List;

public class ActionMdl {

	private ActionCtrl controlAction;
	private ActionVue vueAction;
	
	private List<IActionObserver> mesAbo;
	
	public ActionMdl() {
		controlAction = new ActionCtrl(this);
		vueAction = controlAction.getVue();
		mesAbo = new ArrayList<IActionObserver>();
	}
	
	public ActionVue getVue() {
		return vueAction;
	}
	
	public void enableCombo() {
		controlAction.enableCombo();
	}
	
	public void enableButton() {
		controlAction.enableButton();
	}
	
	public void addActionHandler(IActionObserver obs) {
		mesAbo.add(obs);
	}
	
	public void choixSensFired() {
		for (IActionObserver obs : mesAbo) {
			obs.choixSensEvent();
		}
	}
	
	public void actionFired() {
		for (IActionObserver obs : mesAbo) {
			obs.actionEvent();
		}
	}
}
