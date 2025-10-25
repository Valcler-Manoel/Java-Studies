package Prova;

import java.util.Scanner;

public class Main3Revisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] animais = { "Cachorro", "Gato", "Girafa" };
		Integer[] quantComida = { 3, 2, 5 };

		int quantCachorro = 0;
		int quantGato = 0;
		int quantGirafa = 0;
		int opcao;
		do {
			System.out.println("QUAL ANIMAL ALIMENTAR?");
			System.out.println("(1) Cachorro");
			System.out.println("(2) Gato");
			System.out.println("(3) Girafa");
			System.out.println("(4) SAIR");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				if (quantCachorro < quantComida[0]) {
					quantCachorro++;
					System.out.println("Você alimentou o dog! " + quantCachorro);
				} else {
					System.out.println("Limite do cachorro atingido!");
				}
				break;
			case 2:
				if (quantGato < quantComida[1]) {
					quantGato++;
					System.out.println("Você alimentou o gato!" + quantGato);
				} else {
					System.out.println("Limite do gato atingido!");
				}
				break;
			case 3:
				if (quantGirafa < quantComida[2]) {
					quantGirafa++;
					System.out.println("Você alimentou a girafa!");
				} else {
					System.out.println("Limite da girafa atingida! " + quantGirafa);
				}
				break;
			}

		} while (opcao != 4);
	}

}
