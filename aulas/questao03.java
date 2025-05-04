package Questao03;

import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		System.out.println("Digite o preço 1: ");
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		System.out.println("Digite o preço 2: ");
		int y = scanner.nextInt();

		if (x > y) {
			System.out.println("O preço 1 é mais caro, custando: R$ " + x + ", que o preço 2: R$ " + y);
		} else {
			System.out.println("O preço 2 é mais caro, custando: R$ " + y + ", que o preço 1: R$ " + x);

		}
		scanner.close();
	}

}
