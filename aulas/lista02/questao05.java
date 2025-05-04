
import java.util.Scanner;

public class questao05 {

	public static void main(String[] args) {
		System.out.println("Temperatura 1 em (° C):");
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();

		System.out.println("Temperatura 2 em (° C):");
		double y = scanner.nextDouble();

		System.out.println("Temperatura 3 em (° C):");
		double z = scanner.nextDouble();

		double menorTemp = Math.min(x, Math.min(y, z));
		System.out.println("A menor temperatura é de " + menorTemp + " °C");

		scanner.close();
	}

}
