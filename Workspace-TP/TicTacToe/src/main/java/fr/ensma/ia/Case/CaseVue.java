package fr.ensma.ia.Case;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CaseVue extends Button implements ICaseMediateur, EventHandler<ActionEvent> {

	private CasePresentation presentation ;
	
	public CaseVue(CasePresentation pres) {
		super() ;
		this.presentation = pres ;
		this.setGraphic(new ImageView(new Image("vide.png")));
		this.addEventHandler(ActionEvent.ACTION, this);
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		if (event.getSource() == this) {
			presentation.setImage();
		}
		
	}
	
	public CasePresentation getPresentation() {
		return presentation;
	}

	public void setPresentation(CasePresentation presentation) {
		this.presentation = presentation;
	}

	public void setImage(ImageView img) {
		
		this.setGraphic(img);
	}
	
	
}
