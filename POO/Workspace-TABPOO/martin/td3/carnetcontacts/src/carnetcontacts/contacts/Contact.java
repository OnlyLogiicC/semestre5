package carnetcontacts.contacts ;

import java.util.Objects ;

public class Contact extends AbstractContact {

    private String prenomContact ;
    private String dateNaiss ;

    public Contact(final String nomc, final Coordonnees coord, final String prenomc, final String daten) {
        super(nomc,coord) ;
        this.prenomContact = Objects.requireNonNull(prenomc, "Il faut un prenom") ;
        this.dateNaiss = Objects.requireNonNull(daten, "Si null, ne pas mettre en argument") ;
    }

    public Contact(final String nomc, final Coordonnees coord, final String prenomc) {
        super(nomc,coord) ;
        this.prenomContact = Objects.requireNonNull(prenomc, "Il faut un prenom") ;
        this.dateNaiss = null ;
    }

    public String getPrenomContact() {
        return this.prenomContact ;
    }

    public String getDateNaiss() {
        return this.dateNaiss ;
    }

    public Integer getageContact() {
        return 42 ;
    }
}
