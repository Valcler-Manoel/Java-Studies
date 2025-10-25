package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> votos1 = new ArrayList<Integer>();
		ArrayList<Integer> votos2 = new ArrayList<Integer>();
		ArrayList<Integer> votosNulos = new ArrayList<Integer>();

		int votar;
		do {
			System.out.println("Vote no seu candidato!");
			System.out.println("Marquinhos (13)!");
			System.out.println("João (22)!");
			System.out.println("PARA SAIR : -2");
			votar = sc.nextInt();

			switch (votar) {
			case 13:
				votos1.add(votar);
				System.out.println("Você votou no marquinhos(13)!");

				break;
			case 22:
				votos2.add(votar);
				System.out.println("Você votou no João(22)!");
				break;
			case 3:
				System.out.println("Encerrando votação...");
			}
			if (votar != 13 && votar != 22) {
				votosNulos.add(votar);
			}

		} while (votar != 3);

		System.out.println("RESULTADO:");
		System.out.println("Marquinhos:" + votos1.size());
		System.out.println("João:" + votos1.size());
		System.out.println("Votos nulos:" + votosNulos.size());

	}

}
