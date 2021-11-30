package fr.ensma.a3.ia.mvc.textfield.automate;

import fr.ensma.a3.ia.mvc.textfield.textCtrl;

public class EtatDisable extends AbstractEtat {
	
	public EtatDisable(textCtrl ctrl) {
		super(ctrl);
	}
	
	
	@Override
	public void enableText() throws TransitionTextException {
		autom.setetatCourant(autom.getetatEnable());
	}

}
