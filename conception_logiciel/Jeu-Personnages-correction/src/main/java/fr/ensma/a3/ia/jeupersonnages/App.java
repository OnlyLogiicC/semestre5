package fr.ensma.a3.ia.jeupersonnages;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.humain.Guerrier;
import fr.ensma.a3.ia.jeupersonnages.elements.personnages.humain.Ouvrier;
import fr.ensma.a3.ia.jeupersonnages.map.Base;
import fr.ensma.a3.ia.jeupersonnages.map.ECouleur;

/**
 * Jeu Personnages.
 *
 */
public class App {
	/**
	 * Main.
	 * @param args
	 */
	public static void main(String[] args) {
		ECouleur coul = ECouleur.Rouge;
		System.out.println ("Hello World!");
		System.out.println(coul.getNom());
		System.out.println(ECouleur.getCouleurByFamille("Stark"));
		
		Base winter = new Base("Winterfell", ECouleur.getCouleurByFamille("Stark"));
		Ouvrier hodor = new Ouvrier(winter,"Hodor",15.0f, 210);
		System.out.println(hodor);
		Guerrier guer1 = new Guerrier(winter,30.0f, 150);
		System.out.println(guer1);
		System.out.println(winter.getNbPersonnages());
		System.out.println(winter);
		hodor.deplacement(hodor);
		guer1.deplacement(hodor);
		winter.Alarme();
		//----------	
		Base castral = new Base("Castral Roc", ECouleur.getCouleurByFamille("Lannister"));
		Guerrier clegane = new Guerrier(castral,"Gregor Clegane",30.0f, 150);
		clegane.aLAttaque(hodor);
		//---------
		
	}
	
}
