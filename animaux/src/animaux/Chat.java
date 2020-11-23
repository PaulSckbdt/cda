package animaux;

import interfaces.*;

public class Chat extends Animaux implements Criant, Marcheur, Griffer {

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

	@Override
	public void griffe() {

		System.out.println("Le chat fait ses griffes");
	}

}
