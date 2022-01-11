package fr.ensma.a3.ia.carnetadressesdao.dao.entity;

public class PersonneEntity {
	
	private int idPers ;
	private String nomPers ;
	private String prenomPers ;
	private int adressePers_FK ;
	
	
	public int getIdPers() {
		return idPers;
	}
	public void setIdPers(int idPers) {
		this.idPers = idPers;
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
	public int getAdressePers_FK() {
		return adressePers_FK;
	}
	public void setAdressePers_FK(int adressePers_FK) {
		this.adressePers_FK = adressePers_FK;
	}
	
	@Override
	public String toString() {
		return idPers + " : " + nomPers + " " + prenomPers + " " + adressePers_FK ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false ;
		}
		if (obj == this) {
			return true ;
		}
		if (!(obj instanceof PersonneEntity)) {
			return false ;
		} else {
			PersonneEntity pers = (PersonneEntity) obj ;
			if ((pers.getNomPers().compareTo(nomPers) == 0) && (pers.getPrenomPers().compareTo(prenomPers) == 0) && (pers.getAdressePers_FK() == adressePers_FK)) {
				return true ;
			} else {
				return false ;
			}
		}
	}

}
