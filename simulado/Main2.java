package Prova;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] livros = { "Harry Potter", "Senhor dos Aneis", "Guerra Civil" };
		Boolean[] disponibilidade = { true, true, true };

		System.out.println("Gerenciador de livros:");

		int opcao = -1;
		do {
			System.out.println("\nMENU:");
			System.out.println("1. Emprestar");
			System.out.println("2. Devolver");
			System.out.println("3. Listar Disponíveis");
			System.out.println("4. Sair");
			System.out.print("Opção: ");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("\nDigite o índice do livro que você gostaria de alugar:");

				int indiceEmprestar = sc.nextInt();

				if (indiceEmprestar >= 0 && indiceEmprestar < livros.length) {
					if (disponibilidade[indiceEmprestar]) {
						disponibilidade[indiceEmprestar] = false;
						System.out.println("Livro '" + livros[indiceEmprestar] + "' emprestado com sucesso!");
					} else {
						System.out.println("Este livro já está emprestado.");
					}
				} else {
					System.out.println("Índice inválido!");
				}
				break;
			case 2:
				System.out.println("\nDigite o índice do livro que você gostaria de devolver:");
				
				int indiceDevolver = sc.nextInt();
				
				if (indiceDevolver >= 0 && indiceDevolver < livros.length) {
					if (!disponibilidade[indiceDevolver]) {  
					    disponibilidade[indiceDevolver] = true;
					    System.out.println("Livro '" + livros[indiceDevolver] + "' devolvido!");
					} else {
					    System.out.println("Este livro já está disponível e não precisa ser devolvido.");
					}
				} else {
					System.out.println("Índice inválido!");
				}
				break;

			case 3:
				System.out.println("\nLivros disponíveis:");

				for (int i = 0; i < livros.length; i++) {
					if (disponibilidade[i]) {
						System.out.println("- " + livros[i]);
					}
				}
				break;
			}

		} while (opcao != 4);
	}

}
