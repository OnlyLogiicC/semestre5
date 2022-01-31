package fr.ensma.a3.ia.asynchrone.synchronize;

/**
 * Modélisation d'un Thread Lecteur périodique.
 * Récupère périodiquement la valeur contenue dans le Mdd.
 * @see IMdd, MonMdd
 */
public class MonThreadLecteur extends Thread {

    private long maPeriode;
    private int maDuree;
    private IMdd leMdd;
    private int numIte = 0;

    public MonThreadLecteur (final long perio, final int duree, final String nom, final IMdd md) {
        super(nom);
        maPeriode = perio;
        maDuree = duree;
        leMdd = md;
    }

    @Override
    public void run() {
        long reveil = System.currentTimeMillis();
        while (System.currentTimeMillis() <= reveil + (maDuree * 1000)) {
            System.out.println(getName() + " s'execute a :" + System.currentTimeMillis() + " -> iteration : " + ++numIte   // ++ préfixe donc d'abord incrément et ensuite affichage
                    + "; vient de lire : " + leMdd.lireData());

            try {
                sleep(maPeriode);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
