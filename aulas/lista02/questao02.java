
import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		System.out.println("Digite a quantidade de itens:");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		if (x % 2 == 0) {
			System.out.println("A quantidade de itens é " + x + ", e é par!");
		} else {
			System.out.println("A quantidade de itens é " + x + ", e é ímpar!");
		}
		scanner.close();
	}

}
