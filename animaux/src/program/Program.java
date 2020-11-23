package program;

import animaux.*;
import interfaces.*;

public class Program {

	public static void main(String[] args) {

		Animaux[] animaux = { new Chien("Bandit"), new Chien("Neiko"), new Chat("Globule"), new Chat("Hermione"),
				new Sardine("sarsar"), new Sardine("dinedine") };

		for (Animaux ani : animaux) {

			ani.respire();

			if (ani instanceof Chien) {
				Chien chien = (Chien) ani;
				chien.creuse();
				chien.crier();

			}
			if (ani instanceof Chat) {
				Chat chat = (Chat) ani;
				chat.crier();
				chat.griffe();

			}
			if (ani instanceof Sardine) {
				Sardine sard = (Sardine) ani;
				sard.muet();
				sard.nage();
				sard.rien();
			}
			if (ani instanceof Marcheur) {
				Marcheur march = (Marcheur) ani;

				march.marche();

			}

		}

	}

}
