package exercicios.condicional;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Determine how long a match lasted.
		Scanner sc = new Scanner(System.in);

		int initialHour = sc.nextInt();
		int finalHour = sc.nextInt();
		
		int duration;
		if (initialHour < finalHour) {
			duration = finalHour - initialHour;
		}
		else {
			duration = 24 - initialHour + finalHour;
		}
		
		System.out.println("The match lasted " + duration + " hours");
		
		sc.close();
	}
}
