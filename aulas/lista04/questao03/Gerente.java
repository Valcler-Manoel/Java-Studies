package questao03;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	public void exibirBonus() {
		double salarioGerente = this.getSalario();

		double bonus = salarioGerente * 0.20;
		System.out.println("Bônus do Gerente: R$ " + (bonus));
	}
}
