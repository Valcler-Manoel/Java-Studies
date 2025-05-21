package exercicios.sequencial;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R, A, pi = 3.14159;

		System.out.println("Digite o valor do raio: ");
		R = sc.nextDouble();

		A = pi * R * R;

		System.out.printf("Área do Círculo = %.4f%n", A);

		sc.close();
	}

}
