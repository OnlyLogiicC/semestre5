package fr.ensma.a3.ia.jeupersonnages.map;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.IPersonnage;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayName("Tests de la classe Base")
@TestMethodOrder(OrderAnnotation.class)
public class TestBase {
	
	private static Base baseTest;
	private static final String NOM_BASE = "nomBase";
	private static final ECouleurBase COULEUR_BASE = ECouleurBase.Bleu;
	
	@BeforeAll
	public static void initAll() {
		baseTest = new Base(NOM_BASE, COULEUR_BASE);	
	}
	
	@Test
	@Order(1)
	public void testSimple() {
		assertAll("Etat instance non conforme",
			() -> assertTrue(baseTest.getnomBase().compareTo(NOM_BASE) == 0),
			() -> assertEquals(COULEUR_BASE, baseTest.getcouleurBase()),
			() -> assertEquals(0,baseTest.getNbPersonnages())
				);
	}
	@Test
	@Order(2)
	public void testSimple2() {
		assertAll(
			() -> assertThrows(NullPointerException.class, () -> {new Base(null, COULEUR_BASE);}),
			() -> assertThrows(NullPointerException.class, () -> {new Base(NOM_BASE, null);}),
			() -> assertThrows(NullPointerException.class, () -> {new Base(null, null);})
				);
	}

	@Test
	@Order(3)
	public void testAjouterPersoBase() {
		IPersonnage pers = null;
		assertEquals(0, baseTest.getNbPersonnages());
		baseTest.ajoutPersoBase(pers);
		assertEquals(1, baseTest.getNbPersonnages());
	}
	
	@Test
	@Order(4)
	public void testSupprPersoBase() {
		IPersonnage pers = null;
		baseTest.ajoutPersoBase(pers);
		assertEquals(2, baseTest.getNbPersonnages());
		try {
			boolean res = baseTest.supprPersoBase(pers);
			assertEquals(1, baseTest.getNbPersonnages());
			assertTrue(res);
			res = baseTest.supprPersoBase(pers);
			assertEquals(0, baseTest.getNbPersonnages());
			assertTrue(res);
			assertThrows(BaseVideException.class, () -> baseTest.supprPersoBase(pers));
		} catch (BaseVideException e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	@Order(20)
	public void testToString() {
		//Attention test incomplet
		assertTrue(baseTest.toString().startsWith(NOM_BASE + " - "));
		// A completer par test integration
	}
	
	@Test
	@Order(30)
	public void testEquals() {
		Base baseloc = new Base(NOM_BASE,COULEUR_BASE);
		assertFalse(baseTest.equals(null));
		Integer val = 2;
		assertFalse(baseTest.equals((Object)val));
		assertTrue(baseTest.equals(baseTest));
		assertTrue(baseTest.equals(baseloc) );
		baseloc = new Base(NOM_BASE + "!!",COULEUR_BASE);
		assertFalse(baseTest.equals(baseloc));
		baseloc = new Base(NOM_BASE,ECouleurBase.Jaune);
		assertFalse(baseTest.equals(baseloc));
		baseloc = new Base(NOM_BASE,COULEUR_BASE);
		baseloc.ajoutPersoBase(null);
		assertFalse(baseTest.equals(baseloc));
		
	}	
}
