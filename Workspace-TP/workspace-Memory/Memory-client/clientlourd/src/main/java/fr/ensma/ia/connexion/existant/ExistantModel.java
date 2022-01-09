package fr.ensma.ia.connexion.existant;

public class ExistantModel {
	private boolean present;
	
	public ExistantModel() {
		present = false;
		
	}
	
	public void validation() {
		//Interaction avec base de données
	}

	
	public boolean isPresent() {
		return present;
	}

	public void setPresent(boolean present) {
		this.present = present;
	}

}
