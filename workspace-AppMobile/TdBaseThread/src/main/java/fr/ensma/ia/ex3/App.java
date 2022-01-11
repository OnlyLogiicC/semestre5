package fr.ensma.ia.ex3;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TH1 th1 = new TH1() ;
    	TH2 th2 = new TH2() ;
    	
    	th1.start() ;
    	th2.start() ;
    	try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("Fin du Programme") ;

	}

}
