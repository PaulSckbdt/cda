package animaux;

import interfaces.*;

public class Chien extends Animaux implements Criant, Marcheur, Creuser {

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

	@Override
	public void creuse() {

		System.out.println("Le chien creuse un trou dansle jardin");
	}

}
