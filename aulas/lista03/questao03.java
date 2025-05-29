
import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quant_criancas = 0;
		int quant_adolescentes = 0;
		int quant_adultos = 0;

		System.out.println("Digite 20 idades: ");

		for (int i = 1; i <= 20; i++) {
			System.out.println("Digite a idade da pessoa: ");
			int idade = sc.nextInt();

			if (idade <= 12) {
				quant_criancas++;
			} else if (idade >= 13 && idade <= 17) {
				quant_adolescentes++;
			} else if (idade >= 18) {
				quant_adultos++;
			}
		}

		System.out.println("Crianças: " + quant_criancas);
		System.out.println("Adolescentes: " + quant_adolescentes);
		System.out.println("Adultos: " + quant_adultos);

	}

}
