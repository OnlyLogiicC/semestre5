package carnetcontacts.contacts ;

import java.util.Objects ;

public abstract class AbstractContact {
    protected String nomContact ;
    protected Coordonnees coord ;
    protected ECategorie cat ;

    public AbstractContact(final String nom, final Coordonnees coord, final ECategorie cat) {
        this.nomContact = Objects.requireNonNull(nom, "Il faut un nom de contact") ;
        this.coord = Objects.requireNonNull(coord, "Il faut des coordonnees") ;
        this.cat = cat ;
    }

    public AbstractContact(final String nom, final Coordonnees coord) {
        this.nomContact = Objects.requireNonNull(nom, "Il faut un nom de contact") ;
        this.coord = Objects.requireNonNull(coord, "Il faut des coordonnees") ;
        this.cat = null ;
    }

    public final String getNomContact() {
        return this.nomContact ;
    }


}