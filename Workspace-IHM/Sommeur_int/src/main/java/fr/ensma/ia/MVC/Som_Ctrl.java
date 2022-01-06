package fr.ensma.ia.MVC;

import fr.ensma.ia.MVC.automate.IEtats;

public class Som_Ctrl {
	
	private Som_Vue vue ;
	private Som_Mdl mdl ;
	
	private IEtats etatCourant ;
	private IEtats etatSommable = new EtatSommable(this) ;
	private IEtats etatnonSommable = new EtatnonSommable(this) ;
	
	public Som_Ctrl(Som_Mdl mdl) {
		this.mdl = mdl ;
		vue = new Som_Vue(this, mdl) ;
		
		this.etatCourant = this.etatnonSommable ;
		
	}

}
