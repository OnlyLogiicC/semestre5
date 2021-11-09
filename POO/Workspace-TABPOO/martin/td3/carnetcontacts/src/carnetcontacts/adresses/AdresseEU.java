package carnetcontacts.adresses ;

import java.util.Objects ;


public class AdresseEU extends AbstractAdresse {

    private String codePostal ;

    
    public AdresseEU(final int numr, final String nomr, final String nomv, final String codep) {
        super(numr,nomr,nomv,ETypAr.Eur) ;
        codePostal = Objects.requireNonNull(codep,"codepostal ne peut pas etre null") ;
    }

    public final String getCodePostal() {
        return codePostal ;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.codePostal + "\n" ;
    }
}