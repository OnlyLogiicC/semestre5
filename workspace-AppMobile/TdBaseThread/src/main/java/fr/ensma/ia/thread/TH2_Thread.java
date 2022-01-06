package fr.ensma.ia.thread;

import fr.ensma.ia.tabNoir;

public class TH2_Thread extends Thread {
	
	tabNoir tab ;
	
	public TH2_Thread(tabNoir t) {
		tab = t ;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(tab.getVal() * 10) ;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public tabNoir getTab() {
		return tab;
	}

	public void setTab(tabNoir tab) {
		this.tab = tab;
	}
}