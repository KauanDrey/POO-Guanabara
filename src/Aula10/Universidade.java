package Aula10;

public class Universidade {

	public static void main(String[] args) {

		Aluno a = new Aluno();
		a.setNome("Kauan");
		a.setIdade(21);
		a.fazerAniver();
		a.setSexo("Masculino");
		// System.out.println("Nome: " + a.getNome() + " Idade: " + a.getIdade() + "
		// Sexo: " + a.getSexo());
		// a.cancelarMatric();

		Funcionario f = new Funcionario();
		f.setNome("Kauan");
		f.setIdade(21);
		f.fazerAniver();
		f.setSexo("Masculino");
		f.setSetor("Administrativo");
		f.mudarTrabalho("Desenvolvedor");
		// System.out.println("Nome: " + f.getNome() + "\nIdade: " + f.getIdade() +
		// "\nSexo: " + f.getSexo() + "\nSetor: " + f.getSetor());

		Professor p = new Professor();
		p.setNome("Kauan");
		p.setIdade(21);
		p.fazerAniver();
		p.setSexo("Masculino");
		p.setSalario(2350);
		p.setEspecialidade("Inglês");
		p.receberAumento(1000);
	//	System.out.println("Nome: " + p.getNome() + "\nIdade: " + p.getIdade() + "\nSexo: " + p.getSexo()
	//			+ "\nEspecialidade: " + p.getEspecialidade() + "\nSalário: " + p.getSalario());
		
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Kauan");
		p1.setIdade(20);
		p1.setSexo("Masculino");
		p1.fazerAniver();
		System.out.println("Nome: " + p1.getNome() + "\nIdade: " + p1.getIdade() + "\nSexo: " + p1.getSexo());
	}

}
