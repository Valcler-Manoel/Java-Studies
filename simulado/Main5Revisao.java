package Prova;

import java.util.Scanner;

public class Main5Revisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senha = 15;
		int tentativas = 5;

		System.out.println("Adivinhe a senha da BOMBA! Você tem " + tentativas + " tentativas");
		senha = sc.nextInt();
		while (senha != 15) {
			tentativas--;
			System.out.println("Senha incorreta! Você tem " + tentativas + " tentativas restantes");
			senha = sc.nextInt();
			if (senha > 15) {
				System.out.println("Chute para baixo!");
			} else if (senha < 15) {
				System.out.println("Chute para cima!");
				if (tentativas == 0) {
					System.out.println("A BOMBA EXPLODIU! KABOOMM");
					break;
				} else if (senha == 15) {
					System.out.println("BOMBA DESARMADA");
				}
			}
		}

	}

}
