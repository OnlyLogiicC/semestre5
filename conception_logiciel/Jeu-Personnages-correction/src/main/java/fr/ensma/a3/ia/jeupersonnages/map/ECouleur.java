package fr.ensma.a3.ia.jeupersonnages.map;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/**
 * Définition d'une énumération de couleurs.
 * @author Mikky
 * @version 1.0
 */
public enum ECouleur {

	/**
	 * Définition des couleurs
	 */
	Rouge("Lannister"), Vert("Tyrell"), Bleu("Stark"), Jaune("Baratheon");

	private String nomFamille;

	private ECouleur(final String val) {
		nomFamille = val;
	}

	/**
	 * Obtient le nom de la famille correspondant à la couleur.
	 * @return {@link String}, la famille
	 */
	public String getNom() {
		return nomFamille;
	}

	/**
	 * Obtient la couelur correspondant à une famille
	 * @param nom {@link String}, le nom de la famille
	 * @return {@link String}, la couleur
	 */
	public static ECouleur getCouleurByFamille(final String nom) {
		Objects.requireNonNull(nom, "nom ne peut pas être null ...");
		List<ECouleur> all_coul = Arrays.asList(ECouleur.values());
		ListIterator<ECouleur> ite = all_coul.listIterator();
		while (ite.hasNext()) {
			ECouleur coul = ite.next();
					 //ite.getNom().next().compareTo(nom) != 0) {
			if (coul.getNom().compareTo(nom) == 0) {
				return coul;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return super.toString() + "(" + nomFamille + ")";
	}
}
