package Aula11;

public class Tecnico extends Aluno {

	private String registroProfissional;

	public String getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

	public void praticar() {
		System.out.println("Praticando...");

	}

	@Override
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do técnico: " + this.getNome());
	}

}
