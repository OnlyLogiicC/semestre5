package fr.ensma.ia.convertcoreapi;

public interface IConvertisseur {
	
	public void setDeviseDepart(final IDevise dev) ;
	public void setDeviseArrivee(final IDevise dev) ;
	public Double conversion(final Double val) ;

	
	
}
