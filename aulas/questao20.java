package questao20;

import java.util.Scanner;

public class questao20 {
	public static void main(String[] args) {

		System.out.print("Digite a temperatura em °C: ");
		Scanner scanner = new Scanner(System.in);
		double temperatura = scanner.nextDouble();

		if (temperatura >= 20 && temperatura <= 30) {
			System.out.println("A temperatura está dentro do intervalo seguro.");
		} else {
			System.out.println("A temperatura está FORA do intervalo seguro!");
		}

		scanner.close();
	}
}
