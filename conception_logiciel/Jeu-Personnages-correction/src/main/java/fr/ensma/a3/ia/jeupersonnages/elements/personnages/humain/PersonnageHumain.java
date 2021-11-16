package fr.ensma.a3.ia.jeupersonnages.elements.personnages.humain;

import java.util.logging.Level;
import java.util.logging.Logger;

import fr.ensma.a3.ia.jeupersonnages.comportement.EnMarchant;
import fr.ensma.a3.ia.jeupersonnages.comportement.IAttaquableTerre;
import fr.ensma.a3.ia.jeupersonnages.comportement.IEtats;
import fr.ensma.a3.ia.jeupersonnages.elements.personnages.ElementJeuVivant;
import fr.ensma.a3.ia.jeupersonnages.map.Base;

public abstract class PersonnageHumain extends ElementJeuVivant implements IAttaquableTerre, IEtats {

	private static final Logger LOGGER = Logger.getLogger(PersonnageHumain.class.getName());
	
	public PersonnageHumain(final Base labase, final String id, final Float nv,
			final Integer patt) {
		super(labase,id,nv,patt);
		compoDeplacement = new EnMarchant();
	}
	
	public PersonnageHumain(final Base labase, final String id, final Float nv) {
		super(labase,id,nv);
		compoDeplacement = new EnMarchant();
	}

	@Override
	public void alarme() {
		LOGGER.log( Level.INFO,"Vite, rentrons !!!!");
	}


	
	@Override
	public String toString() {
		return "Humain(" + getBase().getNomBase() + ") -> " 
	+ getIdent() + " - NV=" + getNiveauVie();
	}
	
	// Pas de redéfinition de equals et hashCode ici
	// pas d'attribut supplémentaire -> les méthodes heritées conviennent
}
