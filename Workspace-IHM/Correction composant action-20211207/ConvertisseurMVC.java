package fr.ensma.a3.ia.convertisseur;

import fr.ensma.a3.ia.convertisseur.mvc.action.ActionMdl;
import fr.ensma.a3.ia.convertisseur.mvc.action.IActionObserver;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ConvertisseurMVC extends Application implements IActionObserver{

	private FlowPane root2;
	private ActionMdl compoAction;
	private Button test, test2;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Convertisseur Euros<->Dollars / MVC");
		root2 = new FlowPane(Orientation.HORIZONTAL,10, 10);
		root2.setMinWidth(600);
		root2.setAlignment(Pos.TOP_CENTER);
		
		compoAction = new ActionMdl();
		compoAction.addActionHandler(this);
		root2.getChildren().add(compoAction.getVue());
		
		test = new Button("Active Combo");
		root2.getChildren().add(test);
		test.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				compoAction.enableCombo();				
			}
		});
		test2 = new Button("Active Bouton");
		root2.getChildren().add(test2);
		test2.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				compoAction.enableButton();				
			}
		});
		
		Scene scene = new Scene(root2, 600, 100);
		primaryStage.setScene(scene);
		primaryStage.setMinWidth(600);
		primaryStage.setMinHeight(120);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void choixSensEvent() {
		System.out.println("Convertisseur : Modification du sens de conversion");		
	}

	@Override
	public void actionEvent() {
		System.out.println("Convertisseur : demande de conversion");
		
	}
	
}
