package carnetcontacts;

import carnetcontacts.monpack.MaClasse;
import carnetcontacts.adresses.AdresseEU;


public class App {
    public static void main(String args[]) {
        System.out.println("Salut les Cocos !!");
        MaClasse cl = new MaClasse("Salut les Cocos depuis la classe !!!");
        System.out.println(cl.getLaChaine());
        AdresseEU adr_eu = new AdresseEU(1, "route Royale", "Winterfell", "44 444");
        System.out.println(adr_eu.getNomVille());
        AdresseEU adr_eu2 = adr_eu;
        System.out.println(adr_eu2.getNomVille());
        adr_eu2.setNomVille("Castral Roc");
        System.out.println(adr_eu.getNomVille());
        adr_eu2.setNomVille("Winterfell");
        AdresseEU adr_eu3 = new AdresseEU(1, "route Royale", "Winterfell", "44 444");
        System.out.println(adr_eu3.equals(adr_eu));
        System.out.println(adr_eu3.getNumRue() == (adr_eu.getNumRue()));
        System.out.println(adr_eu3.getNomRue()== (adr_eu.getNomRue()));
        System.out.println(adr_eu3.getNomVille() == (adr_eu.getNomVille()));
        System.out.println(adr_eu3.getCodePostal() == (adr_eu.getCodePostal()));
        System.out.println(adr_eu3.getTypAdr() == (adr_eu.getTypAdr()));
        System.out.println(adr_eu3);
    }
}