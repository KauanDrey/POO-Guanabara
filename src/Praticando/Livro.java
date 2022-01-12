package Praticando;

public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.aberto = false;
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	public void detalhes() {
		System.out.println("--------- DETALHES ------------");
		System.out.println("Título: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de páginas: " + this.getTotPaginas());
		System.out.println("Página atual: " + this.getPagAtual());
		System.out.println("Livro está aberto: " + this.isAberto());
		System.out.println("Leitor: " + this.getLeitor().getNome());
		System.out.println("Idade: " + this.getLeitor().getIdade());
		System.out.println("Sexo: " + this.getLeitor().getSexo());
	}

	@Override
	public void abrir() {
		this.setAberto(true);
	}

	@Override
	public void fechar() {
		this.setAberto(false);
	}

	@Override
	public void folhear(int p) {
		if(this.getTotPaginas() >= p) {
		this.setPagAtual(p);
		} else {
			System.out.println("Número de páginas é menor");
		}
	}

	@Override
	public void avancarPag() {
		if (this.aberto == false) {
			System.out.println("Impossível avançar página com o livro fechado");
		} else
			this.setPagAtual(getPagAtual() + 1);

	}

	@Override
	public void voltarPag() {
		if (this.aberto == false) {
			System.out.println("Impossível avançar página com o livro fechado");
		} else {
			this.setPagAtual(getPagAtual() - 1);
		}
	}
}
