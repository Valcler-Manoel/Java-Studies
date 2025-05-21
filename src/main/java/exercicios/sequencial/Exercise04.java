package exercicios.sequencial;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number, hours;
		double valuePerHour, salary;

		number= sc.nextInt();
		hours = sc.nextInt();
		valuePerHour = sc.nextDouble();

		salary = valuePerHour * hours;

		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);

		sc.close();
	}

}
