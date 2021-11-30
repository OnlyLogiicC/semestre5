package fr.ensma.a3.ia.mvc.textfield.automate;

import fr.ensma.a3.ia.mvc.textfield.textCtrl;

public class EtatRempli extends AbstractEtat{
	
	public EtatRempli(textCtrl ctrl) {
		super(ctrl);
	}
	
	@Override
	public void chiffre() throws TransitionTextException {
		autom.newValeurFired();
	}
	
	@Override
	public void suppr() throws TransitionTextException{
		autom.newValeurFired();
	}
	
	@Override
	public void supprEtVide() throws TransitionTextException{
		autom.setetatCourant(autom.getTextVide());
		autom.newValeurFired();
	}
}
