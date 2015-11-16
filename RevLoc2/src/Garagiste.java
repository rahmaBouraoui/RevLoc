
public class Garagiste {
	
	private String nom ;
	private String adresse ;
	
	public Garagiste(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Garagiste [nom=" + nom + ", adresse=" + adresse + "]";
	}
	
	
	
}
