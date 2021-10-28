package fr.ensma.a3.ia.jeupersonnages.elements.personnages.humain;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.ElementJeuVivant ;
import fr.ensma.a3.ia.jeupersonnages.map.Base;

public abstract class PersonnageHumain extends ElementJeuVivant {
	
	PersonnageHumain(final String id, final Float niveauV, final Integer puiss, final Base base) {
		super(id,niveauV,puiss,base) ;
	}
	
	@Override
	public String toString() {
		return "PersonnageHumain\n" + super.toString() ;
	}


}
