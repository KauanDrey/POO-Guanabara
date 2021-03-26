package Aula07;

import java.util.Random;

public class Luta {

	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.setAprovada(true);
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
			System.out.println("Impossível marcar luta");
		}

	}

	public void lutar() {
		if (this.isAprovada() == true) {
			System.out.println("######## DESAFIADO #######");
			this.getDesafiado().apresentar();

			System.out.println("######## DESAFIANTE #######");
			this.getDesafiante().apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 2

			switch (vencedor) {
			case 0:
				System.out.println("Luta empatou!!!");
				this.getDesafiado().empatarLuta();
				this.getDesafiante().empatarLuta();
				break;

			case 1:
				this.getDesafiado().ganharLuta();
				this.getDesafiante().perderLuta();
				System.out.println("Lutador " + this.getDesafiado().getNome() + " Ganhou a Luta" + this.getDesafiado().getLocal());
				break;

			case 2:
				this.getDesafiado().perderLuta();
				this.getDesafiante().ganharLuta();
				System.out.println("Lutador " + this.getDesafiante().getNome() + " Ganhou a Luta" + this.getDesafiante().getLocal());
				break;
			}

		} else {
			System.out.println("Luta não pode acontecer");
		}

	}

	private Lutador getDesafiado() {
		return desafiado;
	}

	private void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	private Lutador getDesafiante() {
		return desafiante;
	}

	private void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	@SuppressWarnings("unused")
	private int getRounds() {
		return rounds;
	}

	@SuppressWarnings("unused")
	private void setRounds(int rounds) {
		this.rounds = rounds;
	}

	private boolean isAprovada() {
		return aprovada;
	}

	private void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
