package exercicios.condicional;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Verify if two numbers are multiples.

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		if (n1 % n2 == 0 || n1 % n2 == 0) {
			System.out.println("Multiples!");
		} else {
			System.out.println("They are not multiple!");
		}

		sc.close();
	}
}