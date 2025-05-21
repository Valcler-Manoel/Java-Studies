package exercicios.sequencial;

import java.util.Scanner;

public class ExercicioNumeroSecreto {

	public static void main(String[] args) {
		int secretNumber = 7;
		int x = 0;
		Scanner scanner = new Scanner(System.in);

		while (x != secretNumber) {
			System.out.print("Guess a number between 1 and 10: ");
			x = scanner.nextInt();

			if (x != secretNumber) {
				System.out.println("Wrong!");
			} else {
				System.out.println("Congratulations, you're right!");
			}
		}

		scanner.close();
	}

}
