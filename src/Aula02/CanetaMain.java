package Aula02;

public class CanetaMain {

	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		
		c1.cor = "Azul";
		c1.ponta = 0.5;
		c1.destampar();
		c1.modelo = "Bic";
		c1.rabiscar();
		c1.status();
		
		
		System.out.println();
		
		Caneta c2 = new Caneta();
		c2.cor = "Vermelho";
		c2.ponta = 0.10;
		c2.tampar();
		c2.modelo = "Faber Castel";
		c2.rabiscar();
		c2.status();
		
	}

}
