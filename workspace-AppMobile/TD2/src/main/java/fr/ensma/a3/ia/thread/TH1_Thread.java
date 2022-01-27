package fr.ensma.a3.ia.thread;

import fr.ensma.a3.ia.tabNoir;

public class TH1_Thread extends Thread {
	
	private tabNoir tab ;
	
	public TH1_Thread(tabNoir t) {
		tab = t ;
	}
	
	@Override
	public void run() {
		float t = 0 ;
		while (t<30) {
			synchronized (tab) {
				tab.setS("t = " + t);
			}
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t+= 0.7 ;
		}

	}

	public tabNoir getTab() {
		return tab;
	}
	
	public void setTab(tabNoir tab) {
		this.tab = tab;
	}
}
