package Aula12;

public class Ave extends Animal {

	private String corPena;

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
		System.out.println("Cor da pena: " + this.getCorPena());
	}

	@Override
	public void locomover() {
		System.out.println("Voando...");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave...");
	}

	public void fazerNinho() {
		System.out.println("Ninho feito...");
	}

}
