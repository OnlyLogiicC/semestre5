package fr.ensma.a3.ia;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;



/**
 * JavaFX App
 */
public class App extends Application {
	
	private Scene scene ;
	private FlowPane root ;
	private VBox box_button ;
	private Button btn ;
	private ComboBox<String> cbox ;
	private TextField txtf_left ;
	private TextField txtf_right ;
	
    @Override
    public void start(Stage primaryStage) {
    	primaryStage.setTitle("Covertisseur Euro<->Dollars") ;
    	root = new FlowPane(Orientation.HORIZONTAL,10,10) ;
    	root.setAlignment(Pos.TOP_CENTER) ;
    	txtf_left = new TextField() ;
    	box_button = new VBox(20) ;
    	box_button.setAlignment(Pos.TOP_CENTER);
    	cbox = new ComboBox<>() ;
    	cbox.getItems().addAll("Dollars->Euros","Euros->Dollars") ;
    	cbox.getSelectionModel().select(0) ;
    	box_button.getChildren().add(cbox) ;
       	btn = new Button("Convertir") ;
       	box_button.getChildren().add(btn) ;
       	txtf_right = new TextField() ;
       	root.getChildren().addAll(txtf_left, box_button, txtf_right) ;
       	scene = new Scene(root, 200, 100) ;
       	primaryStage.setMinHeight(130) ;
       	primaryStage.setMinWidth(700);
       	primaryStage.setScene(scene) ;
       	primaryStage.show() ;
    	
        
    }

    public static void main(String[] args) {
        launch();
    }

}