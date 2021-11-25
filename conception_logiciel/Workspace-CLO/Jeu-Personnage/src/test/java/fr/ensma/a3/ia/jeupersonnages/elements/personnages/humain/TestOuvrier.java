package fr.ensma.a3.ia.jeupersonnages.elements.personnages.humain;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestMethodOrder;

import fr.ensma.a3.ia.jeupersonnages.map.Base;
import fr.ensma.a3.ia.jeupersonnages.map.ECouleur;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


@ExtendWith(MockitoExtension.class)
@DisplayName("Tests de la classe Ouvrier")
@TestMethodOrder(OrderAnnotation.class)
public class TestOuvrier {
	
		
	private Ouvrier ouvTest, ouvTestNom;
	
	private Base base;
	
	@BeforeEach
	public void initEach() {
		base = new Base("B",ECouleur.Bleu);
		ouvTest = new Ouvrier(base,20.0f , 150);
		ouvTestNom = new Ouvrier(base,"Hodor",20.0f , 150);
	}
	
	@Test
	@Order(1)
	public void testInstance1() {
		assertAll("Instance non conforme",
				() -> assertTrue(ouvTest.getIdent().compareTo("Ouvrier(1)") == 0),
				() -> assertTrue(ouvTestNom.getIdent().compareTo("Hodor") == 0),
				() -> assertEquals(ouvTest.getNiveauVie(), 20.0f),
				() -> assertEquals(ouvTestNom.getNiveauVie(), 20.0f),
				() -> assertEquals(ouvTest.getPuissanceTravail(), 150),
				() -> assertEquals(ouvTestNom.getPuissanceTravail(), 150),
				() -> assertThrows(NullPointerException.class, () -> {new Ouvrier(null, 20.0f, 150);}),
				() -> assertThrows(NullPointerException.class, () -> {new Ouvrier(base, null, 150);}),
				() -> assertThrows(NullPointerException.class, () -> {new Ouvrier(base, 20.0f, null);})
				);
	}
	
	@Test
	@Order(10)
	public void testEstAttaque() {
		ouvTest.estAttaque(150);
		assertEquals(17f,ouvTest.getNiveauVie());
	}

}
