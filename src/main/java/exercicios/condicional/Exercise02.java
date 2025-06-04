package exercicios.condicional;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Verify if a number is odd or even.
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println("Even!");
		} else {
			System.out.println("Odd!");
		}
		sc.close();
	}

}
