package fr.ensma.a3.ia.synchrone.balV1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class bal<T> {
	
	private int size ;
	private List<T> data ;
	
	private ReentrantLock monVerrou ;
	private Condition plein, vide ;
	
	public bal(int n) {
		size = n ;
		data = new ArrayList<T>() ;
		monVerrou = new ReentrantLock() ;
		plein = monVerrou.newCondition() ;
		vide = monVerrou.newCondition() ;
	}
	
	public void ecrireData(final T d) {
		monVerrou.lock();
		try {
			while (data.size() == size) {
				vide.await(); }
			data.add(d) ;
			System.out.println("Ajout de : " + d) ;
			plein.signalAll();
			} catch (InterruptedException e) {
				e.printStackTrace(); } finally {
			monVerrou.unlock(); }
	}
	
	public void lireData() {
		monVerrou.lock();
		try {
			while (data.size() == 0) {
				plein.await(); }
			T output = data.remove(data.size() - 1) ;
			System.out.println("Consommé : " + output);
			} catch (InterruptedException e) {}
	}

}
