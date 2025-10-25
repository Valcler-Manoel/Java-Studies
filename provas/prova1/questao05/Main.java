package questao05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome paciente: ");
		String nome1 = sc.nextLine();
		System.out.println("Altura paciente (m): ");
		Double altura1 = sc.nextDouble();
		System.out.println("Peso paciente (kg): ");
		Double peso1 = sc.nextDouble();

		Paciente paciente1 = new Paciente(nome1, altura1, peso1);

		paciente1.exibirPaciente();

		System.out.printf("IMC do paciente = %.2f%n", paciente1.calcularIMC());

		String classificacao = paciente1.classificarIMC();
		System.out.printf("Relatório: " + classificacao);

	}

}
