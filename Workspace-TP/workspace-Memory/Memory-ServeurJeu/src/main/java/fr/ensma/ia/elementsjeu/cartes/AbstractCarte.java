package fr.ensma.ia.elementsjeu.cartes;

import fr.ensma.ia.elementsjeu.ElementJeu;
import fr.ensma.ia.elementsjeu.cartes.automateCarte.Cachee;
import fr.ensma.ia.elementsjeu.cartes.automateCarte.Gagnee;
import fr.ensma.ia.elementsjeu.cartes.automateCarte.IEtatCarte;
import fr.ensma.ia.elementsjeu.cartes.automateCarte.Visible;
import fr.ensma.ia.joueurs.AbstractJoueur;

public abstract class AbstractCarte extends ElementJeu implements ICarte {
	
	private Integer position ;
	private AbstractJoueur proprietaire ;
	private IEtatCarte etatCourant ;
	private IEtatCarte cachee = new Cachee(this) ;
	private IEtatCarte visible = new Visible(this) ;
	private IEtatCarte gagnee = new Gagnee(this) ;
	
	public AbstractCarte(String id, Integer pos) {
		super(id);
		this.position = pos ;
		this.proprietaire = null ;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public AbstractJoueur getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(AbstractJoueur proprietaire) {
		this.proprietaire = proprietaire;
	}

	public IEtatCarte getEtatCourant() {
		return etatCourant;
	}

	public void setEtatCourant(IEtatCarte etatCourant) {
		this.etatCourant = etatCourant;
	}

	public IEtatCarte getCachee() {
		return cachee;
	}

	@SuppressWarnings("unused")
	private void setCachee(IEtatCarte cachee) {
		this.cachee = cachee;
	}

	public IEtatCarte getVisible() {
		return visible;
	}

	@SuppressWarnings("unused")
	private void setVisible(IEtatCarte visible) {
		this.visible = visible;
	}

	public IEtatCarte getGagnee() {
		return gagnee;
	}

	@SuppressWarnings("unused")
	private void setGagnee(IEtatCarte gagnee) {
		this.gagnee = gagnee;
	}
	

}
