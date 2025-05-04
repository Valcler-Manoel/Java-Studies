package questao11;

import java.util.Scanner;

public class questao11 {

	public static void main(String[] args) {
		System.out.println("Quantidade de dias em atraso:");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		double multa = (x * 0.50);

		System.out.println("Você ficou " + x + " dias em atraso e sua multa foi de R$" + multa);
		
		scanner.close();
	}

}
