package fr.ensma.a3.ia.jeupersonnages.map;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@DisplayName("Tests de l'enum ECouleur")
@TestMethodOrder(OrderAnnotation.class)
public class TestECouleur {
	
	private static ECouleurBase cBleu, cRouge, cVert, cJaune;
	
	@BeforeAll
	public static void initAll() {
		cBleu = ECouleurBase.Bleu;
		cRouge = ECouleurBase.Rouge;
		cVert = ECouleurBase.Vert;
		cJaune = ECouleurBase.Jaune;
	}
	
	@Test
	@Order(1)
	public void testCouleurFamille() {
		assertAll("Enumération non conforme",
				() -> assertEquals("Lannister", cRouge.getNom()),
				() -> assertEquals("Stark", cBleu.getNom()),
				() -> assertEquals("Tyrell", cVert.getNom()),
				() -> assertEquals("Baratheon", cJaune.getNom())				
				);	
	}
	
	@Test
	@Order(2)
	public void testFamilleCouleur() {
		assertEquals(cRouge,ECouleurBase.getCouleurByFamille("Lannister"));
		assertEquals(cBleu,ECouleurBase.getCouleurByFamille("Stark"));
		assertEquals(cJaune,ECouleurBase.getCouleurByFamille("Baratheon"));
		assertEquals(cVert,ECouleurBase.getCouleurByFamille("Tyrell"));
		assertEquals(null,ECouleurBase.getCouleurByFamille("Richard"));
	}

	@Test
	@Order(3)
	public void testToString() {
		assertTrue(cBleu.toString().compareTo("Bleu(Stark)") == 0);
	}
	
}
