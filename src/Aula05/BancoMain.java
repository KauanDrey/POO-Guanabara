package Aula05;

public class BancoMain {

	public static void main(String[] args) {

		ContaBanco c1 = new ContaBanco();
		
		c1.abrirConta("CP");
		c1.setDono("Kauan Drey");
		c1.setNumConta(1234);
		c1.depositar(1000);
		c1.sacar(1150);
		c1.fecharConta();
		c1.estadoAtualDaConta();
		
	}

}
