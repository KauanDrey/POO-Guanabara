package Praticando;

public class PagamentoMain {

	public static void main(String[] args) {
		Gerente g = new Gerente("Kauan", 21, 2500);
		g.bonificacao();
		
		
		Supervisor s = new Supervisor("Kauan", 21, 1700) ;
		s.bonificacao();
		
		
		Vendedor v = new Vendedor("Kauan", 21, 900);
		v.bonificacao();
		
	}

}
