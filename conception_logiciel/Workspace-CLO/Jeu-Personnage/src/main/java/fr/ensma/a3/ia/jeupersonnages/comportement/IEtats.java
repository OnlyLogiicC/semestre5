package fr.ensma.a3.ia.jeupersonnages.comportement;

import fr.ensma.a3.ia.jeupersonnages.map.TransitionNotTirableException;

public interface IEtats {
	
	public void deplacer() throws TransitionNotTirableException;
	public void arret() throws TransitionNotTirableException;
	public void SubirAttaque() throws TransitionNotTirableException;
	public void FinAttaque() throws TransitionNotTirableException;
	public void NivVieNul() throws TransitionNotTirableException;
	//public void attaquer();

}
