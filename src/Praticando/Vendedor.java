package Praticando;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, int idade, double salario) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSalario(salario);

	}

	@Override
	public void bonificacao() {
		this.setSalario(getSalario() + 3000);
		System.out.println("Salário + bonificação do vendedor " + this.getNome() + " é de: " + this.getSalario());

	}

}
