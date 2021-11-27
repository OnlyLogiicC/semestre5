package fr.ensma.a3.ia;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ConvertisseurED extends Application{

	private FlowPane root2;
	private VBox panBouton;
	private Button actConvert;
	private TextField champEntree, champSortie;
	private ComboBox<String> choixSens;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Convertisseur Euros<->Dollars");
		root2 = new FlowPane(Orientation.HORIZONTAL,10, 10);
		root2.setMinWidth(600);
		root2.setAlignment(Pos.TOP_CENTER);
		champEntree = new TextField();
		root2.getChildren().add(champEntree);
		panBouton = new VBox(20);
		panBouton.setAlignment(Pos.TOP_CENTER);
		choixSens = new ComboBox<>();
		choixSens.getItems().addAll("Dollars->Euros","Euros->Dollars");
		choixSens.getSelectionModel().select(0);
		actConvert = new Button("Conversion !!!");
		panBouton.getChildren().addAll(choixSens,actConvert);
		root2.getChildren().addAll(panBouton);
		champSortie = new TextField();
		champSortie.setEditable(false);
		root2.getChildren().addAll(champSortie);
		Scene scene = new Scene(root2, 600, 100);
		
		primaryStage.setScene(scene);
		primaryStage.setMinWidth(600);
		primaryStage.setMinHeight(120);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
