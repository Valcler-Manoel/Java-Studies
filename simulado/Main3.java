package Prova;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] animais = { "Cachorro", "Pato", "Gato" };
		Integer[] limiteComida = { 2, 1, 2 };

		int comidaCachorro = 0;
		int comidaPato = 0;
		int comidaGato = 0;
		int opcao = -1;
		do {
			System.out.println("Escolha qual animal alimentar!");
			System.out.println("0: Cachorro");
			System.out.println("1: Pato");
			System.out.println("2: Gato");
			System.out.println("Para SAIR: 3");
			opcao = sc.nextInt();

			switch (opcao) {
			case 0:
				if (comidaCachorro < limiteComida[0]) {
					comidaCachorro++;
					System.out.println("Você alimentou o dog!");
				} else {
					System.out.println("Limite do cachorro atingido!");
			}
				break;
			case 1:
				if (comidaPato< limiteComida[1]) {
					comidaPato++;
					System.out.println("Você alimentou o pato!");
				}else {
					System.out.println("Limite do pato atingido!");
				}
			case 2:
				if (comidaGato< limiteComida[2]) {
					comidaGato++;
					System.out.println("Você alimentou o gato!");
				}else {
					System.out.println("Limite do gato atingido!");
				}
	

}
		} while (opcao != 3);
}}