package fr.ensma.a3.ia.listener;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.logging.Logger;

import fr.ensma.a3.ia.ConvertisseurED;

public class ESensConv implements EventHandler<ActionEvent> {
	
	private ConvertisseurED vue ;
	private static Logger LOGGER = Logger.getLogger(ESensConv.class.getName()) ;
	
	public ESensConv(final ConvertisseurED v) {
		vue = v ;
	}

	@Override
	public void handle(ActionEvent event) {
		LOGGER.info(vue.getSens());
		LOGGER.info(vue.getIndex().toString());
	}

}
