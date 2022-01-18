package fr.ensma.a3.ia.carnetadressesdao.business;


public class Adresse {
	
	private int numRue ;
	private String nomRue ;
	private String nomVille;
	private int codePostal;
	
	public Adresse(int num, String nomR, String nomV, int code) {
		numRue = num ;
		nomRue = nomR ;
		nomVille = nomV ;
		codePostal = code ;
	}
	
	public int getNumRue() {
		return numRue;
	}
	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}
	public String getNomRue() {
		return nomRue;
	}
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}
	public String getNomVille() {
		return nomVille;
	}
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
	@Override
	public String toString() {
		return numRue + " " + nomRue + " - " + codePostal + " " + nomVille;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Adresse)) {
			return false;
		} else {
			Adresse ad = (Adresse) obj;
			if ((ad.getNumRue() == numRue) && (ad.getNomRue().compareTo(nomRue) == 0)
					&& (ad.getCodePostal() == codePostal) && (ad.getNomVille().compareTo(nomVille) == 0)) {
				return true;
			} else {
				return false;
			}
		}
	}

}
