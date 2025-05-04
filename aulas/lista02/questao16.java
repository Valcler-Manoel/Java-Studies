
import java.util.Scanner;

public class questao16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a quantidade de produtos no estoque: ");
		int numProdutos = scanner.nextInt();

		System.out.print("Digite o preço de cada produto em R$ ");
		double precoProduto = scanner.nextDouble();

		double valorEstoque = numProdutos * precoProduto;

		System.out.printf("O o valor total em estoque é de R$" + valorEstoque);

		scanner.close();
	}
}
