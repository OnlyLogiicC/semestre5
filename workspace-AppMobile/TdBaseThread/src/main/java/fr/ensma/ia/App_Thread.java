package fr.ensma.ia;

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
