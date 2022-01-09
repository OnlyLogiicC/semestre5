package fr.ensma.ia.connexion.nouveau;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class NouveauVue extends VBox implements INouveauMediateur, EventHandler<ActionEvent> {
	
	private NouveauPresentation presentation ;
	private Label bienvenue ;
	private Label labelemail ;
	private Label labelnom ;
	private Label labelprenom ;
	private TextField email ;
	private TextField nom ;
	private TextField prenom ;
	private Button Valider ;
	
	public NouveauVue(NouveauPresentation pres) {
		super() ;
		this.setPresentation(pres) ;
		this.bienvenue = new Label("Bienvenue !") ;
		this.labelemail = new Label("E-mail !") ;
		this.labelprenom = new Label("Prenom !") ;
		this.labelnom = new Label("Nom !") ;
		this.email = new TextField("exemple@domaine.com") ;
		this.Valider = new Button("Valider") ;
		this.getChildren().addAll(bienvenue, labelemail,email, labelprenom, prenom, labelnom, nom, Valider);
		this.addEventHandler(ActionEvent.ACTION, this) ;
		
	}
	

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == Valider) {
			presentation.validation() ;
		}
	}
	
	public boolean emailestvide() {
		return (email.getText() == "") ;
	}
	
	public boolean prenomestvide() {
		return (prenom.getText() == "") ;
	}
	
	public boolean nomestvide() {
		return (nom.getText() == "") ;
	}


	public NouveauPresentation getPresentation() {
		return presentation;
	}


	public void setPresentation(NouveauPresentation presentation) {
		this.presentation = presentation;
	}
	
	public String getemail() {
		return email.getText() ;
	}


	@Override
	public boolean estvide() {
		// TODO Auto-generated method stub
		if (this.emailestvide()||this.prenomestvide()||this.nomestvide()) {
			return true;			
		}
		return false;
	}


	

}
