package fr.ensma.a3.ia.asynchrone.lock;

/**
 * Implémnentation du Mdd
 * @see IMdd
 */
public class MonMdd implements IMdd {

    private String laData;

    public MonMdd() {
        laData = "";
    }

    /**
     * Modifie la valeur de la donnée dans le Mdd.
     * Utilisation de synchronized pour assurer l'accès unique.
     */
    public synchronized void ercrireData(final String d) {
        laData = d;
    }

    /**
     * Obtient la valeur contenu dans le Mdd.
     * Utilisation de synchronized pour assurer l'accès unique.
     */
    public synchronized String lireData() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return laData;
    }
}
