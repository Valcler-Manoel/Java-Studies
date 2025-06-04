package exercicios.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		/*
		 * Income                 			| Income Tax
		 * -----------------------			|------------
		 * From R$ 0.00 to R$ 2000.00 		| Exempt
		 * From R$ 2000.01 to R$ 3000.00 	| 8 %
		 * From R$ 3000.01 to R$ 4500.00 	| 18 %
		 * Above R$ 4500.00       			| 28 %
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salary = sc.nextDouble();
		
		double tax;
		if (salary <= 2000.0) {
			tax = 0.0;
		}
		else if (salary <= 3000.0) {
			tax = (salary - 2000.0) * 0.08;
		}
		else if (salary <= 4500.0) {
			tax = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			tax = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (tax == 0.0) {
			System.out.println("Exempt");
		}
		else {
			System.out.printf("R$ %.2f%n", tax);
		}
		
		sc.close();
	}
}
