package fr.ensma.a3.ia.jeupersonnages.elements.personnages.humain ;

import fr.ensma.a3.ia.jeupersonnages.map.Base ;
import fr.ensma.a3.ia.jeupersonnages.elements.objets.Catapulte ;

public class Guerrier extends PersonnageHumain {
	
	private static Integer numInstance = 1;
	private Catapulte Cata ;
	
	Guerrier(final String id, final Float niveauV,final Integer puiss, final Base base) {
		super(id,niveauV,puiss,base) ;
		numInstance += 1 ;
		
	}
	
	Guerrier(final Float niveauV,final Integer puiss, final Base base) {
		super("guerrier",niveauV,puiss,base) ;
		numInstance += 1 ;
	}
	
	public Integer getnumInstance() {
		return Guerrier.numInstance ;
	}
	
	@Override
	public Integer getpuissanceAttaque() {
		return this.puissanceAttaque ;
	}
	

	@Override
	public String toString() {
		return "Classe Guerrier Instance : " + Guerrier.numInstance + "\n" + this.toString() ;
	}

	@Override
	public void deplacement() {
		System.out.println("Le guerrier se deplace avec force et honneur ! En garde");
		
	}
}
