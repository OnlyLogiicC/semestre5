package fr.ensma.a3.ia.thread;

import fr.ensma.a3.ia.tabNoir;

/**
 * Hello world!
 *
 */
public class App_Thread 
{
    public static void main( String[] args ) {
    	
    	tabNoir tab = new tabNoir() ;
    	TH1_Thread th1 = new TH1_Thread(tab) ;
    	TH2_Thread th2 = new TH2_Thread(tab) ;
    	
    	th1.start() ;
    	th2.start() ;
        
    }
}
