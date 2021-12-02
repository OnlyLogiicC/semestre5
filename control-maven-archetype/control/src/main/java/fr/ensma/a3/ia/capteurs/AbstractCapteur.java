package fr.ensma.a3.ia.capteurs;

import fr.ensma.a3.ia.AbstractComposant;
import fr.ensma.a3.ia.types.IControl;

public abstract class AbstractCapteur extends AbstractComposant {

    protected EUnit unit;
    protected IControl typeCapteur;

    public AbstractCapteur(String n, Boolean sim, EUnit u) {
        super(n, sim);
        unit = u;
    }

}
