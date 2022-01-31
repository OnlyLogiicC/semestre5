package fr.ensma.a3.ia.asynchrone.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Modélisation d'un Thread Lecteur périodique. Récupère périodiquement la
 * valeur contenue dans le Mdd.
 *
 * @see IMdd, MonMdd
 */
public class MonThreadLecteur extends Thread {

    private long maPeriode;
    private int maDuree;
    private IMdd leMdd;
    private int numIte = 0;
    
    private Semaphore semex ;

    public MonThreadLecteur(long perio, int duree, String nom, IMdd md, Semaphore sem) {
        super(nom);
        maPeriode = perio;
        maDuree = duree;
        leMdd = md;
        semex = sem ;
    }

    @Override
    public void run() {
        long reveil = System.currentTimeMillis();
        String data_temp ;
        while (System.currentTimeMillis() <= reveil + (maDuree * 1000)) {
            try {
            	semex.acquire();
            	data_temp = leMdd.lireData() ;
            	semex.release();
            	System.out.println(getName() + " s'execute a :" + System.currentTimeMillis() + " -> iteration : " + ++numIte
            			+ "; vient de lire : " + data_temp);
                sleep(maPeriode);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
