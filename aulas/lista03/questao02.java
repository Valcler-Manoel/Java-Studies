
import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual sua média? ");
		int media = sc.nextInt();

		if (media == 7) {
			System.out.println("Passou!");
		} else if (media >= 5 && media < 7) {
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado!");
		}
	}

}
