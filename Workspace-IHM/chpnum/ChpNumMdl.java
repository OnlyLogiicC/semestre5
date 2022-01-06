package fr.ensma.a3.ia.convertisseur.mvc.chpnum;

import java.util.ArrayList;
import java.util.List;

public class ChpNumMdl {

	private ChpNumCtrl controleurChpNum;
	private ChpNumVue vueChpNum;
	
	private List<IChpNumObserver> mesAbo;
	
	private String valeurChp;

	public ChpNumMdl() {
		controleurChpNum = new ChpNumCtrl(this);
		vueChpNum = controleurChpNum.getVue();
		valeurChp = "";
		mesAbo = new ArrayList<IChpNumObserver>();
	}
	
	public String getValeur() {
		return valeurChp;
	}
	
	public ChpNumVue getVue() {
		return vueChpNum;
	}
	
	public void setEditable(boolean editable) {
		controleurChpNum.enableChp();
	}
	
	public void updateVal(String val) {
		valeurChp +=val;
		vueChpNum.update();
	}
	
	public void backspace() {
		valeurChp = valeurChp.substring(0,valeurChp.length()-1);
		vueChpNum.update();
	}
	
	public boolean isValeurNum(String val) {
		String v = valeurChp + val;
		if (v.matches("\\d+(\\.\\d*)?|\\.\\d+")) { //|| v.compareTo("") == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		return ((valeurChp).length() == 0);
	}
	
	public void addChpNumHandler(IChpNumObserver obs) {
		mesAbo.add(obs);
	}
	
	public void champVideFired() {
		for (IChpNumObserver obs : mesAbo) {
			obs.champNumVideEvent();
		}
	}
	
	public void champValeurFired() {
		for (IChpNumObserver obs : mesAbo) {
			obs.champNumValEvent();
		}
	}
	
	public void newValeurFired() {
		for (IChpNumObserver obs : mesAbo) {
			obs.newValeurEvent();
		}
	}
	
}
