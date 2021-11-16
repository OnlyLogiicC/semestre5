package fr.ensma.a3.ia.jeupersonnages.elements.personnages;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import fr.ensma.a3.ia.jeupersonnages.comportement.EtatAuRepos;
import fr.ensma.a3.ia.jeupersonnages.comportement.EtatEnDefense;
import fr.ensma.a3.ia.jeupersonnages.comportement.EtatEnDeplacement;
import fr.ensma.a3.ia.jeupersonnages.comportement.IDeplacable;
import fr.ensma.a3.ia.jeupersonnages.comportement.IEtats;
import fr.ensma.a3.ia.jeupersonnages.comportement.ITroupable;
import fr.ensma.a3.ia.jeupersonnages.comportement.ResteImmobile;
import fr.ensma.a3.ia.jeupersonnages.elements.ElementJeu;
import fr.ensma.a3.ia.jeupersonnages.elements.personnages.humain.PersonnageHumain;
import fr.ensma.a3.ia.jeupersonnages.map.Base;
import fr.ensma.a3.ia.jeupersonnages.map.TransitionNotTirableException;

public abstract class ElementJeuVivant extends ElementJeu implements IPersonnages, IDeplacable, ITroupable, IEtats {

	private String ident;
	private Float niveauVie;
	protected Integer puissanceAtt;
	protected IDeplacable compoDeplacement;
	protected IEtats etatCourant;
	protected IEtats AuRepos = new EtatAuRepos(this);
	protected IEtats EnDeplacement = new EtatEnDeplacement(this);
	protected IEtats EnDefense = new EtatEnDefense(this);
	private static final Logger LOGGER = Logger.getLogger(PersonnageHumain.class.getName());
	
	public ElementJeuVivant(final Base labase,final String id, final Float nv, final Integer patt) {
		super(labase);
		ident = Objects.requireNonNull(id,"id ne peut pas être null");
		niveauVie = Objects.requireNonNull(nv,"nv ne peut pas etre null");
		puissanceAtt = Objects.requireNonNull(patt,"patt ne peut pas etre null");
		getBase().ajoutPersoBase(this);
		compoDeplacement = new ResteImmobile();
		etatCourant =  AuRepos;
		
		
	}
	

	public ElementJeuVivant(final Base labase, final String id, final Float nv) {
		super(labase);
		ident = Objects.requireNonNull(id,"id ne peut pas être null");
		niveauVie = Objects.requireNonNull(nv,"nv ne peut pas etre null");
		puissanceAtt = 0;
		getBase().ajoutPersoBase(this);
		compoDeplacement = new ResteImmobile();
		etatCourant= AuRepos;
	}
	
	@Override
	public final String getIdent() {
		return ident;
	}
	
	public final Float getNiveauVie() {
		return niveauVie;
	}
	
	public void setNiveauVie(final Float nvie) {
		niveauVie = nvie;
	}
	@Override
	public String presente_toi() {
		return toString();
	}
	
	public void setcompoDeplacement(IDeplacable compo) {
		compoDeplacement = compo;
	}
	
	
	@Override
	public void deplacement(IDeplacable p) {
		try {
			etatCourant.deplacer();
			compoDeplacement.deplacement(this);
		} catch(TransitionNotTirableException e) {
			LOGGER.log(Level.INFO, "demande de deplacment non valide");
		}
	}
	
	@Override 
	public void deplacer() throws TransitionNotTirableException {
		etatCourant.deplacer();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (!(obj instanceof ElementJeuVivant)) {
			return false;
		}
		if (! super.equals(obj)) {
			return false;
		}
		ElementJeuVivant eljv = (ElementJeuVivant) obj;
		return ((ident.compareTo(eljv.ident) == 0) && niveauVie.equals(eljv.niveauVie)
				&& puissanceAtt.equals(eljv.puissanceAtt));
	}
	
	@Override
	public int hashCode() {
		int hash = super.hashCode();
		hash = hash * HASH_MULT_PRIME + ident.hashCode();
		hash = hash * HASH_MULT_PRIME + niveauVie.hashCode();
		hash = hash * HASH_MULT_PRIME + puissanceAtt.hashCode();
		return hash;
	}
	
	private static final int HASH_MULT_PRIME = 7;

	public IEtats getAuRepos() {
		return AuRepos;
	}
	
	public IEtats getEnDeplacement() {
		return EnDeplacement;
	}
	
	public void setEtatCourant(IEtats etat) {
		etatCourant = etat;
	}
	
	
}
