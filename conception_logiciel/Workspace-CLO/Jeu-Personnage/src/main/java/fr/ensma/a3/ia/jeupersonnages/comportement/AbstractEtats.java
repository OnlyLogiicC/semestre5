package fr.ensma.a3.ia.jeupersonnages.comportement;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.ElementJeuVivant;
import fr.ensma.a3.ia.jeupersonnages.map.TransitionNotTirableException;

public abstract class AbstractEtats implements IEtats {
	protected ElementJeuVivant perso;
	
	public AbstractEtats(ElementJeuVivant p) {
		perso = p;
	}
	
	public void deplacer() throws TransitionNotTirableException {
		throw new TransitionNotTirableException();
	}
	
	public void arret() throws TransitionNotTirableException{
		throw new TransitionNotTirableException();
	}
	
	public void SubirAttaque() throws TransitionNotTirableException{
		throw new TransitionNotTirableException();
	}
	public void FinAttaque() throws TransitionNotTirableException{
		throw new TransitionNotTirableException();
	}
	
	public void NivVieNul() throws TransitionNotTirableException{
		throw new TransitionNotTirableException();
	}

}
