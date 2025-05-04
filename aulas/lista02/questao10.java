
import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		System.out.println("Digite a quantidade de produtos para verificação:");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		if (x % 5 == 0) {
			System.out.println("Quantidade é múltiplo de 5!");
		} else {
			System.out.println("A quantidade não é múltiplo de 5!");
		}
		scanner.close();
	}

}

