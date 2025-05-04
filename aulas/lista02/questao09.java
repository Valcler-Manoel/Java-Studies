
import java.util.Scanner;

public class questao09 {

	public static void main(String[] args) {
		System.out.println("Conversor de Celsius para Fahrenheit");
		System.out.println("Digite a temperatura em (°C) :");
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextDouble();

		double fahrenheit = ((9.0 / 5) * c) + 32;

		System.out.println("A temperutra " + c + "°C em Fahrenheit é de " + fahrenheit + "°F");
		scanner.close();
	}

}
