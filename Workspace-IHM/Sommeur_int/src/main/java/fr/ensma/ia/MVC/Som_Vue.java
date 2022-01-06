package fr.ensma.ia.MVC;

import javax.swing.Action;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;

public class Som_Vue extends FlowPane implements EventHandler<MouseEvent>{

	private Som_Mdl mdl ;
	private Som_Ctrl ctrl ;
	
	private TextField num1,num2,result ;
	private Button somme ;
	
	public Som_Vue(Som_Ctrl ctrl, Som_Mdl mdl) {
		super() ;
		setAlignment(Pos.TOP_CENTER);
		num1 = new TextField() ;
		num2 = new TextField() ;
		result = new TextField() ;
		result.setEditable(false);
		somme = new Button("Sommer") ;
		getChildren().addAll(num1,num2,result,somme) ;
		addEventHandler(MouseEvent.MOUSE_CLICKED, this);
		this.mdl = mdl ;
		this.ctrl = ctrl ;
	}
	
	
	@Override
	public void handle(MouseEvent event) {
		if (event.getSource() == somme) {
			ctrl.sum() ;
		}
		
	}
	
	public Integer getNum1() {
		return Integer.parseInt(num1.getText()) ;
	}
	
	public Integer getNum2() {
		return Integer.parseInt(num2.getText()) ;
	}
	
	public void set_result(Integer res) {
		result.setText(res.toString());
	}

}
