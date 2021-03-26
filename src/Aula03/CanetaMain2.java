package Aula03;

public class CanetaMain2 {

	public static void main(String[] args) {

		Caneta02 c2 = new Caneta02();
		c2.modelo = "BIG CRISTAL";
		c2.cor = "Azul";
		// c2.ponta(0.5);
		c2.carga = 80;
		// c2.tampada = true;
		c2.tampar();
		c2.status();
		c2.rabiscar();

	}

}
