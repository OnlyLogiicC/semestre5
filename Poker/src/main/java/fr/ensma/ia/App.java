package fr.ensma.ia;

import fr.ensma.ia.game.carte.Carte;
import fr.ensma.ia.game.carte.Couleur;
import fr.ensma.ia.game.carte.Hauteur;
import fr.ensma.ia.game.deck.Deck;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Carte carte1 = new Carte(Couleur.Coeur, Hauteur.trois) ;
        Carte carte2 = new Carte(Couleur.Carreau, Hauteur.roi) ;
        Carte carte3 = new Carte(Couleur.Pique, Hauteur.valet) ;
        Carte carte4 = new Carte(Couleur.Trefle, Hauteur.neuf) ;
        Carte carte5 = new Carte(Couleur.Coeur, Hauteur.quatre) ;
        Carte carte6 = new Carte(Couleur.Pique, Hauteur.cinq) ;
        
        Deck D = new Deck() ;
        
        D.addcarte(carte1);
        D.addcarte(carte2);
        D.addcarte(carte3);
        D.addcarte(carte4);
        D.addcarte(carte5);
        D.addcarte(carte6);
        
        System.out.println(carte6) ;
        System.out.println(D.toString()) ;
        
        //D.triCouleur();
        //System.out.println(D.toString()) ;
        
        D.triHauteur();
        System.out.println(D.toString());
        D.melanger();
        System.out.println(D.toString());

    }
}
