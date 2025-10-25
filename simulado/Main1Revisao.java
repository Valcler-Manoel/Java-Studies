package Prova;

import java.util.Scanner;

public class Main1Revisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tentativas = 0;

		System.out.println("Digite o código para lançamento!");
		int codigo = sc.nextInt();

		while (codigo < 0) {
			System.out.println("Código inválido, tente outro!");
			codigo = sc.nextInt();
		}

		if (codigo > 0 && codigo % 2 == 0) {
			System.out.println("Código válido!");
		} else {
			System.out.println("Código inválido! Risco de instabilidade");
		}
	}

}
