package Praticando;

public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;

	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
	}

	public void acelerar() {
		this.setVelocidade(getVelocidade() + 20);
		System.out.println("Acelerando veículo para: " + this.getVelocidade());
	}

	public void abastecer(int combustivel) {
		setLitrosCombustivel(combustivel);
		if (combustivel < 0) {
			System.out.println("O combustivel não pode ser negativo!");
			// setLitrosCombustivel(0);
		} else if (getLitrosCombustivel() > 60) {
			System.out.println("Limite do tanque atingido!");
			setLitrosCombustivel(60);
		} else {
			System.out.println("Abastecendo o tanque para: " + getLitrosCombustivel() + "L");
		}
	}

	public void frear() {
		while (this.getVelocidade() > 0) {
			this.setVelocidade(getVelocidade() - 10);
			System.out.println("Freando..." + this.getVelocidade());
		}
	}

	public void pintar(String cor) {
		setCor(cor);
		System.out.println("Pintando carro para: " + this.getCor());
	}

	public void ligar() {
		if (this.isLigado() == false) {
			this.setLigado(true);
			System.out.println("Ligando carro");
		} else {
			System.out.println("Carro já está ligado");
		}

	}

	public void desligar() {
		if (this.getVelocidade() > 0) {
			this.setLigado(true);
			System.out.println("Impossível desligar com velocidade acima de 0 KM/h");
		} else if (this.isLigado == true) {
			this.setLigado(false);
			System.out.println("Desligando carro");
		} else {
			System.out.println("Carro já desligado");
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
