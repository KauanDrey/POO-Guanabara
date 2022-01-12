package Aula14;

public class Youtube {

	public static void main(String[] args) {

		Gafanhoto g = new Gafanhoto("Kauan", 21, "Masculino", "Kdrey");
		Video v = new Video("POO");
		
		
		
		
		Visualizacao v1 = new Visualizacao(g, v);
		v1.avaliar();
		v1.avaliar(4);
		v.play();
		v.like();
		System.out.println(v1.toString());
		System.out.println("---------------------");
		Visualizacao v2 = new Visualizacao(g,v);
		v.like();
		v.pause();
		System.out.println(v2.toString());
		
		
	}

}
