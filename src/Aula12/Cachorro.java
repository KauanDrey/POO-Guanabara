package Aula12;

public class Cachorro extends Lobo {

	public void enterrarOsso() {
		System.out.println("Enterrando Osso...");
	}

	public void abanarRabo() {
		System.out.println("Abanando o rabo..");
	}

	@Override
	public void emitirSom() {
		System.out.println("Au au au!!!");

	}

	public void reagir(String frase) {
		if (frase.equalsIgnoreCase("Toma comida") || frase.equalsIgnoreCase("Olá")) {
			System.out.println("Abanando o rabo...");
		} else {
			System.out.println("Rosnando..");
		}

	}

	public void reagir(int hora, int min) {
		if (hora < 12 && min >= 00) {
			System.out.println("Abanando");
		} else if (hora >= 18 && min >= 00) {
			System.out.println("ignorar");
		} else {
			System.out.println("Abanando e latindo");
		}

	}

	public void reagir(boolean dono) {

		if (dono == true) {
			System.out.println("Abanando o rabo");
		} else {

			System.out.println("Latindo...");
		}

	}

	public void reagir(int idade, double peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
			}
		} else {
			if (peso < 10) {
				System.out.println("Rosnar");
			} else {
				System.out.println("Ignorar");
			}
		}
	}
}