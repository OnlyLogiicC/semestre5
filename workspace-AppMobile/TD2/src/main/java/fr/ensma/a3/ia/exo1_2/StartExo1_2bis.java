package fr.ensma.a3.ia.exo1_2;

public class StartExo1_2bis {

    public static void main(String[] args) {
        // Version Lock
        IMdd mdd2 = new MonMddLock();
        // version Synchronized
        IMdd mdd = new MonMdd();

        MonThreadEcrivain th1 = new MonThreadEcrivain(700, 30, "TH1-Ecrire", mdd);
        MonThreadLecteur th2 = new MonThreadLecteur(300, 20, "TH2-Lire", mdd);
        MonThreadLecteur th3 = new MonThreadLecteur(500, 20, "TH3-Lire", mdd);
        MonThreadLecteur th4 = new MonThreadLecteur(1000, 20, "TH4-Lire", mdd);

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        try {
            th2.join(10000);
            th1.join(20000);
            System.out.println("===========Prog FINI============");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
