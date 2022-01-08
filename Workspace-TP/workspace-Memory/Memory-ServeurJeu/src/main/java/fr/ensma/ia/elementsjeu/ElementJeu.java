package fr.ensma.ia.elementsjeu;

public abstract class ElementJeu {
	
	private String id ;
	
	public ElementJeu(String id) {
		this.id = id ;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
