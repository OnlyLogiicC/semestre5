package carnetcontacts.contacts;

import java.util.Objects;

import carnetcontacts.adresses.AbstractAdresse;

/**
 * Modélise les coordonnées d'un contact
 * @author Mikky
 * @version 1.0
 * @see AbstractAddress
 * @see AdresseUS
 * @see AdresseEu
 */
public class Coordonnees {

	private String telPort;
	private String telFixe;
	private AbstractAdresse adresse;

	/**
	 * Obtient une instance de {@link Coordonnees}
	 * @param telp {@link String} le numéro de téléphone portable
	 * @param telf {@link String} le numéro de téléphone fixe
	 * @param adr {@link AdresseEU} ou {@link AdresseUS} l'adresse 
	 */
	public Coordonnees (final String telp, final String telf,
											final AbstractAdresse adr) {
		telPort = Objects.requireNonNull(telp, "telp ne peut pas etre null ...");
		telFixe = Objects.requireNonNull(telf, "telf ne peut pas etre null ...");
		adresse = adr;
	}

		/**
	 * Obtient une instance de {@link Coordonnees}
	 * @param telp {@link String} le numéro de téléphone portable
	 * @param telf {@link String} le numéro de téléphone fixe
	 */
	public Coordonnees (final String telp, final String telf) {
		telPort = Objects.requireNonNull(telp, "telp ne peut pas etre null ...");
		telFixe = Objects.requireNonNull(telf, "telf ne peut pas etre null ...");
		adresse = null;
	}
	
	/**
	 * Obtient la valeur du téléphone portable
	 * @return {@link String}, le téléphone portable
	 */
	public final String getTelPort() {
		return telPort;
	}
    
	/**
	 * Obtient la valeur du téléphone fixe
	 * @return {@link String}, le telephone fixe 
	 */
	public final  String getTelFixe() {
		return telFixe;
	}

	/**
	 * Obtient l'adresse
	 * @return {@link AbstractAdresse}, référence sur l'adresse.
	 */
	public AbstractAdresse getAdresse() {
		return adresse;
	}

	/**
	 * Obtient une représentation de Coordonnee au format chaîne.
	 * @return {@link String}, la chaîne.
	 */
	@Override
	public String toString() {
		return "Tel-Port : " + telPort + "\n" +
	    "Tel-Fixe : " + telFixe + "\n" +
	    adresse.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Coordonnees)) {
			return false;
		}
		Coordonnees coor = (Coordonnees) obj;
		// telPort et telFixe non null par construction
		if (!((telPort.compareTo(coor.telPort) == 0)
					&& (telFixe.compareTo(coor.telFixe) == 0))) {
					return false;
		}
		if (adresse == null) { // Attention l'adresse peut-être null
			if (coor.adresse != null) {
				return false;
			} else {
				return true;
			}
		}
		if (adresse.equals(coor.adresse)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = 1;
		hash = hash * HASH_MULT_PRIME + telPort.hashCode();
		hash = hash * HASH_MULT_PRIME + telFixe.hashCode();
		hash = hash * HASH_MULT_PRIME + ((adresse == null) ? 0 : adresse.hashCode());
		return hash;
	}

	private static final int HASH_MULT_PRIME = 11;
}
