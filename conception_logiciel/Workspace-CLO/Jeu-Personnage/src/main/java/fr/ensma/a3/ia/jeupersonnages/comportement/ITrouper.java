package fr.ensma.a3.ia.jeupersonnages.comportement;
import fr.ensma.a3.ia.jeupersonnages.map.TroupeVideException;
public interface ITrouper {
	public void add_troupe(final ITroupable p);
	public void delete_troupe(final ITroupable p) throws TroupeVideException;

}
