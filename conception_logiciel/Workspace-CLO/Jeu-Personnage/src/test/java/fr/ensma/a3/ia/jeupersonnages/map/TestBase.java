package fr.ensma.a3.ia.jeupersonnages.map;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.IPersonnages;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("Tests de la classe Base")
@TestMethodOrder(OrderAnnotation.class)
public class TestBase {
	
	private static Base baseTest;
	private static final String NOM_BASE = "nomBase";
	private static final ECouleur COULEUR_BASE = ECouleur.Bleu;
	
	@Mock
	IPersonnages unPerso1, unPerso2;
	
	@BeforeAll
	public static void initAll() {
		baseTest = new Base(NOM_BASE, COULEUR_BASE);	
	}
	
	
	@Test
	@Order(1)
	public void testSimple() {
		assertAll("Etat instance non conforme",
			() -> assertTrue(baseTest.getNomBase().compareTo(NOM_BASE) == 0),
			() -> assertEquals(COULEUR_BASE, baseTest.getCoulBase()),
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
		IPersonnages pers = null;
		assertEquals(0, baseTest.getNbPersonnages());
		baseTest.ajoutPersoBase(pers);
		assertEquals(1, baseTest.getNbPersonnages());
	}
	
	@Test
	@Order(4)
	public void testSupprPersoBase() {
		IPersonnages pers = null;
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
		
		Base baseloc = new Base(NOM_BASE,COULEUR_BASE);
		baseloc.ajoutPersoBase(null);
		assertTrue(baseloc.toString().startsWith(NOM_BASE + " - "));
	}
	
	@Test
	@Order(21)
	public void testToString_Int() {
		PersoTestCallToString myPerso1 = new PersoTestCallToString("le perso1");
		PersoTestCallToString myPerso2 = new PersoTestCallToString("le perso2");
		
		Base baseloc = new Base(NOM_BASE,COULEUR_BASE);
		baseloc.ajoutPersoBase(myPerso1);
		baseloc.ajoutPersoBase(myPerso2);
		
		assertEquals(NOM_BASE + " - " + COULEUR_BASE +"\n"
				+ "-----------------\n" +
				"le perso1\n" + "le perso2\n"
				+ "-----------------\n",baseloc.toString());
		assertEquals(1, myPerso1.getNbCall());
		assertEquals(1, myPerso2.getNbCall());
	}
	
	@Test
	@Order(25)
	public void testAlarme() {
		
		Base baseloc = new Base(NOM_BASE,COULEUR_BASE);
		assertTrue(baseloc.getNbPersonnages()==0);
		baseloc.Alarme();
		verify(unPerso1, never()).alarme();
		verify(unPerso2, never()).alarme();
		
		InOrder inOrder = Mockito.inOrder(unPerso1,unPerso2);
		
		baseloc.ajoutPersoBase(unPerso1);
		baseloc.ajoutPersoBase(unPerso2);
		baseloc.Alarme();		
		inOrder.verify(unPerso1, times(1)).alarme();
		inOrder.verify(unPerso2, times(1)).alarme();
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
		baseloc = new Base(NOM_BASE,ECouleur.Jaune);
		assertFalse(baseTest.equals(baseloc));
		baseloc = new Base(NOM_BASE,COULEUR_BASE);
		baseloc.ajoutPersoBase(null);
		assertFalse(baseTest.equals(baseloc));
	}
	
	@Test
	@Order(31)
	public void testHashCode() {
		Base baseloc = new Base(NOM_BASE,COULEUR_BASE);
		assertTrue(baseTest.equals(baseloc) );
		assertEquals(baseTest.hashCode(),baseloc.hashCode());
		baseloc = new Base(NOM_BASE + "!!",COULEUR_BASE);
		assertFalse(baseTest.equals(baseloc));
		assertNotEquals(baseTest.hashCode(), baseloc.hashCode());
		baseloc = new Base(NOM_BASE,ECouleur.Jaune);
		assertFalse(baseTest.equals(baseloc));
		assertNotEquals(baseTest.hashCode(), baseloc.hashCode());
		baseloc = new Base(NOM_BASE,COULEUR_BASE);
		baseloc.ajoutPersoBase(null);
		assertFalse(baseTest.equals(baseloc));
		assertNotEquals(baseTest.hashCode(), baseloc.hashCode());		
	}
	
	private class PersoTestCallToString implements IPersonnages {

		private int nbCall = 0;
		private String retMessage;
		
		public PersoTestCallToString(final String retmess) {
			retMessage = retmess;
		}
		
		@Override
		public String getIdent() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void alarme() {
			// TODO Auto-generated method stub
		}
		
		@Override
		public String toString() {
			nbCall ++;
			return retMessage;
		}
		
		public int getNbCall() {
			return nbCall;
		}
	}
}





