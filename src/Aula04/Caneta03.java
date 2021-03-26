package Aula04;

public class Caneta03 {

	public String modelo;
	private double ponta;
	private boolean tampada;
	private String cor;

	Caneta03() { // Método construtor
		this.tampar();
		this.setCor("Azul");
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public void status() {
		System.out.println("SOBRE A CANETA: \n");
		System.out.println("MODELO: " + this.getModelo());
		System.out.println("PONTA: " + this.getPonta());
		System.out.println("COR DA CANETA: " + this.getCor());
		System.out.println("ESTÁ TAMPADA: " + this.isTampada());
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

}
