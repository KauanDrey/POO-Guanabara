package Praticando;

public class Gerente extends Funcionario {

	public Gerente(String nome, int idade, double salario) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSalario(salario);
	}

	@Override
	public void bonificacao() {
		this.setSalario(getSalario() + 10000);
		System.out.println("Seu salário do Gerente: " + this.getNome() + " com bonificação é de: " + this.getSalario());
	}

}
