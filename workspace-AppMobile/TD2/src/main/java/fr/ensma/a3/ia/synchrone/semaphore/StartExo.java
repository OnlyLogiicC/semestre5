package fr.ensma.a3.ia.synchrone.semaphore;

import java.util.concurrent.Semaphore;

public class StartExo {

    public static void main(String[] args) {
        // Sémaphore de synchro initialisé à 0
        Semaphore sem = new Semaphore(0);

        ThreadSync ths = new ThreadSync(sem);
        ThreadPerio thp = new ThreadPerio(sem);
        thp.start();
        ths.start();
    }

}
