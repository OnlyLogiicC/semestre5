package fr.ensma.a3.ia.jeupersonnages.elements.personnages.humain ;

import java.util.Objects ;

import fr.ensma.a3.ia.jeupersonnages.map.Base ;

public class Ouvrier extends PersonnageHumain {
	
	private Integer puissanceTravail ;
	private static Integer numInstance = 0;
	
	Ouvrier(final String id, final Float niveauV, final Base base, final Integer puissT) {
		super(id,niveauV,0,base) ;
		this.puissanceTravail = Objects.requireNonNull(puissT, "Donner une puissance de travail") ;
		numInstance += 1 ;
		
	}
	
	Ouvrier(final Float niveauV, final Base base, final Integer puissT) {
		super("ouvrier",niveauV,0,base) ;
		this.puissanceTravail = Objects.requireNonNull(puissT, "Donner une puissance de travail") ;
		numInstance += 1 ;
	}
	
	public Integer getpuissanceTravai() {
		return this.puissanceTravail ;
	}
	
	public Integer getnumInstance() {
		return Ouvrier.numInstance ;
	}
	
	@Override
	public Integer getpuissanceAttaque() {
		System.out.println("L'ouvrier ne peut pas attaquer") ;
		return null;
	}
	
	public void setpuissanceTravail(Integer n) {
		this.puissanceTravail = n ;
	}

	@Override
	public String toString() {
		return "Classe Ouvrier Instance : " + Ouvrier.numInstance + "\n" + this.toString() + "PuissanceTravail : " + this.puissanceTravail + "\n" ;
	}

	@Override
	public void deplacement() {
		System.out.println("L'ouvrier se dirige vers son champs... Il est armée d'une trouelle");
		
	}

}
