package fr.ensma.a3.ia.jeupersonnages.elements.personnages ;

import java.util.Objects;

import fr.ensma.a3.ia.jeupersonnages.comportements.IDeplacable ;

import fr.ensma.a3.ia.jeupersonnages.elements.ElementJeu ;
import fr.ensma.a3.ia.jeupersonnages.map.Base ;

public abstract class ElementJeuVivant extends ElementJeu implements IDeplacable, IPersonnage {
	
	protected String Ident ;
	protected Float niveauVie ;
	protected Integer puissanceAttaque ;
	
	public ElementJeuVivant(final String id, final Float niveauV, final Integer puiss, final Base base) {
		super(base) ;
		this.Ident = Objects.requireNonNull(id, "Il faut un identifiant a l'element") ;
		this.niveauVie = Objects.requireNonNull(niveauV, "Il faut un niveau de vie") ;
		this.puissanceAttaque = Objects.requireNonNull(puiss, "Il faut une puissance d'attaque (0 pour un ouvrier)") ;
	}
	
	@Override
	public String getIdent() {
		return this.Ident ;
	}
	
	@Override
	public Float getniveauVie() {
		return this.niveauVie ;
	}
	
	public void setIdent(final String id) {
		this.Ident = id ;
	}
	
	public void setniveauVie(final Float x) {
		this.niveauVie = x ;
	}

	public void setpuissanceAttaque(final Integer puiss) {
		this.puissanceAttaque = puiss ;
	}
	
	@Override
	public void Rappel() {
		System.out.println(this.Ident + "rentre à la base " + this.base.getnomBase() + "!!!\n");
	}
	
	@Override
	public String toString() {
		return this.base.toString() + "NomElementJeuVivant : " + this.Ident + "\nNiveauVie :" + this.niveauVie + "\nPuissanceAttaque" + this.puissanceAttaque + "\n" ;
	}
	
	
}

















