package fr.ensma.a3.ia.capteurs;

public class pH extends AbstractCapteur {

    private Float value;

    public pH(String n, Boolean sim, EUnit u) {
        super(n, sim, u);
        value = 7f;
    }

    public Float getValue() {
        return value;
    }

}
