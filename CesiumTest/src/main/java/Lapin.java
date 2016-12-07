
public class Lapin {
	
	private int age;
	private String couleur;
	private String nom;
	
	public Lapin(String nom, String couleur, int age) {
		this.age = age;
		this.couleur = couleur;
		this.nom = nom;
	}
	
	public void afficher(){
		System.out.println("Nom du lapin: " + this.getNom() + "\nAge: " + this.getAge() + "\nCouleur: " + this.getCouleur());
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
