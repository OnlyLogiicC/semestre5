package fr.ensma.a3.ia.mvc.textfield;

import fr.ensma.a3.ia.mvc.textfield.automate.EtatDisable;
import fr.ensma.a3.ia.mvc.textfield.automate.EtatEnable;
import fr.ensma.a3.ia.mvc.textfield.automate.EtatRempli;
import fr.ensma.a3.ia.mvc.textfield.automate.IEtatText;
import fr.ensma.a3.ia.mvc.textfield.automate.TransitionTextException;

public class textCtrl {
	
	private textVue vue ;
	private textMdl model ;
	
	private IEtatText etatCourant ;
	private IEtatText etatDisable = new EtatDisable(this) ;
	private IEtatText etatEnable = new EtatEnable(this) ;
	private IEtatText etatRempli = new EtatRempli(this) ;
	
	public textCtrl(final textMdl mdl) {
		model = mdl ;
		vue = new textVue(this, model) ;
		etatCourant = etatDisable ;
		//TODO appel fonctions vue.set...()
		
	}
	
	public textVue getVue() { return this.vue ;}
	
	
	public IEtatText getetatDisable() { return this.etatDisable ; }
	
	public IEtatText getetatEnable() { return this.etatEnable ; }

	public IEtatText getetatRempli() { return this.etatRempli ; }
	
	public void setetatCourant(IEtatText state) {this.etatCourant = state ;	}
	
	public void enableText() {
		try {
			etatCourant.enableText();
			vue.setTextEditable(true); 
			vue.setTextDisable(false);
		} catch (TransitionTextException e) {
		}
	}
	
	public void valEntree(String val) {
		try {
			if (model.isValeurNum(val)) {
				etatCourant.newVal();
				model.updateVal(val);
			}
		} catch (TransitionTextException e) {
		}
	}	
	
	public void backspace() {
		try {
			etatCourant.suppr();
			model.backspace();
			if (model.isEmpty()) {
				etatCourant.supprEtVide();
			}
		} catch (TransitionTextException e) {
		}
	}
	
	//TODO try catch
	
	
	}