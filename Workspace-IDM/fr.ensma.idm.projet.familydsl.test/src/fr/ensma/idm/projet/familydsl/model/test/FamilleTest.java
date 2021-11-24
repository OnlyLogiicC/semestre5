package fr.ensma.idm.projet.familydsl.model.test;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Test;
import fr.ensma.idm.projet.familydsl.model.arbregen.Adresse;
import fr.ensma.idm.projet.familydsl.model.arbregen.ArbregenFactory;
import fr.ensma.idm.projet.familydsl.model.arbregen.Famille;
import fr.ensma.idm.projet.familydsl.model.arbregen.Femme;
import fr.ensma.idm.projet.familydsl.model.arbregen.Homme;

public class FamilleTest {
	
	@Test
	public void createFamilleTest() {
		Famille uneFamille = ArbregenFactory.eINSTANCE.createFamille();
		uneFamille.setId("la famille test");
		
		Homme marc = ArbregenFactory.eINSTANCE.createHomme();
		Homme claude = ArbregenFactory.eINSTANCE.createHomme();
		Femme marcelle = ArbregenFactory.eINSTANCE.createFemme();
		
		Adresse adr1 = ArbregenFactory.eINSTANCE.createAdresse();
		adr1.setNumero(44);
		adr1.setRue("larue");
		adr1.setVille("laville");
		
		marc.setAge(50);
		marc.setNom("Marc");
		marc.setPere(claude);
		marc.setMere(marcelle);
		marc.setHabitation(adr1);
		
		
		uneFamille.getMembres().add(claude);
		uneFamille.getMembres().add(marc);
		uneFamille.getMembres().add(marcelle);
		
		Assert.assertEquals(3, uneFamille.getMembres().size());
		Assert.assertEquals("la famille test", uneFamille.getId());
		
		Assert.assertEquals("Marc", marc.getNom());
		Assert.assertEquals(50, marc.getAge());
		
		Assert.assertEquals(claude, marc.getPere());		
		Assert.assertEquals(marcelle, marc.getMere());
		
		Assert.assertEquals(adr1, marc.getHabitation());
		Assert.assertEquals("larue", marc.getHabitation().getRue());
		Assert.assertEquals(44, marc.getHabitation().getNumero());
		Assert.assertEquals("laville", marc.getHabitation().getVille());
		
		ResourceSet resourceSet = new ResourceSetImpl() ;
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("arbregen", new XMIResourceFactoryImpl());
		
		final String apiSamplePath = "/home/perezm/Windows/S5/GitHub/semestre5/Workspace-IDM//runtime- FamilyDSLConfiguration"
		
	}

}
