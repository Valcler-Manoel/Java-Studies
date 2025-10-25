package Prova;

import java.util.Scanner;

public class Main2Revisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] livros = { "Harry Potter", "Senhor dos Aneis", "Guerra Civil" };
		Boolean[] disponivel = { true, true, true };

		int opcao;

		do {
			System.out.println("(1) EMPRESTAR LIVRO");
			System.out.println("(2) DEVOLVER LIVRO");
			System.out.println("(3) LISTAR LIVRO");
			System.out.println("(4) SAIR");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o índice do livro:");
				int emprestarLivro = sc.nextInt();
				if (emprestarLivro > 0 && emprestarLivro < livros.length) {
					if (disponivel[emprestarLivro]) {
						disponivel[emprestarLivro] = false;
					}
				}
				break;
			case 2:
				System.out.println("Digite o índice do livro para devolver:");
				int devolverLivro = sc.nextInt();
				if (devolverLivro > 0 && devolverLivro < livros.length) {
					if (!disponivel[devolverLivro]) {
						disponivel[devolverLivro] = true;
					}
				}
				break;

			case 3:
				System.out.println("Livros disponíveis:");
				for (int i = 0; i < livros.length; i++) {
					if (disponivel[i]) {
						System.out.println(livros[i]);
					}
				}
				break;
			}

		} while (opcao != 4);
	}

}
