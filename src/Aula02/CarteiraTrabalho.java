package Aula02;

public class CarteiraTrabalho {

	String cor;
	int paginas;
	String tipo; // F�sica ou digital
	boolean aberta;

	void status() {
		System.out.println("Cor da carteira de trabalho: " + this.cor);
		System.out.println("Quantidade de p�ginas: " + this.paginas);
		System.out.println("Tipo da carteira: " + this.tipo);
		System.out.println("Carteira est� aberta? " + this.aberta);
	}

	void abrir() {
		this.aberta = true;
	}

	void fechar() {
		this.aberta = false;
	}

	void escrever() {
		if (this.aberta == false) {
			System.out.println("Imposs�vel de escrever pois carteira est� fechada!!!");
		} else {
			System.out.println("Escrevendo...");
		}

	}

}
