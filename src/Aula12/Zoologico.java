package Aula12;

public class Zoologico {

	public static void main(String[] args) {
		
		Arara a = new Arara();
		a.setCorPena("Azul");
		a.alimentar();
		a.locomover();
		a.setPeso(1.4);
		System.out.println("Peso da Arara: " + a.getPeso());
		a.setIdade(3);
		System.out.println("Idade da Arara: " + a.getIdade());
		a.fazerNinho();
		System.out.println();
		System.out.println();
		
		
		Cachorro c = new Cachorro();
		
	//	c.emitirSom();
	//	c.reagir("Toma comida");
	//	c.reagir("Vai apanhar");
	//	c.reagir(true);
		c.reagir(2, 12.5);
		c.reagir(17, 4.5);
	}
}
