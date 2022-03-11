package Module;

public class Etudiant {
	
	private int cin;
	private String nom,prenom;
	private float moy;
	private String classe;
	
	
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
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
	public float getMoy() {
		return moy;
	}
	public void setMoy(float moy) {
		this.moy = moy;
	}
	public Etudiant(int cin, String nom, String prenom,String c, float moy) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.moy = moy;
		this.classe = c;
	}
	
	
	
	
	

}
