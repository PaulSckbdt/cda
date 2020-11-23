package animaux;

import interfaces.*;

public class Sardine extends Animaux implements Muet, Nageur, Rien {

	public Sardine(String nom) {
		super(nom);
	
	}

	@Override
	public void muet() {
		System.out.println("Blop Blop Blop");

	}

	public void nage() {

		System.out.println("Le poison nage");

	}

	public void rien() {

		System.out.println("Le poison ne fait rien");

	}

}
