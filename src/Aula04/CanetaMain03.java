package Aula04;

public class CanetaMain03 {

	public static void main(String[] args) {

		Caneta03 c3 = new Caneta03();
		c3.setModelo("BIC");
		c3.setPonta(0.5);
		c3.status();

		System.out.println("\nPossuo uma caneta da marca: " + c3.getModelo() + " \ncom a ponta: " + c3.getPonta()
				+ " \nda cor: " + c3.getCor() + " \nestá tampada: " + c3.isTampada());

	}

}
