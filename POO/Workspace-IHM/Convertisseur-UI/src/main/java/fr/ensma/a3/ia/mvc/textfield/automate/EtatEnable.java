package fr.ensma.a3.ia.mvc.textfield.automate;

import fr.ensma.a3.ia.mvc.textfield.textCtrl;

public class EtatEnable extends AbstractEtat{
	
	public EtatEnable(textCtrl ctrl) {
		super(ctrl);
	}
	
	
	@Override
	public void disableText() throws TransitionTextException {
		autom.setetatCourant(autom.getetatDisable());
	}


}
