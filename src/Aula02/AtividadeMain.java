package Aula02;

public class AtividadeMain {

	public static void main(String[] args) {

		
		CarteiraTrabalho ct1 = new CarteiraTrabalho();
		ct1.cor = "Azul";
		ct1.paginas = 120;
		ct1.tipo = "Física";
		ct1.abrir();
		ct1.escrever();
		ct1.status();
		
		
	}

}
