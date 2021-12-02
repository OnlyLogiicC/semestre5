package fr.ensma.a3.ia.mvc.textfield;

import java.util.ArrayList;
import java.util.List;


public class textMdl {
	
	private textCtrl control ;
	private textVue vue ;
	
	private List<ITextObserver> mesAbos;
	
	public textMdl() {
		control = new textCtrl(this) ;
		vue = control.getVue() ;
		mesAbos = new ArrayList<ITextObserver>() ;
	}
	
	public textVue getVue() { return vue ; }
	
	public void addTextHandler(ITextObserver obs) {
		mesAbos.add(obs);
	}
	
	public void enabletext() {control.getetatEnable();}
	
	
	public void backspace() {
		//TODO a implementer: verifier que c'est pas vide et deplacer le curseur 
	}
}
	
