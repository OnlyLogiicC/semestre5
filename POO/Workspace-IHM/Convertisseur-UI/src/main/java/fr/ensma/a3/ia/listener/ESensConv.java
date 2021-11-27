package fr.ensma.a3.ia.listener;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import fr.ensma.a3.ia.ConvertisseurED;

public class ESensConv implements EventHandler<ActionEvent> {
	
	private ConvertisseurED vue ;
	
	public ESensConv(final ConvertisseurED v) {
		vue = v ;
	}

	@Override
	public void handle(ActionEvent event) {
		vue.afficherSens();
	}

}
