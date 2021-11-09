package carnetcontacts.contacts ;

import java.util.Objects ;
import carnetcontacts.adresses.AbstractAdresse ;

public class Coordonnees {
    
    private String telPort ;
    private String telFixe ;
    private AbstractAdresse adresse ;

    public Coordonnees(final String telp, final String telf, AbstractAdresse adr) {
        
        telPort = Objects.requireNonNull(telp, "Il faut un telephone portable") ;
        telFixe = Objects.requireNonNull(telf, "Il faut un telephone fixe") ;
        adresse = Objects.requireNonNull(adr, "Soit renseigner une adresse soit ne pas mettre d'argument") ;
    }
    public Coordonnees(final String telp, final String telf) {

        telPort = Objects.requireNonNull(telp, "Il faut un telephone portable") ;
        telFixe = Objects.requireNonNull(telf, "Il faut un telephone fixe") ;
        this.adresse = null ;
    }

    public String getTelPort() {
        return telPort ;
    }

    public String getTelFixe() {
        return telFixe ;
    }


}
