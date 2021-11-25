package fr.ensma.a3.ia.jeupersonnages.map;
import java.util.ArrayList;

import java.util.List;


import fr.ensma.a3.ia.jeupersonnages.comportement.ITrouper;
import fr.ensma.a3.ia.jeupersonnages.comportement.IDeplacable;
import fr.ensma.a3.ia.jeupersonnages.comportement.ITroupable;


public class Troupe implements ITroupable, ITrouper{
	private String nomTroupe;
	private List<ITroupable> maTroupe;
	
	public Troupe() {
		maTroupe = new ArrayList<ITroupable>();
	}
	
	public int getNbPersonnages() {
		return maTroupe.size();
	}
	@Override
	public void add_troupe(final ITroupable p) {
		maTroupe.add(p);
	}
	@Override
	public void delete_troupe( final ITroupable p) {
		maTroupe.remove(p);
	}


	public String getNomTroupe() {
		return nomTroupe;
	}
	
	@Override
	public void deplacement(IDeplacable p) {
		for (ITroupable pers : maTroupe) {
			pers.deplacement(p);
		}
	}
	@Override
	public String presente_toi() {
		StringBuffer rep = new StringBuffer(nomTroupe + " - size " + String.valueOf(maTroupe.size()) + "\n");
		rep.append("-----------------\n");
		for (ITroupable p : maTroupe) {
			rep.append(p);
			rep.append("\n");
		}
		rep.append("-----------------\n");
		return rep.toString();
	}
	
}


