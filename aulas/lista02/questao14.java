
import java.util.Scanner;

public class questao14 {

	public static void main(String[] args) {
		System.out.println("Digite o peso do produto em g: ");
		Scanner scanner = new Scanner(System.in);
		int pesoProduto = scanner.nextInt();

		if (pesoProduto >= 50 && pesoProduto <= 100) {
			System.out.println("O produto atende as especificações recomendadas!");
		} else {
			System.out.println("O produto não atende as especificações recomendadas!");
		}
		scanner.close();
	}
}
