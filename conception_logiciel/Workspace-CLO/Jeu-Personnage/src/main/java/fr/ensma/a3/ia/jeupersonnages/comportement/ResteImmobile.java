package fr.ensma.a3.ia.jeupersonnages.comportement;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ResteImmobile implements IDeplacable{
	private Integer VitesseDepl = 0 ; 
	private static final Logger LOGGER = Logger.getLogger(EnMarchant.class.getName());

	@Override
	public void deplacement(IDeplacable p) {
		LOGGER.log(Level.INFO, getVitesseDepl() + " dit : je reste immobile fichtre !! ") ;
	}
	
	public final Integer getVitesseDepl() {
		return VitesseDepl;
	}
}
