package fr.ensma.a3.ia.convertisseur.mvc.chpnum;

import fr.ensma.a3.ia.convertisseur.mvc.chpnum.automate.EtatDisable;
import fr.ensma.a3.ia.convertisseur.mvc.chpnum.automate.EtatValeur;
import fr.ensma.a3.ia.convertisseur.mvc.chpnum.automate.EtatVide;
import fr.ensma.a3.ia.convertisseur.mvc.chpnum.automate.IEtatChpNum;
import fr.ensma.a3.ia.convertisseur.mvc.chpnum.automate.TransitionChpNumException;

public class ChpNumCtrl {

	private ChpNumMdl modelChpNum;
	private ChpNumVue vueChpNumVue;
	
	private IEtatChpNum etatCourant;
	private IEtatChpNum chpDisable = new EtatDisable(this);
	private IEtatChpNum chpVide = new EtatVide(this); 
	private IEtatChpNum chpVal = new EtatValeur(this);
	
	public ChpNumCtrl(ChpNumMdl mdl) {
		modelChpNum = mdl;
		vueChpNumVue = new ChpNumVue(this, modelChpNum);
		etatCourant = chpDisable;
		vueChpNumVue.setChpDisable(true);
	}
		
	public ChpNumVue getVue() {
		return vueChpNumVue;
	}
	
	public void setEtatCourant(IEtatChpNum etat) {
		etatCourant = etat;
	}
	
	public IEtatChpNum getChpDisable() {
		return chpDisable;
	}
	
	public IEtatChpNum getChpVide() {
		return chpVide;
	}
	
	public IEtatChpNum getChpVal() {
		return chpVal;
	}
	
	public void enableChp() {
		try {
			etatCourant.enableChp();
			vueChpNumVue.setChpEditable(true);
			vueChpNumVue.setChpDisable(false);
		} catch (TransitionChpNumException e) {

		}
	}
	
	public void valEntree(String val) {
		try {
			 if (modelChpNum.isValeurNum(val)) {
					etatCourant.chiffre();
					modelChpNum.updateVal(val);	
			}
			
		} catch (TransitionChpNumException e) {

		}
	}
	
	public void backspace() {
		try {
			etatCourant.suppr();
			modelChpNum.backspace();
			if (modelChpNum.isEmpty()) {
				etatCourant.supprEtVide();
			}
		} catch (TransitionChpNumException e) {
			
		}
	}
	
	public void champVideFired() {
		modelChpNum.champVideFired();
	}
	
	public void champValeurFired() {
		modelChpNum.champValeurFired();
	}
	
	public void newValeurFired() {
		modelChpNum.newValeurFired();
	}

	
}
