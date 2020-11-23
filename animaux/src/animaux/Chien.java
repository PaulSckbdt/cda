package animaux;

import interfaces.Criant;
import interfaces.Marcheur;

public class Chien extends Animaux implements Criant, Marcheur {

	public Chien(String nom) {
		super(nom);
		
	}

	@Override
	public void crier() {

		System.out.println("Wouaf Wouf Wouaf");

	}

	@Override
	public void marche() {

		System.out.println("Le chien marche");
	}

	public void creuse() {

		System.out.println("Le chien creuse un trou dansle jardin");
	}

}
