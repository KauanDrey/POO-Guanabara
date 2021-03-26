package Aula05;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	public void estadoAtualDaConta() {
		System.out.println("Número da conta: " + this.getNumConta());
		System.out.println("Tipo da conta: " + this.getTipo());
		System.out.println("Dono da conta: " + this.getDono());
		System.out.println("Saldo da conta: " + this.getSaldo());
		System.out.println("Status da conta: " + this.status);

	}

	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	public void abrirConta(String tipo) {
		setTipo(tipo);
		setStatus(true);
		if (tipo == "CC") {
			this.setSaldo(50);
		} else if (tipo == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Impossível de fechar conta, pois ainda possui saldo");
		} else if (saldo < 0) {
			System.out.println("Saldo negativo, para fechar conta é necessário quitar");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}

	}

	public void depositar(double valor) {
		if (status == true) {
			this.setSaldo(getSaldo() + valor);
		} else {
			System.out.println("Impossível depositar para uma conta fechada");
		}
	}

	public void sacar(double valor) {
		if (this.isStatus() == true) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(getSaldo() - valor);
				System.out.println("Saque realizado com sucesso");
			} else {
				System.out.println("Saldo insuficiente para o saque");
			}
		} else {
			System.out.println("Impossível sacar de uma conta fechada");
		}
	}

	public void pagarMensal() {
		int valorM = 0;

		if (tipo == "CC") {
			valorM = 12;
		} else if (tipo == "CP") {
			valorM = 20;
		}

		if (isStatus() == true) {
			this.setSaldo(getSaldo() - valorM);
			System.out.println("Mensalidade paga com sucesso");
		} else {
			System.out.println("Impossível pagar mensalidade de uma conta fechada");
		}

	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
