package fr.ensma.a3.ia.td02synchrothread.aeroport;

/**
 * Modélisation d'un avion.
 *
 * @see IProd.
 * @author Mikky.
 * @version Rev-2022.
 */
public class Avion implements IProd {

    private String name;

    public Avion(final String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Avion :" + name;
    }

}
