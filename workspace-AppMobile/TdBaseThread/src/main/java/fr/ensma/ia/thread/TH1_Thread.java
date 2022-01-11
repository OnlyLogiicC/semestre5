package fr.ensma.ia.thread;

import fr.ensma.ia.tabNoir;

public class TH1_Thread extends Thread {
	
	tabNoir tab ;
	
	public TH1_Thread(tabNoir t) {
		tab = t ;
		tab.setVal(0);
	}
	
	@Override
	public void run() {
		boolean inter = false ;
		while (!isInterrupted()) {
			System.out.println(tab.getVal()) ;
			tab.setVal(tab.getVal() + 1); ;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				inter = true ;
			} finally {
				if (inter) {
					this.interrupt();
				}
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
