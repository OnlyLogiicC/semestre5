package carnetcontacts.contacts ;

import java.util.Objects ;

public class ContactEntr extends AbstractContact {

    private Integer numSiret ;

    public ContactEntr(final String nomc, final Coordonnees coord, final Integer numsir, final ECategorie cat) {
        super(nomc,coord,cat) ;
        this.numSiret = Objects.requireNonNull(numsir, "Si null, ne pas mettre en argument") ;

    }

    public ContactEntr(final String nomc, final Coordonnees coord, final ECategorie cat) {
        super(nomc,coord,cat) ;
        this.numSiret = null ;
    }
    
    public Integer getNumSiret() {
        return this.numSiret ;
    }

    public ECategorie getCatEntr() {
        return this.cat ;
    }
}