package fr.ensma.a3.ia.mvc.textfield.automate;

import fr.ensma.a3.ia.mvc.textfield.textCtrl;

public class AbstractEtat implements IEtatText {
	
	protected textCtrl autom;
	
	public AbstractEtat( textCtrl ctrl) {
		autom = ctrl;
	}

	@Override
	public void enableText() throws TransitionTextException{
		throw new TransitionTextException();
	}
	
	@Override
	public void disableText() throws TransitionTextException{
		throw new TransitionTextException();
	}


	@Override
	public void suppr() throws TransitionTextException{
		throw new TransitionTextException();
	}

	@Override
	public void chiffre() throws TransitionTextException{
		throw new TransitionTextException();
	}
	
	@Override
	public void supprEtVide() throws TransitionTextException{
		throw new TransitionTextException();
	}
	
}
