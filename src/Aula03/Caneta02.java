package Aula03;

public class Caneta02 {

	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	private boolean tampada;

	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Estou tampada. Impossível de rabiscar!!!");
		} else {
			System.out.println("Rabiscando...");
		}
	}

	public void tampar() {
		this.tampada = true;

	}

	public void destampar() {
		this.tampada = false;
	}

	public void status() {
		System.out.println("Modelo da caneta: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta da caneta: " + this.ponta);
		System.out.println("Carga da caneta: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);

	}

}
