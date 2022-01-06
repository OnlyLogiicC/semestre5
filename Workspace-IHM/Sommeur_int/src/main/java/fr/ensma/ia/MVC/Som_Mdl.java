package fr.ensma.ia.MVC;

import java.util.ArrayList;
import java.util.List;

public class Som_Mdl {
	
	private Som_Ctrl ctrl ;
	private Som_Vue vue ;
	
	private List<IObserver> mesAbos ;
	
	Integer resultat ;
	
	public Som_Mdl() {
		ctrl = new Som_Ctrl(this) ;
		vue = ctrl.getVue() ;
		resultat = 0 ;
		mesAbos = new ArrayList<IObserver>() ;
	}
	
	public Som_Vue getVue() {
		return this.vue ;
	}
	
	public void addSumHandler(IObserver obs) {
		this.mesAbos.add(obs) ;
	}
	
	public void SumFired() {
		for (IObserver obs : mesAbos) {
			obs.sumEvent() ;
		}
	}
	
	public void Somme(Integer a, Integer b ) {
		resultat = a + b ;
	}
	
	public Integer getresultat() {
		return resultat ;
	}
	

}
