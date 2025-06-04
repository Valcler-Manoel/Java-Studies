package exercicios.condicional;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Verify if a number is negative or positive.
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
		int n = sc.nextInt();

		if (n > 0) {
			System.out.println("Positve!");
		} else {
			System.out.println("Negative!");
		}

		sc.close();
	}

}
