package questao17;

import java.util.Scanner;

public class questao17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o salário bruto: R$ ");
		double salarioBruto = scanner.nextDouble();

		System.out.print("Digite a porcentagem de impostos: ");
		double percentualImposto = scanner.nextDouble();

		double valorImposto = (percentualImposto / 100) * salarioBruto;
		double salarioLiquido = salarioBruto - valorImposto;

		System.out.printf("O salário líquido do funcionário é de: R$ " + salarioLiquido);

		scanner.close();
	}
}
