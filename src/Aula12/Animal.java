package Aula12;

public abstract class Animal {

	private double peso;
	private int idade;
	private double membros;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getMembros() {
		return membros;
	}

	public void setMembros(double membros) {
		this.membros = membros;
	}

	public abstract void locomover();

	public abstract void alimentar();

	public abstract void emitirSom();
}