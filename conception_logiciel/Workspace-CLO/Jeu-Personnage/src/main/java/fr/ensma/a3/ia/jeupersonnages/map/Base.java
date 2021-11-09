package fr.ensma.a3.ia.jeupersonnages.map;

import java.util.Objects ;
import java.util.ArrayList;
import java.util.List;

import fr.ensma.a3.ia.jeupersonnages.NotYetImplementedException;

import fr.ensma.a3.ia.jeupersonnages.elements.IRessource;
import fr.ensma.a3.ia.jeupersonnages.elements.objets.IObjet;
import fr.ensma.a3.ia.jeupersonnages.elements.personnages.IPersonnage;

public class Base {
	
	private String nomBase ;
	private ECouleurBase couleurBase ;
	/* collection elementJeu*/
	private List<IPersonnage> collPers ;
	private List<IRessource> collRess ;
	private List<IObjet> collObj ;
	
	public Base(final String nom, final ECouleurBase coul) {
		this.nomBase = Objects.requireNonNull(nom, "Il faut donner un nom a la base !") ;
		this.couleurBase = Objects.requireNonNull(coul, "Il faut donner une couleur a la base !") ;
		this.collPers = new ArrayList<IPersonnage>() ;
		this.collRess = new ArrayList<IRessource>() ;
		this.collObj = new ArrayList<IObjet>() ;
		
	}
	
	public final String getnomBase( ) {
		return this.nomBase ;
	}
	
	public final ECouleurBase getcouleurBase() {
		return this.couleurBase ;
	}
	
	public final int getNbPersonnages() {
		return this.collPers.size();
	}
	
	public final int getNbRessources() {
		return this.collRess.size();
	}
	
	public final int getNbObjets() {
		return this.collObj.size();
	}
	
	public final List<IPersonnage> getCollPers() {
		return collPers;
	}
	
	public List<IRessource> getCollRess() {
		return collRess;
	}

	public List<IObjet> getCollObj() {
		return collObj;
	}
		
	public final void setnomBase(final String nom) {
		this.nomBase = Objects.requireNonNull(nom, "Il faut donner un nom a la base !") ;
	}
	
	public final void setcouleurBase(final ECouleurBase coul) {
		this.couleurBase = Objects.requireNonNull(coul, "Il faut donner une couleur a la base !") ;
	}
	
	public final void ajoutPersoBase(IPersonnage pers) {
		this.collPers.add(pers) ;
	}
	
	public final void ajoutRessourceBase(IRessource ress) {
		this.collRess.add(ress) ;
	}
	
	public final void ajoutObjetBase(IObjet obj) {
		this.collObj.add(obj) ;
	}
	
	public final boolean supprPersoBase(IPersonnage pers) throws BaseVideException {
		if (collPers.size() == 0) {
			//Todo : Ajouter Log
			throw new BaseVideException("la base est deserte !!!");
		}
		return collPers.remove(pers);	
	}
	
	public final void Rappel() {
		for (IPersonnage p : collPers) {
			p.Rappel();
		}
	}

	@Override
	public String toString() {
		StringBuffer rep = new StringBuffer(nomBase + " - " + couleurBase + "\n");
		rep.append("-----------------\n");
		for (IPersonnage p : collPers) {
			rep.append(p);
			rep.append("\n");
		}
		rep.append("-----------------\n");
		return rep.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Base)){
			return false;
		}
		Base bse = (Base) obj;
		return (couleurBase == bse.couleurBase &&
				(bse.getnomBase().compareTo(nomBase) == 0) &&
				(bse.getNbPersonnages() ==0));
	}
	
	@Override
	public int hashCode() {
		new NotYetImplementedException();
		int hash = 1 ;
		hash = hash + HASH_BASE_CONST * this.nomBase.hashCode() ;
		hash = hash + HASH_BASE_CONST * this.getcouleurBase().hashCode() ;
		hash = hash + HASH_BASE_CONST * this.getNbPersonnages() ;
		hash = hash + HASH_BASE_CONST * this.getNbRessources() ;
		hash = hash + HASH_BASE_CONST * this.getNbObjets() ;
		return hash ;
	}
	
	int HASH_BASE_CONST = 5 ;
	
}
