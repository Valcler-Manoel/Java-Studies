package questao07;

public class Fatura {
	String nomeCliente;
	String tipoPlano;
	double valorPlano;
	int mesesDeContrato;

	public Fatura(String nomeCliente, String tipoPlano, double valorPlano, int mesesDeContrato) {
		this.nomeCliente = nomeCliente;
		this.tipoPlano = tipoPlano;
		this.valorPlano = valorPlano;
		this.mesesDeContrato = mesesDeContrato;
	}

	public double calcularValorFinal() {

		if (this.mesesDeContrato > 12) {
			return this.valorPlano * 0.90;
		} else {
			return this.valorPlano;
		}
	}
}
