package questao07;

import java.util.Scanner;

public class questao07 {

	public static void main(String[] args) {
		System.out.println("Digite um valor racional monetário para análise R$:");
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		if (x > 0) {
			System.out.println("O valor R$" + x + " tem um valor positivo!");
		} else if (x < 0) {
			System.out.println("O valor R$" + x + " tem um valor negativo!");
		} else {
			System.out.println("O valor é zero!");
		}
		
		scanner.close();
	}

}
