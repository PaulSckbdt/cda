package animaux;

import interfaces.Criant;
import interfaces.Marcheur;

public class Chat extends Animaux implements Criant, Marcheur {

	public Chat(String nom) {
		super(nom);
	
	}

	@Override
	public void crier() {

		System.out.println("Miaou Miaou Miaou");

	}

	@Override
	public void marche() {

		System.out.println("Le chat marche");
	}

	public void griffe() {

		System.out.println("Le chat fait ses griffes");
	}

}
