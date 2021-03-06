package fr.ensma.a3.ia.jeupersonnages.elements.personnages.animal;

import fr.ensma.a3.ia.jeupersonnages.map.Base ;

public class Dragon extends PersonnageAnimal {
	Integer NUM_INSTANCE = 0 ;
	
	private Integer numInstance ;
	
	Dragon(final String id, final Float niveauV,final Integer puiss, final Base base) {
		super(id,niveauV,puiss,base) ;
		this.numInstance = NUM_INSTANCE ;
		NUM_INSTANCE += 1 ;
		
	}
	
	Dragon(final Float niveauV,final Integer puiss, final Base base) {
		super("dragon",niveauV,puiss,base) ;
		this.numInstance = NUM_INSTANCE ;
		NUM_INSTANCE += 1 ;
	}
	
	public Integer getnumInstance() {
		return this.numInstance ;
	}
	
	@Override
	public Integer getpuissanceAttaque() {
		return this.puissanceAttaque ;
	}
	

	@Override
	public String toString() {
		return "Classe Dragon Instance : " + this.numInstance + "\n" + this.toString() ;
	}

	@Override
	public void deplacement() {
		System.out.println("Le dragon vole vers d'autres cieux");
		
	}
}
