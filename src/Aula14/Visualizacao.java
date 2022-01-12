package Aula14;

public class Visualizacao {

	private Gafanhoto espectador;
	private Video filme;

	public Visualizacao(Gafanhoto espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.getEspectador().setTotAssistido(this.getEspectador().getTotAssistido() + 1);
		this.getFilme().setViews(this.getFilme().getViews() + 1);
	}

	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "espectador: " + espectador + ", filme=" + filme;
	}

	public void avaliar() {
		this.getFilme().setAvaliacao(this.getFilme().getAvaliacao() + 5);
	}

	public void avaliar(int nota) {
		this.getFilme().setAvaliacao(this.getFilme().getAvaliacao() + nota);

	}

}
