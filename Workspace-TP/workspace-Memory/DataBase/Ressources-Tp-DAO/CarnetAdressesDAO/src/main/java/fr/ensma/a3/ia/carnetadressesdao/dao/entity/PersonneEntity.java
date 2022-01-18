package fr.ensma.a3.ia.carnetadressesdao.dao.entity;

public class PersonneEntity {
	
	private int idPers;
	private String nom;
	private String prenom;
	private int adressePers_FK;
	
	public int getIdPers() {
		return idPers;
	}
	public void setIdPers(int idPers) {
		this.idPers = idPers;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAdressePers_FK() {
		return adressePers_FK;
	}
	public void setAdressePers_FK(int adressePers_FK) {
		this.adressePers_FK = adressePers_FK;
	}
	
	@Override
	public String toString() {
		return idPers + " : " + nom + " " + prenom + " - " + adressePers_FK ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof PersonneEntity)) {
			return false;
		} else {
			PersonneEntity ad = (PersonneEntity) obj;
			if ((ad.getNom().compareTo(nom) == 0)&&(ad.getPrenom().compareTo(prenom) == 0)
					&& (ad.getAdressePers_FK() == adressePers_FK)) {
				return true;
			} else {
				return false;
			}
		}
	}
}
