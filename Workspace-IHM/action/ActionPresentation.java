package fr.ensma.a3.ia.convertisseur.mvp.action;

import java.util.ArrayList;
import java.util.List;

import fr.ensma.a3.ia.convertisseur.mvp.action.automate.EtatAllDisable;
import fr.ensma.a3.ia.convertisseur.mvp.action.automate.EtatAllEnable;
import fr.ensma.a3.ia.convertisseur.mvp.action.automate.EtatButtonDisable;
import fr.ensma.a3.ia.convertisseur.mvp.action.automate.IEtatAction;
import fr.ensma.a3.ia.convertisseur.mvp.action.automate.TransitionActionException;

public class ActionPresentation {

	//Mediateur
	IActionMediateur mediatAction;
	//Automate
	private IEtatAction etatCourant;
	private IEtatAction allDisable = new EtatAllDisable(this);
	private IEtatAction allEnable = new EtatAllEnable(this);
	private IEtatAction buttonDisable = new EtatButtonDisable(this);
	//Observer
	private List<IActionObserver> mesAbo;
	
	public ActionPresentation() {
		mediatAction = new ActionMediateur(this);
		mesAbo = new ArrayList<IActionObserver>();
		etatCourant = allDisable;
		mediatAction.setComboAcces(false);
		mediatAction.setButtonAcces(false);
	}
	
	public IActionMediateur getMediateur() {
		return mediatAction;
	}
	
	//Automate
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
	//Observer
	public void addActionHandler(IActionObserver obs) {
		mesAbo.add(obs);
	}

	//
	public void choixSensFired() {
		try {
			etatCourant.choixSens();
			int val = mediatAction.getConversionIndex();
			for (IActionObserver obs : mesAbo) {
				obs.choixSensEvent(val);
			}
		} catch (TransitionActionException e) {
			
		}
	}
	
	public void enableCombo() {
		try {
			etatCourant.enableCombo();
			mediatAction.setComboAcces(true);
		} catch (TransitionActionException e) {
			//LOG
		}
	}
	
	public void disableCombo() {
		try {
			etatCourant.disableCombo();;
			mediatAction.setComboAcces(false);
		} catch (TransitionActionException e) {
			//LOG
		}
	}
	
	public void enableButton() {
		try {
			etatCourant.enableButton();
			mediatAction.setButtonAcces(true);
		} catch (TransitionActionException e) {

		}
	}
	
	public void disableButton() {
		try {
			etatCourant.disableButton();
			mediatAction.setButtonAcces(false);
		} catch (TransitionActionException e) {

		}
	}
	
	public void actionFired() {
		try {
			etatCourant.action();
			for (IActionObserver obs : mesAbo) {
				obs.actionEvent();
			}
			mediatAction.setComboAcces(false);
			mediatAction.setButtonAcces(false);
		} catch (TransitionActionException e) {

		}
	}
}
