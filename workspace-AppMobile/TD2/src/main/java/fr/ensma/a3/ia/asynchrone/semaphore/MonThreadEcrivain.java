package fr.ensma.a3.ia.asynchrone.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Modélisation d'un Thread Ecrivain périodique. Dépose une valeur dans le Mdd.
 *
 * @see IMdd, MonMdd
 */
public class MonThreadEcrivain extends Thread {

    private long maPeriode;
    private int maDuree;
    private IMdd leMdd;
    private int numIte = 0;
    
    private Semaphore semex ;

    public MonThreadEcrivain(long perio, int duree, String nom, IMdd md, Semaphore sem) {
        super(nom);
        maPeriode = perio;
        maDuree = duree;
        leMdd = md;
        
        semex = sem ;
    }

    @Override
    public void run() {
        long reveil = System.currentTimeMillis();
        while (System.currentTimeMillis() <= reveil + (maDuree * 1000)) {
            System.out.println(getName() + " s'execute a :" + System.currentTimeMillis());
            try {
            	semex.acquire(3);
            	leMdd.ercrireData("nomThread - " + ++numIte);
            	semex.release(3);
                sleep(maPeriode);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
