package fr.ensma.a3.ia.jeupersonnages.elements;

import java.util.Objects;

import fr.ensma.a3.ia.jeupersonnages.map.Base;

public abstract class ElementJeu {

	private Base maBase;
		
	public ElementJeu(final Base labase) {
		maBase = Objects.requireNonNull(labase,"labase ne peut pas être null");
	}
	
	public final Base getBase() {
		return maBase;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (!(obj instanceof ElementJeu)) {
			return false;
		}
		ElementJeu elj = (ElementJeu) obj;
		return maBase.equals(elj.maBase);
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
		hash = hash * HASH_MULT_PRIME + maBase.hashCode();
		return hash;
	}
	
	private static final int HASH_MULT_PRIME = 13;
}
