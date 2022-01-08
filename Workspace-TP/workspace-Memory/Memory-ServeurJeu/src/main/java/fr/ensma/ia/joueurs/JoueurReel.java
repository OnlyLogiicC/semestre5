package fr.ensma.ia.joueurs;

public class JoueurReel extends AbstractJoueur {
	
	private String nom ;
	private String prenom ;
	private String email ;

	public JoueurReel(String pseudo, String nom, String prenom, String email) {
		super(pseudo);
		this.nom = nom ;
		this.prenom = prenom ;
		this.email = email ;
	}
	
	@Override
	public void Jouer() {
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
