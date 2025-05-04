
import java.util.Scanner;

public class questao12 {

	public static void main(String[] args) {
		System.out.println("Digite sua idade: ");
		Scanner scanner = new Scanner(System.in);
		int idadePessoa = scanner.nextInt();

		if (idadePessoa >= 16) {
			System.out.println("Você está apto para voltar!");
		} else {
			System.out.println("Você não possui a idade mínina, portanto não é apto para votar!");
		}

		scanner.close();
	}

}
