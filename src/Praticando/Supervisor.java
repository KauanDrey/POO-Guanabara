package Praticando;

public class Supervisor extends Funcionario {

	public Supervisor(String nome, int idade, double salario) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSalario(salario);
	}

	@Override
	public void bonificacao() {

		this.setSalario(getSalario() + 5000);
		System.out.println("Sal�rio + bonifica��o do supervisor: " + this.getNome() + " � de: " + this.getSalario());
	}

}
