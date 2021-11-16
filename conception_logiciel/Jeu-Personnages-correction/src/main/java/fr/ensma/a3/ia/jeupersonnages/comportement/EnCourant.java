package fr.ensma.a3.ia.jeupersonnages.comportement;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EnCourant implements IDeplacable{
	private Integer VitesseDepl = 20 ; 
	private static final Logger LOGGER = Logger.getLogger(EnMarchant.class.getName());

	@Override
	public void deplacement(IDeplacable p) {
		LOGGER.log(Level.INFO, getVitesseDepl() + " dit : je me deplace en courant !! ") ;
	}
	
	public final Integer getVitesseDepl() {
		return VitesseDepl;
	}

}
