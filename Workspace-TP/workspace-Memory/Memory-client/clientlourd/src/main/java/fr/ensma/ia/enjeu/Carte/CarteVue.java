package fr.ensma.ia.enjeu.Carte;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class CarteVue extends Button implements ICarteMediateur, EventHandler<ActionEvent> {

	private CartePresentation presentation ;
	private int button_size = 100 ; 
	
	public CarteVue(CartePresentation pres) {
		super() ;
		this.presentation = pres ;
		this.setPrefWidth(button_size);
		this.setPrefHeight(button_size*1.5);
		this.setText("Verso");
		//this.setMinWidth(vBox.getPrefWidth());
		this.addEventHandler(ActionEvent.ACTION, this);
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		if (event.getSource() == this) {
			presentation.setImage();
		}
		
	}
	
	public CartePresentation getPresentation() {
		return presentation;
	}

	public void setPresentation(CartePresentation presentation) {
		this.presentation = presentation;
	}

	public void setImage(String label) {
		
		this.setText(label);
	}
	
	
}
