package Aula14;

public class Gafanhoto extends Pessoa {

	

	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.setTotAssistido(0);
	}

	private String login;
	private int totAssistido;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	public void viuMaisUm() {

		this.setTotAssistido(getTotAssistido() + 1);
		System.out.println("Total de vídeos assistidos é de: " + this.getTotAssistido());
	}

	@Override
	public String toString() {
		return "  login= " + login + super.toString() + ", totAssistido= " + totAssistido;
	}

}
