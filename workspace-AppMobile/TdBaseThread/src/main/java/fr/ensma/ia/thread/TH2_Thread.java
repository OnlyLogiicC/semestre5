package fr.ensma.ia.thread;

import fr.ensma.ia.tabNoir;

public class TH2_Thread extends Thread {
	
	tabNoir tab ;
	Thread Thrd ;
	
	public TH2_Thread(tabNoir t, Thread thr) {
		tab = t ;
		Thrd = thr ;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(tab.getVal() * 10) ;
			if (tab.getVal() * 10 >= 500) {
				Thrd.interrupt();
			}
			try {
				Thread.sleep(200);
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