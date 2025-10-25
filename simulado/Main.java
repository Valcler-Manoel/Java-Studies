package Prova;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo;

		System.out.println("Digite um número");
		codigo = sc.nextInt();

		while (codigo < 0) {
			System.out.println("Entrada inválida!");
			System.out.print("Digite o código de lançamento novamente: ");
			codigo = sc.nextInt();
		}
		if (codigo > 0 && codigo % 2 == 0) {
			System.out.println("Código válido! Lançamento autorizado!");
		} else {
			System.out.println("Código Inválido! Risco de Instabilidade!!");

		}

		sc.close();
	}
}
