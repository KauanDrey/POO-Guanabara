package Aula02;

public class Caneta {
	
	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Estou tampada. Impossível de rabiscar!!!");
		} else {
			System.out.println("Rabiscando...");
		}
	}
	
	
	void tampar() {
		this.tampada = true;	
		
	}
	
	void destampar() {
		this.tampada = false;
	}
	
	void status() {
	System.out.println("Modelo da caneta: " + this.modelo);
	System.out.println("Uma caneta " + this.cor);
	System.out.println("Ponta da caneta: " + this.ponta);
	System.out.println("Carga da caneta: " + this.carga);
	System.out.println("Está tampada? " + this.tampada);
	
		
	}

}
