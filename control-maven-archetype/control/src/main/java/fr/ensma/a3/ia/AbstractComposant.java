package fr.ensma.a3.ia;

public abstract class AbstractComposant {

    protected String name;
    protected Boolean simlulated;

    public AbstractComposant(String n, Boolean sim) {
        name = n;
        simlulated = sim;
    }

    public String getName() {
        return name;
    }

    public Boolean getSimlulated() {
        return simlulated;
    }

}
