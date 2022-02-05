package fr.ensma.a3.ia.exoII_1;
/**
 * Implémentation d'un Message respectant l'interface IBalMessage.
 *
 * @see IBalMessage
 */
public class Message implements IBalMessage {

    private String leMess;
    private static int numInstance;

    public Message(final String m) {
        numInstance++;
        leMess = m + " - " + numInstance;
    }

    public String getValMess() {
        return leMess;
    }

    public void setValMess(final String m) {
        leMess = m;
    }

    @Override
    public String toString() {
        return "Corps du Message : " + leMess;
    }
}
