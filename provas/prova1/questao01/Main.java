package questao01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do estudante 1: ");
		String nome1 = sc.nextLine();
		System.out.print("Digite a matrícula do estudante 1: ");
		int matricula1 = sc.nextInt();
		
		System.out.print("Digite a primeira nota do estudante 1: ");
		double n1_est1 = sc.nextDouble();
		System.out.print("Digite a segunda nota do estudante 1: ");
		double n2_est1 = sc.nextDouble();

		sc.nextLine();

		Estudante estudante1 = new Estudante(nome1, matricula1, n1_est1, n2_est1);

		System.out.printf("A média do estudante %s (matrícula %s) é: %.2f%n", estudante1.nome, estudante1.matricula,
				estudante1.calcularMedia());
		sc.close();
	}
}