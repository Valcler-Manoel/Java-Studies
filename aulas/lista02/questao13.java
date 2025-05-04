
import java.util.Scanner;

public class questao13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número de ingressos vendidos: ");
		int numIngressos = scanner.nextInt();

		System.out.print("Digite o preço de cada ingresso: ");
		double precoIngresso = scanner.nextDouble();

		double totalArrecadado = numIngressos * precoIngresso;

		System.out.printf("O total arrecadado com a venda de ingressos é: R$ %.2f\n", totalArrecadado);

		scanner.close();
	}
}
