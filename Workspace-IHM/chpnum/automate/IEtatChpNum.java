package fr.ensma.a3.ia.convertisseur.mvc.chpnum.automate;

public interface IEtatChpNum {

	public void enableChp() throws TransitionChpNumException;
	public void diableChp() throws TransitionChpNumException;
	public void chiffre() throws TransitionChpNumException;
	public void suppr() throws TransitionChpNumException;
	public void supprEtVide() throws TransitionChpNumException;
	
}
