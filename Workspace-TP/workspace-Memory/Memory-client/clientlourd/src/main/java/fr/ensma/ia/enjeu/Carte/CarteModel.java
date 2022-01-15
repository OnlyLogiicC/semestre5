package fr.ensma.ia.enjeu.Carte;

import javafx.scene.image.ImageView;

public class CarteModel {
	
	private String recto = "Recto" ;
	private String verso = "Verso" ;
	private String horsjeu = "Carte Gangnée" ;
	private Integer etat ;


	public CarteModel() {
		etat = 2 ;
	}
	
	public String getImage() {
		if (etat == 0) {
			return horsjeu ;
		}
		if (etat == 1) {
			return verso ;
		}
		return recto ;
	}
	
	public Integer getEtat() {
		return etat ;
	}
	
	public void setEtat(Integer etat) {
		this.etat = etat ;
	}
}
