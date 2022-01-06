package fr.ensma.ia;

public class TH1_runnable implements Runnable {
	
	private tabNoir tab ;
	
	public TH1_runnable(tabNoir t) {
		tab = t ;
		tab.setVal(0) ;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println(tab.getVal()) ;
			tab.setVal(tab.getVal() + 1); ;
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
