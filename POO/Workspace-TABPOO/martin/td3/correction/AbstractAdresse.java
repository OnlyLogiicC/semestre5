package carnetcontacts.adresses;

import java.util.Objects;

public abstract class AbstractAdresse {

    protected Integer numRue;
    protected String nomRue;
    protected String nomVille;
    protected ETypAdr typAdr;

    public AbstractAdresse(final Integer numr, final String nomr,
        final String nomv, final ETypAdr typad){
        numRue = Objects.requireNonNull(numr,"numr ne peut etre null");
        nomRue = Objects.requireNonNull(nomr,"nomr ne peut etre null");
        nomVille = Objects.requireNonNull(nomv,"nomv ne peut etre null");
        typAdr = typad;
    }

    public final Integer getNumRue(){
        return numRue;
    }
    public final String getNomRue(){
        return nomRue;
    }
    public final String getNomVille(){
        return nomVille;
    }
    public final ETypAdr getTypAdr(){
        return typAdr;
    }

    public final void setNomVille(final String nomv){
        nomVille = nomv;
    }

    @Override
    public String toString() {
        return numRue + " " + nomRue + "\n" + nomVille;
    }

}