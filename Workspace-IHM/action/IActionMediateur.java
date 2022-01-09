package fr.ensma.a3.ia.convertisseur.mvp.action;

public interface IActionMediateur extends IActionVue{

	public ActionVue getVue();
	public void setVue(IActionVue v);
	public void choixSens();
	public void action();
	
	
}
