package questao01;

import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {
		System.out.println("Digite a primeira nota:");
		Scanner scanner = new Scanner(System.in);

		double x = scanner.nextDouble();
		System.out.println("Digite a segunda nota:");
		double y = scanner.nextDouble();
		System.out.println("Digite a terceira nota:");
		double z = scanner.nextDouble();

		double media = (x + y + z) / 3;
		System.out.println("A média do aluno é: ");
		System.out.println(media);

		scanner.close();
	}
}
