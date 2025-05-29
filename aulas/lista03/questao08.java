
import java.util.ArrayList;
import java.util.Scanner;

public class questao08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PESQUISA ONLINE:");

		ArrayList<Integer> notas = new ArrayList<Integer>();

		int notaAtual;
		System.out.println("Por favor, avalie de 1 a 5");
		System.out.println("Para encerrar a pesquisa, digite 0");

		do {
			System.out.println("Nota:");
			notaAtual = sc.nextInt();

			if (notaAtual >= 1 && notaAtual <= 5) {
				notas.add(notaAtual);
			} else if (notaAtual != 0) {
				System.out.println("Nota inválida! Por favor, digite uma nota de 1 a 5, ou 0 para encerrar.");

			}

		} while (notaAtual != 0);

		int notaSatisfeito = 0;
		int notaMuitoSatisfeito = 0;
		int somaDasNotas = 0;

		for (int nota : notas) {
			if (nota == 4) {
				notaSatisfeito++;
			} else if (nota == 5) {
				notaMuitoSatisfeito++;
			}
		}
		System.out.println("Notas satisfeitas(4) : " + notaSatisfeito);
		System.out.println("Notas muito satisfeitas(5) : " + notaMuitoSatisfeito);

	}

}
