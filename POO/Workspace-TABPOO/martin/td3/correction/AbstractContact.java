package carnetcontacts.contacts;

import java.util.Objects;

/**
 * Modélise un les parties commune d'un contact.
 * @author Mikky
 * @version 1.0
 * @see Coordonnees
 */
public class AbstractContact {
	
	protected String nomContact;
	protected Coordonnees coordContact;
	protected ECategorie catContact;

	protected AbstractContact(final String nomc, final ECategorie catc,
														final Coordonnees coordc){
		nomContact = Objects.requireNonNull(nomc, "nomc ne peut pas etre null ...");
		catContact = catc;
		coordContact = coordc;
	}

	protected AbstractContact(final String nomc, final Coordonnees coordc){
		nomContact = Objects.requireNonNull(nomc, "nomc ne peut pas etre null ...");
		catContact = null;
		coordContact = coordc;
	}
	
	protected AbstractContact(final String nomc, final ECategorie catc){
		nomContact = Objects.requireNonNull(nomc, "nomc ne peut pas etre null ...");
		catContact = catc;
		coordContact = null;
	}

	protected AbstractContact(final String nomc){
		nomContact = Objects.requireNonNull(nomc, "nomc ne peut pas etre null ...");
		catContact = null;
		coordContact = null;
	}
	
	/**
	 * Obtient le nom du contact.
	 * @return {@link String} le nom
	 */
	public final String getNomContact() {
		return nomContact;
	}

	/**
	 * Obtient les coorodonnées du contact.
	 * @return {@link Coordonnees}, les coordonnées
	 */
	public final Coordonnees getCoordContact() {
		return coordContact;
	}

	@Override
	public boolean equals(Object obj) {
		boolean egal = false;
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AbstractContact)) {
			return false;
		}
		AbstractContact cont = (AbstractContact) obj;
		if (!(nomContact.compareTo(cont.nomContact) == 0)) {
			return false;
		}
		if (!equals(coordContact,cont.coordContact)) {
			return false;
		}
		if (!equals(catContact,cont.catContact)) {
			return false;
		}
		return true;
	}

	// Posiibilité d'utiliser Objects.equal à la place ...
	private static boolean equals(Object obj1, Object obj2) {
		return obj1 == obj2 || (obj1 != null && obj1.equals(obj2));
	}
		
	@Override
	public int hashCode() {
		int hash = 1;
		hash = hash + HASH_MULT_PRIME + nomContact.hashCode();
		hash = hash * HASH_MULT_PRIME + ((coordContact == null) ? 0 : coordContact.hashCode());
		hash = hash * HASH_MULT_PRIME + ((catContact == null) ? 0 : catContact.hashCode());
		return hash;
	}

	private static final int HASH_MULT_PRIME = 13;
}
