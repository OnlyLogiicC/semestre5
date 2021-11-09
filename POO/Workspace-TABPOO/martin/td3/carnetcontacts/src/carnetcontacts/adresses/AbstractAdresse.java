package carnetcontacts.adresses ;

import java.util.Objects ;


public abstract class AbstractAdresse {

    protected Integer numRue ;
    protected String nomRue ;
    protected String nomVille ;
    protected ETypAr typeAd ;

    public AbstractAdresse(final Integer numr, final String nomr, final String nomv, final ETypAr typad) {
        numRue = Objects.requireNonNull(numr,"numr ne peut pas etre null") ;
        nomRue = Objects.requireNonNull(nomr,"nomr ne peut pas etre null") ;
        nomVille = Objects.requireNonNull(nomv,"nomv ne peut pas etre null") ;
        typeAd = typad ;
    }

    public final Integer getNumRue() {
        return numRue ;
    }

    public final String getNomRue() {
        return nomRue ;
    }

    public final String getNomVille() {
        return nomVille ;
    }

    public final ETypAr getTypeAdr() {
        return typeAd ;
    }

    @Override
    public String toString() {
        return this.numRue + " " + this.nomRue + "\n" + this.nomVille ;
    }

}