
import java.util.Scanner;

public class questao15 {

	public static void main(String[] args) {
		System.out.println("Distância total em km: ");
		Scanner scanner = new Scanner(System.in);
		int distancia = scanner.nextInt();

		double valorFrete = (distancia * 1.20);

		System.out.println("A distância será de " + distancia + "km e o valor total do frete será de R$" + valorFrete);
		
		scanner.close();
	}

}
