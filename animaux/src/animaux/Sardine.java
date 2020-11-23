package animaux;

import interfaces.Nageur;

public class Sardine extends Animaux implements Nageur {

	public Sardine(String pNom) {
		super(pNom);
	}

	public void nage() {
		System.out.println("Le poison nage");
	}

	public void rien() {
		System.out.println("Le poison ne fait rien");
	}

}
