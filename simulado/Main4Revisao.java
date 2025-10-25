package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4Revisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> votos1 = new ArrayList<Integer>();
		ArrayList<Integer> votos2 = new ArrayList<Integer>();

		int opcao;
		do {
			System.out.println("FERNADO 13");
			System.out.println("JOAO 22");
			System.out.println("SAIR");
			opcao = sc.nextInt();

			switch (opcao) {
			case 13:
				System.out.println("Voto registrado!");
				votos1.add(opcao);
				break;

			case 22:
				System.out.println("Voto registrado!");
				votos2.add(opcao);
				break;
			}

		} while (opcao != 3);
		System.out.println(" Votos Fernandin: " + votos1.size());
		System.out.println(" Votos Joao: " + votos2.size());
		if (votos1.size() > votos2.size()) {
			System.out.println("FERNANDIN VENCEU");
		} else {
			System.out.println("JOAO VENCEU");
		}

	}

}
