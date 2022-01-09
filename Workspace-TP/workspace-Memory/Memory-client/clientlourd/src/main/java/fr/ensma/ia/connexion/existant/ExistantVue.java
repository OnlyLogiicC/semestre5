package fr.ensma.ia.connexion.existant;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ExistantVue extends VBox implements IExistantMediateur, EventHandler<ActionEvent> {
	
	private ExistantPresentation presentation ;
	private Label labeladresse ;
	private TextField email ;
	private Button Valider ;
	
	public ExistantVue(ExistantPresentation pres) {
		super() ;
		this.setPresentation(pres) ;
		this.labeladresse = new Label("Adresse email") ;
		this.email = new TextField("exemple@domaine.com") ;
		this.Valider = new Button("Valider") ;
		this.getChildren().addAll(labeladresse, email, Valider);
		this.addEventHandler(ActionEvent.ACTION, this) ;
		
	}
	

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == Valider) {
			presentation.validation() ;
		}
	}
	
	public boolean estvide() {
		return (email.getText() == "") ;
	}


	public ExistantPresentation getPresentation() {
		return presentation;
	}


	public void setPresentation(ExistantPresentation presentation) {
		this.presentation = presentation;
	}
	
	public String getemail() {
		return email.getText() ;
	}

}
