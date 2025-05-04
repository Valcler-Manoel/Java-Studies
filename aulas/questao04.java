package Questao04;

import java.util.Scanner;

public class quesstao04 {

	public static void main(String[] args) {
		System.out.println("Digite sua idade: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		if (x >= 18) {
			System.out.println("Você é maior de idade!");
		} else {
			System.out.println("Você é menor de idade, portanto não pode comprar esse produto!");
		}
		scanner.close();
	}

}
