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
	
	private static ECouleur cBleu, cRouge, cVert, cJaune;
	
	@BeforeAll
	public static void initAll() {
		cBleu = ECouleur.Bleu;
		cRouge = ECouleur.Rouge;
		cVert = ECouleur.Vert;
		cJaune = ECouleur.Jaune;
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
		assertEquals(cRouge,ECouleur.getCouleurByFamille("Lannister"));
		assertEquals(cBleu,ECouleur.getCouleurByFamille("Stark"));
		assertEquals(cJaune,ECouleur.getCouleurByFamille("Baratheon"));
		assertEquals(cVert,ECouleur.getCouleurByFamille("Tyrell"));
		assertEquals(null,ECouleur.getCouleurByFamille("Richard"));
	}

	@Test
	@Order(3)
	public void testToString() {
		assertTrue(cBleu.toString().compareTo("Bleu(Stark)") == 0);
	}
	
}
