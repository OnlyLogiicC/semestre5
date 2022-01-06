package fr.ensma.ia;

/**
 * Hello world!
 *
 */
public class App_runnable 
{
    public static void main( String[] args ) {
    	
    	tabNoir tab = new tabNoir() ;
    	TH1_runnable th1 = new TH1_runnable(tab) ;
    	TH2_runnable th2 = new TH2_runnable(tab) ;
    	
    	Thread thr1 = new Thread(th1) ;
    	Thread thr2 = new Thread(th2) ;
    	
    	thr1.start() ;
    	thr2.start() ;
        
    }
}
