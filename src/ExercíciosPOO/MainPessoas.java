package ExercíciosPOO;

import java.util.ArrayList;
import java.util.List;

public class MainPessoas {

	public static void main(String[] args) {

		List<Pessoa> lista = new ArrayList<>();
		Pessoa p = new Pessoa("João", 15);
		Pessoa jessica = new Pessoa("Jessica", 18);
		lista.add(p);
		lista.add(new Pessoa("Leandro", 21));
		lista.add(new Pessoa("Paulo", 17));
		lista.add(jessica);

		for (Pessoa peoples : lista) {
			System.out.println("\nPessoa: " + peoples.getNome() + "  \nIdade: " + peoples.getIdade());
		}

		System.out.println();
		System.out.println("=========== EXERCÍCIO 5 ============");
		System.out.println();

		for (Pessoa plps : lista) {
			System.out.println("Lista antes da exclusão: " + plps.getNome());
		}

		System.out.println("---------------------------------------------------");

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getIdade() < 18) {
				lista.remove(i);
			}

			System.out.println("Depois da exclusão: " + lista.get(i).getNome());
		}

		System.out.println();
		System.out.println("============ EXERCÍCIO 6 =============");
		System.out.println();

		if (lista.contains(jessica) == true) {
			System.out.println("Objeto existe e sua idade é de: " + jessica.getIdade());
		}

	}

}
