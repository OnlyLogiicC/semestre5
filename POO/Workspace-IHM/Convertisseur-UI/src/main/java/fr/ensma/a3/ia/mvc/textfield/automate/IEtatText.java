package fr.ensma.a3.ia.mvc.textfield.automate;

public interface IEtatText {
	public void enableText() throws TransitionTextException;
	public void disableText() throws TransitionTextException;
	public void suppr() throws TransitionTextException;
	public void supprEtVide() throws TransitionTextException;
	public void chiffre() throws TransitionTextException;
	
}
