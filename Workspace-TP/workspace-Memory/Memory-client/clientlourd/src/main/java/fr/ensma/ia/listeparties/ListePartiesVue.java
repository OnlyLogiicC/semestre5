package fr.ensma.ia.listeparties;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ListePartiesVue extends VBox implements IListePartiesMediateur, EventHandler<ActionEvent> {
	
	private ListePartiesPresentation presentation ;
	private Button Connexion ;
	private Button HallofFame ;
	private ComboBox<String> ComboParties;
	
	public ListePartiesVue(ListePartiesPresentation pres, List<String> listeparties) {
		super() ;
		this.setPresentation(pres) ;
		this.Connexion = new Button("Se Connecter") ;
		this.HallofFame = new Button("Hall of Fame") ;
		for (String partie : listeparties) {
			ComboParties.getItems().add(partie);
		}
		this.getChildren().addAll(ComboParties, Connexion, HallofFame);
		this.addEventHandler(ActionEvent.ACTION, this) ;
		
	}
	

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == Connexion) {
			presentation.connexion() ;
		}
		if (event.getSource() == HallofFame) {
			presentation.halloffame() ;
		}
	}
	

	public ListePartiesPresentation getPresentation() {
		return presentation;
	}


	public void setPresentation(ListePartiesPresentation presentation) {
		this.presentation = presentation;
	}
	

}
