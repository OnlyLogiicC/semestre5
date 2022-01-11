package fr.ensma.ia.exII;

import java.time.LocalDateTime;

public class TH1 extends Thread {
	
	
	public TH1() {
	}
	
	@Override
	public void run() {
		int k = 0 ;
		while (k <= 60) {
			System.out.println(LocalDateTime.now()) ;
			k++ ;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
