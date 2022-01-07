package fr.ensma.ia.Case;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CaseModel {
	
	private ImageView vide = new ImageView(new Image(getClass().getResource("/vide.png").toString()));
	private ImageView croix = new ImageView(new Image(getClass().getResource("/croix.png").toString()));
	private ImageView rond = new ImageView(new Image(getClass().getResource("/rond.png").toString()));
	private Integer etat ;


	public CaseModel() {
		etat = 1 ;
	}
	
	public ImageView getImage() {
		if (etat == 0) {
			return vide ;
		}
		if (etat == 1) {
			return croix ;
		}
		return rond ;
	}
	
	public Integer getEtat() {
		return etat;
	}
	
	public void setEtat(Integer etat) {
		this.etat = etat;
	}
}
