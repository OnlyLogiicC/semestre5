package fr.ensma.a3.ia.jeupersonnages.elements.personnages.humain;

import java.util.logging.Level;
import java.util.logging.Logger;

import fr.ensma.a3.ia.jeupersonnages.comportements.IAttaquableTerre;
import fr.ensma.a3.ia.jeupersonnages.comportements.IAttaquantTerre;
import fr.ensma.a3.ia.jeupersonnages.map.Base;

public class Guerrier extends PersonnageHumain implements IGuerrier {

	private static int numInstance = 0;
	
	private static final Logger LOGGER = Logger.getLogger(PersonnageHumain.class.getName());
	
	public final Integer getPuissanceAtt() {
		return puissanceAtt;
	}
	
	public Guerrier(final Base labase, final String id, final Float nv, final Integer patt) {
		super(labase,id,nv,patt);
		numInstance ++;
	}
	
	public Guerrier(final Base labase, final Float nv, final Integer patt) {
		super(labase,"Guerrier(" + (numInstance+1) + ")",nv,patt);
		numInstance ++;
	}
	
	@Override
	public void aLAttaque(IAttaquableTerre cible) {
		LOGGER.log(Level.INFO,getIdent() + " dit : Ah Ah " + cible.getIdent() +
				", je vais t'occir !!! " + "(" + puissanceAtt +")");
		cible.estAttaque(puissanceAtt);
	}
	
	@Override
	public void estAttaque(Integer puissatt) {
		setNiveauVie(getNiveauVie()-puissanceAtt/100.0f);
		LOGGER.log(Level.INFO, getIdent() + " dit : Aiieee ça fait mal !! (nvie -> " 
				+ getNiveauVie()+")");
	}
	
	@Override
	public String toString() {
		return super.toString() + " - PAtt=" + puissanceAtt;
	}

	@Override
	public void deplacement() {
		// TODO Auto-generated method stub
		
	}
	
	
}