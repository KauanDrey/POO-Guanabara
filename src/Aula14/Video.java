package Aula14;

public class Video implements AcoesVideo {

	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;

	public Video(String titulo) {
		this.titulo = titulo;
		this.setAvaliacao(0);
		this.setViews(0);
		this.setCurtidas(0);
		this.setReproduzindo(false);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public void play() {
		if (this.isReproduzindo() == false) {
			this.setReproduzindo(true);
			System.out.println("Reproduzindo v�deo...");
		}

	}

	@Override
	public void pause() {
		if (this.isReproduzindo() == true) {
			this.setReproduzindo(false);
			System.out.println("V�deo pausado");
		}

	}

	@Override
	public void like() {
		this.setCurtidas(getCurtidas() + 1);
		System.out.println("Total de curtidas do v�deo � de: " + this.getCurtidas());

	}

	@Override
	public String toString() {
		return "Video titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo;
	}

}
