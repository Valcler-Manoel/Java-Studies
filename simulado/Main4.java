package Prova;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senhaCorreta = 15;
		int tentativasRestantes = 5;

		int senha = -1;

		while (tentativasRestantes > 0) {
			System.out.println("ADIVINHE A SENHA DA BOMBA! Você tem " + tentativasRestantes + " tentativas restantes.");
			System.out.print("Digite a senha: ");
			senha = sc.nextInt();

			if (senha == senhaCorreta) {
				System.out.println("BOMBA DESARMADA! Você conseguiu!");
				break;
			} else {
				tentativasRestantes--; // Reduz o número de tentativas
				if (tentativasRestantes > 0) {
					System.out.println("Senha incorreta! Tente novamente.");
				}
			}
		}

		if (tentativasRestantes == 0) {
			System.out.println("💥 EXPLOSÃO! Você falhou em desarmar a bomba.");
			System.out.println("Contagem regressiva:");

			for (int i = 5; i >= 1; i--) {
				System.out.println("Contagem regressiva: " + i + " segundos...");
			}
			System.out.println("BOOM!");

			sc.close();
		}
	}
}
