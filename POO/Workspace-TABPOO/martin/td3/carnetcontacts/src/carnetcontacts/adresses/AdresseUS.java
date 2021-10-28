package carnetcontacts.adresses ;

import java.util.Objects ;

public class AdresseUS extends AbstractAdresse {

    private String zipCode ;
    private String stateCode ;

    
    public AdresseUS(final int numr, final String nomr, final String nomv, final String zipC, final String stateC) {
        super(numr,nomr,nomv,ETypAr.US) ;
        zipCode = Objects.requireNonNull(zipC,"zipCode ne peut pas etre null") ;
        stateCode = Objects.requireNonNull(stateC,"stateCode ne peut pas etre null") ;
    }

    public final String getZipCode() {
        return zipCode ;
    }

    public final String getstateCode() {
        return stateCode ;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.zipCode + "\nStateCode : " + this.stateCode + "\n" ;
    }
}