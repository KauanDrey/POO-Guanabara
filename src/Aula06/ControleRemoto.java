package Aula06;

public class ControleRemoto implements Controlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;

	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(true);
		this.setTocando(false);
	}

	@Override
	public void ligar() {

		this.setLigado(true);
		System.out.println("Ligando TV...");

	}

	@Override
	public void desligar() {
		this.setLigado(false);
		System.out.println("Desligando TV...");
	}

	@Override
	public void abrirMenu() {
		if (this.isLigado() == true) {
			System.out.println("----------MENU----------");
			System.out.println("Está ligado: " + this.isLigado());
			System.out.println("Está tocando: " + this.isTocando());
			System.out.println("Volume: " + this.getVolume());
			for (int i = 1; i <= this.getVolume(); i += 10) {
				System.out.print("|");
			}

		} else {
			System.out.println("Impossível abrir menu!!! Ligue a TV.");
		}
		System.out.println("");
	}

	@Override
	public void fecharMenu() {
		if(this.isLigado() == true) {
		System.out.println("Fechando menu...");
		} else {
			System.out.println("Impossível fechar menu!!! Ligue a TV.");
		}
		
	}

	@Override
	public void maisVolume() {
		if (this.isLigado() == true) {
			this.setVolume(getVolume() + 1);
		} else {
			System.out.println("Televisão está desligada");
		}
		if (this.getVolume() > 100) {
			this.setVolume(100);
			System.out.println("Volume Máximo");
		}
	}

	@Override
	public void menosVolume() {
		if (this.isLigado() == true) {
			this.setVolume(getVolume() - 1);
		} else {
			System.out.println("Televisão está desligada");
		}
		if (this.getVolume() < 0) {
			this.setVolume(0);
			System.out.println("Volume mínimo");
		}

	}

	@Override
	public void ligarMudo() {
		if (this.isLigado() == true && this.getVolume() > 0) {
			this.setVolume(0);
		} else {
			System.out.println("TV desligada");
		}

	}

	@Override
	public void desligarMudo() {
		if (this.isLigado() == true && this.getVolume() == 0) {
			this.setVolume(50);
		} System.out.println("TV desligada");

	}

	@Override
	public void play() {
		if (this.isLigado() == true && this.isTocando() == false) {
			this.setTocando(true);
		} else {
			System.out.println("TV desligada");
		}

	}

	@Override
	public void pause() {
		if (this.isLigado() == true && this.isTocando() == true) {
			this.setTocando(false);
		} System.out.println("TV desligada");

	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

}
