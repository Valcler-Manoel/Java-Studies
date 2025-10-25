package questao04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SessaoCinema sessao1 = new SessaoCinema("Homem de Ferro", 21, 50);
		SessaoCinema sessao2 = new SessaoCinema("Guerra Infinita", 15, 70);
		SessaoCinema sessao3 = new SessaoCinema("Ultimato", 22, 90);
		
		System.out.println("Sessões disponíveis");
		sessao1.exibirDetalhes();
		sessao2.exibirDetalhes();
		sessao3.exibirDetalhes();
		
		System.out.println("Ingressos vendidos sessão 1: ");
		int quantidadeCompra = sc.nextInt();

        sessao1.venderIngresso(quantidadeCompra);
        sessao1.exibirDetalhes();
	}

}
