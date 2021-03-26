package Aula02;

public class CarteiraTrabalho {

	String cor;
	int paginas;
	String tipo; // Física ou digital
	boolean aberta;

	void status() {
		System.out.println("Cor da carteira de trabalho: " + this.cor);
		System.out.println("Quantidade de páginas: " + this.paginas);
		System.out.println("Tipo da carteira: " + this.tipo);
		System.out.println("Carteira está aberta? " + this.aberta);
	}

	void abrir() {
		this.aberta = true;
	}

	void fechar() {
		this.aberta = false;
	}

	void escrever() {
		if (this.aberta == false) {
			System.out.println("Impossível de escrever pois carteira está fechada!!!");
		} else {
			System.out.println("Escrevendo...");
		}

	}

}
