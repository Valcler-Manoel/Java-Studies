package questao02;

public class ContaBancaria {
	int numeroConta;
	String titular;
	double saldo = 0;

	public ContaBancaria(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	public ContaBancaria(int numeroConta, String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void sacar(double saldo) {
		this.saldo -= saldo;
	}
	public void depositar(double saldo) {
		this.saldo += saldo;
	}
	public double exibirDados(double saldo) {
		return this.saldo;
	}

}
