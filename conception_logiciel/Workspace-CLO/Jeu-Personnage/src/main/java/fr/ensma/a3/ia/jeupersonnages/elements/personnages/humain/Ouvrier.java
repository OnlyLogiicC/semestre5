package fr.ensma.a3.ia.jeupersonnages.elements.personnages.humain;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import fr.ensma.a3.ia.jeupersonnages.map.Base;

public class Ouvrier extends PersonnageHumain {

	private static int numInstance = 0;
	private Integer puissanceTrav;
	
	private static final Logger LOGGER = Logger.getLogger(Ouvrier.class.getName());
	
	public Ouvrier(final Base labase, final String id, final Float nv, final Integer ptr) {
		super(labase,id,nv);
		puissanceTrav = Objects.requireNonNull(ptr);
		numInstance ++;
	}
	
	public Ouvrier(final Base labase, final Float nv, final Integer ptr) {
		super(labase,"Ouvrier(" + (numInstance+1) + ")",nv);
		puissanceTrav = Objects.requireNonNull(ptr);
		numInstance ++;
	}
	
	public final Integer getPuissanceTravail() {
		return puissanceTrav;
	}
		
	@Override
	public String toString() {
		return super.toString() + " - PTr=" + puissanceTrav;
	}
	
	@Override
	public void estAttaque(Integer puissatt) {
		setNiveauVie(getNiveauVie()- puissatt.floatValue()/50.0f);
		LOGGER.log(Level.INFO, getIdent() + " dit : Aiieee ça fait mal !! (nvie -> " 
				+ getNiveauVie()+")");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (!(obj instanceof Ouvrier)) {
			return false;
		}
		if (! super.equals(obj)) {
			return false;
		}
		Ouvrier ouv = (Ouvrier) obj;
		return ( puissanceTrav.equals(ouv.puissanceTrav));
	}
	
	@Override
	public int hashCode() {
		int hash = super.hashCode();
		hash = hash * HASH_MULT_PRIME + puissanceAtt.hashCode();
		return hash;
	}
	
	private static final int HASH_MULT_PRIME = 7;
}
