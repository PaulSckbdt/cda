package animaux;

import interfaces.Nageur;

public class Sardine extends Animaux implements Nageur {

	public Sardine(String nom) {
		super(nom);
	
	}

	public void nage() {

		System.out.println("Le poison nage");

	}

	public void rien() {

		System.out.println("Le poison ne fait rien");

	}

}
