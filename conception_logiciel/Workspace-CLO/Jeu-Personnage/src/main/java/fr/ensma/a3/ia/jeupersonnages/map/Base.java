package fr.ensma.a3.ia.jeupersonnages.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.IPersonnages;

/**
 * Définition d'une Base du jeu des personnages.
 * @author Mikky
 * @version 1.0
 */
public class Base {
	
	private String nomBase;
	private ECouleur coulBase;
	private List<IPersonnages> mesPersos;
	
	/**
	 * Obtient une instance de Base.
	 * @param coul {@link ECouleur}, la couleur
	 */
	public Base (final String nomb, final ECouleur coul) {
		nomBase = Objects.requireNonNull(nomb, "nomb ne peut pas etre null ...");
		coulBase = Objects.requireNonNull(coul, "coul ne peut pas être null ...");
		mesPersos = new ArrayList<IPersonnages>();
	}

	/**
	 * Obtient la couleur d'une base
	 * @return {@link ECouleur}, la couleur
	 */
	public final ECouleur getCoulBase() {
		return coulBase;
	}
	
	public final String getNomBase() {
		return nomBase;
	}
	
	public final int getNbPersonnages() {
		return mesPersos.size();
	}
	
	public final void ajoutPersoBase(final IPersonnages pers) {
		mesPersos.add(pers);
	}
	
	
	/**
	 * action : SupprPersoBase
	 * Entraine : Nbperso -1 si Nbperso > 0, BaseVideException sinon
	 * 
	 * @param pers
	 */
	public final boolean supprPersoBase(IPersonnages pers) throws BaseVideException {
		if (mesPersos.size() == 0) {
			//Todo : Ajouter Log
			throw new BaseVideException("la base est deserte !!!");
		}
		return mesPersos.remove(pers);	
	}
	
	
	public final void Alarme() {
		for (IPersonnages p : mesPersos) {
			p.alarme();
		}
	}
	
	@Override
	public String toString() {
		StringBuffer rep = new StringBuffer(nomBase + " - " + coulBase + "\n");
		rep.append("-----------------\n");
		for (IPersonnages p : mesPersos) {
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
		return (coulBase == bse.coulBase &&
				(bse.getNomBase().compareTo(nomBase) == 0) &&
				(bse.getNbPersonnages() ==0));
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
		hash = hash * HASH_MULT_PRIME + nomBase.hashCode();
		hash = hash * HASH_MULT_PRIME + coulBase.hashCode();
		hash = hash * HASH_MULT_PRIME + mesPersos.size();
		return hash;
	}
	
	private static final int HASH_MULT_PRIME = 5;
	
}
