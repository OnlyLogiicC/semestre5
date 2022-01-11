package fr.ensma.ia.exII;

import java.time.LocalDateTime;

public class TH2 extends Thread {
	
	public TH2() {
	}
	
	@Override
	public void run() {
		int k = 0 ;
		while (k <= 20) {
			System.out.println(LocalDateTime.now()) ;
			k++ ;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
