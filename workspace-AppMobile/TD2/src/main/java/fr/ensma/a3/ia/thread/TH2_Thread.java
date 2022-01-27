package fr.ensma.a3.ia.thread;

import fr.ensma.a3.ia.tabNoir;

public class TH2_Thread extends Thread {
	
	tabNoir tab ;
	
	public TH2_Thread(tabNoir t) {
		tab = t ;
	}
	
	@Override
	public void run() {
		float t = 0 ;
		while (t < 30) {
			synchronized (tab) {
				System.out.println(tab.getS()) ;
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t+= 0.3 ;
		}

	}

	public tabNoir getTab() {
		return tab;
	}

	public void setTab(tabNoir tab) {
		this.tab = tab;
	}
}