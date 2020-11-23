package animaux;

public abstract class Animaux {
	private final String nom;

	public Animaux(String nom) {
		this.nom = nom;
	}

	public void respire() {
		System.out.println("respire " + this.nom);
	}

}
