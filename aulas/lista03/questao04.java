
import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sistema bancário: ");

		int senha = 6789;
		int tentativas = 0;

		boolean acessoConcedido = false;

		for (tentativas = 1; tentativas <= 3; tentativas++) {
			System.out.print("Tentativa " + tentativas + ": Digite sua senha: ");
			int senhaDigitada = sc.nextInt();

			if (senhaDigitada == senha) {
				System.out.println("Acesso permitido!");
				acessoConcedido = true;
				break;
			} else {
				System.out.println("Senha incorreta.");
			}
		}

		if (!acessoConcedido) {
			System.out.println("Conta bloqueada. Você excedeu o número máximo de tentativas.");
		}

		sc.close();
	}
}
