package fr.ensma.a3.ia;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class tabNoir {
	
	private final Lock leVerrou = new ReentrantLock() ;
	private String s ;
	
	public tabNoir() {
		s = "" ;
	}
	
	public String getS() {
		return s ;
	}
	
	public void setS(String i) {
		leVerrou.lock();
		s = i ;			
		leVerrou.unlock();
		
	}

}
