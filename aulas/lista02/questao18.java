
import java.util.Scanner;

public class questao18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de produtos no estoque: ");
		int numProdutos = scanner.nextInt();

		System.out.print("Digite o tempo de fabricação de cada produto em segundos: ");
		double tempoProduto = scanner.nextDouble();

		double tempoTotal = numProdutos * tempoProduto;
		double tempoTotalMinutos = (tempoTotal / 60);

		System.out.printf("O tempo total de fabricação é de " + tempoTotal + "s ou em minutos " + tempoTotalMinutos + "min");

		scanner.close();
	}
}
