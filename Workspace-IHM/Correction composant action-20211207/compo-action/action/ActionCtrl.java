package fr.ensma.a3.ia.convertisseur.mvc.action;

import fr.ensma.a3.ia.convertisseur.mvc.action.automate.EtatAllDisable;
import fr.ensma.a3.ia.convertisseur.mvc.action.automate.EtatAllEnable;
import fr.ensma.a3.ia.convertisseur.mvc.action.automate.EtatButtonDisable;
import fr.ensma.a3.ia.convertisseur.mvc.action.automate.IEtatAction;
import fr.ensma.a3.ia.convertisseur.mvc.action.automate.TransitionActionException;

public class ActionCtrl {

	private ActionVue vueAction;
	private ActionMdl modelAction;
	
	private IEtatAction etatCourant;
	private IEtatAction allDisable = new EtatAllDisable(this);
	private IEtatAction allEnable = new EtatAllEnable(this);
	private IEtatAction buttonDisable = new EtatButtonDisable(this);
		
	public ActionCtrl(final ActionMdl mdl) {
		modelAction = mdl;
		vueAction = new ActionVue(this, modelAction);
		etatCourant = allDisable;
		vueAction.setComboAcces(false);
		vueAction.setButtonAcces(false);
	}
	
	public ActionVue getVue() {
		return vueAction;
	}
	
	public IEtatAction getAllDisable() {
		return allDisable;
	}
	
	public IEtatAction getAllEnable() {
		return allEnable;
	}
	
	public IEtatAction getButtonDisable() {
		return buttonDisable;
	}
	
	public void setEtatCourant(final IEtatAction etat) {
		etatCourant = etat;
	}
	
	public void enableCombo() {
		try {
			etatCourant.enableCombo();
			vueAction.setComboAcces(true);
		} catch (TransitionActionException e) {
			//LOG
		}
	}
		
	public void choixSens() {
		try {
			etatCourant.choixSens();
			modelAction.choixSensFired();
		} catch (TransitionActionException e) {
			
		}
	}
	
	public void enableButton() {
		try {
			etatCourant.enableButton();
			vueAction.setButtonAcces(true);
		} catch (TransitionActionException e) {

		}
	}
	
	public void action() {
		try {
			etatCourant.action();
			modelAction.actionFired();
			vueAction.setComboAcces(false);
			vueAction.setButtonAcces(false);
		} catch (TransitionActionException e) {

		}
	}

}
