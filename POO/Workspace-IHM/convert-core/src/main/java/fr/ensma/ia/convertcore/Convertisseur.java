package fr.ensma.ia.convertcore;

import fr.ensma.ia.convertcoreapi.IConvertisseur;
import fr.ensma.ia.convertcoreapi.IDevise;

public class Convertisseur implements IConvertisseur {
	
	private IDevise devDep ;
	private IDevise devArr ;
	
	private static IConvertisseur instanceUnique ;
	
	private Convertisseur() {}
	
	public static IConvertisseur getConvertisseur() {
		if (instanceUnique == null) {
			instanceUnique = new Convertisseur() ;
		}
		return instanceUnique ;
	}

	@Override
	public void setDeviseDepart(IDevise dev) {
		// TODO Auto-generated method stub
		devDep = dev ;
		
	}

	@Override
	public void setDeviseArrivee(IDevise dev) {
		// TODO Auto-generated method stub
		devArr = dev ;
		
	}

	@Override
	public Double conversion(Double val) {
		System.out.println("conversion depuis la classe fr.ensma.ia.convertcore.Convertisseur") ;
		return 0.0 ;
	}

}
