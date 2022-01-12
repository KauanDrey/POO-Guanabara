package Praticando;

public class ProjetoLivro {

	public static void main(String[] args) {

		Pessoa p[] = new Pessoa[2];
		Livro l[] = new Livro [3];
		
		p[0] = new Pessoa("Kauan", 21, "Masculino");
		p[1] = new Pessoa("Maria", 19, "Feminino");
		
		l[0] = new Livro("Fifa 21", "EA SPORTS", 200, p[0]);
		l[1] = new Livro("Battlefield 6", "EA", 150, p[0]);
		l[2] = new Livro("Java POO", "Guabs", 30, p[1]);
		

		l[0].abrir();
		l[0].folhear(201);
		l[0].avancarPag();
		l[0].detalhes();
		
	}

}
