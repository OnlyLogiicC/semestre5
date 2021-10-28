package fr.ensma.a3.ia.jeupersonnages.elements;

import java.util.Objects ;

import fr.ensma.a3.ia.jeupersonnages.map.Base;

public abstract class ElementJeu {
	
	protected Base base ;
	
	public ElementJeu(final Base base) {
		this.base = Objects.requireNonNull(base, "Un elementjeu doit appartenir à une base !") ;
	}
	
	public Base getbase() {
		return this.base ;
	}
	
	public void setbase(Base base) {
		this.base = base ;
	}
	
	@Override
	public String toString() {
		return this.base.toString() ;
	}

}
