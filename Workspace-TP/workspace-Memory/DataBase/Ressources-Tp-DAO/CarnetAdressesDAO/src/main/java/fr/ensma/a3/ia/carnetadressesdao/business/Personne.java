package fr.ensma.a3.ia.carnetadressesdao.business;

import fr.ensma.a3.ia.carnetadressesdao.dao.AdressePoiDAO;
import fr.ensma.a3.ia.carnetadressesdao.dao.IDao;
import fr.ensma.a3.ia.carnetadressesdao.dao.entity.AdresseEntity;
import fr.ensma.a3.ia.carnetadressesdao.dao.entity.PersonneEntity;

public class Personne {
	
	private IDao<AdresseEntity> adrdao = new AdressePoiDAO();
	private String nomPers ;
	private String prenomPers ;
	private Adresse adr ;
	
	public Personne(String nom, String prenom, Adresse adress) {
		nomPers = nom ;
		prenomPers = prenom ;
		adr = adress ;
	}
	
	public String getNomPers() {
		return nomPers;
	}
	public void setNomPers(String nomPers) {
		this.nomPers = nomPers;
	}
	public String getPrenomPers() {
		return prenomPers;
	}
	public void setPrenomPers(String prenomPers) {
		this.prenomPers = prenomPers;
	}
	public Adresse getAdr() {
		return adr;
	}
	public void setAdr(Adresse adr) {
		this.adr = adr;
	}
	
	@Override
	public String toString() {
		return "Personne : " + nomPers + " " + prenomPers + " " + "\nAdresse : " + adr.toString() ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false ;
		}
		if (obj == this) {
			return true ;
		}
		if (!(obj instanceof Personne)) {
			return false ;
		} else {
			Personne pers = (Personne) obj ;
			if ((pers.getNomPers().compareTo(nomPers) == 0) && (pers.getPrenomPers().compareTo(prenomPers) == 0) && pers.adr.equals(pers.getAdr())) {
				return true ;
			} else {
				return false ;
			}
		}
	}
		
	
	

}
