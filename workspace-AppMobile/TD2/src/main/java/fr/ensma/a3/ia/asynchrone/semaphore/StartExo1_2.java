package fr.ensma.a3.ia.asynchrone.semaphore;

import java.util.concurrent.Semaphore;

public class StartExo1_2 {

	public static void main(String[] args) {
		
		IMdd mdd = new MonMdd();
		Semaphore sem = new Semaphore(3) ;
			
		
		MonThreadEcrivain th1 = new MonThreadEcrivain(1700, 30, "TH1-Ecrire", mdd,sem);
		MonThreadLecteur th2 = new MonThreadLecteur(300, 20, "TH2-Lire", mdd,sem);
		MonThreadLecteur th3 = new MonThreadLecteur(300, 20, "TH3-Lire", mdd,sem);
		MonThreadLecteur th4 = new MonThreadLecteur(300, 20, "TH4-Lire", mdd,sem);

		
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
