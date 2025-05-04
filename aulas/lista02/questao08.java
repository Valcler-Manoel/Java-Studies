
import java.util.Scanner;

public class questao08 {

	public static void main(String[] args) {
		System.out.println("Cálculo de IMC");
		System.out.println("Digite sua massa atual em kg: ");
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		System.out.println("Digite sua altura atual em cm: ");
		double y = scanner.nextDouble();
		y = y / 100;

		double imc = (x / (y * y));

		if (imc < 16) {
			System.out.println("Seu IMC é: " + imc + " e você está abaixo do peso Grau III!");
		} else if (imc >= 16 && imc <= 16.99) {
			System.out.println("Seu IMC é: " + imc + " e você está abaixo do peso Grau II!");
		} else if (imc >= 17 && imc <= 18.49) {
			System.out.println("Seu IMC é: " + imc + " e você está abaixo do peso Grau I!");
		} else if (imc >= 18.5 && imc <= 24.99) {
			System.out.println("Seu IMC é: " + imc + " e você está com peso ideal!");
		} else if (imc >= 25 && imc <= 29.99) {
			System.out.println("Seu IMC é: " + imc + " e você está com sobrepeso!");
		} else if (imc >= 30 && imc <= 34.99) {
			System.out.println("Seu IMC é: " + imc + " e você está com obesidade Grau I!");
		} else if (imc >= 35 && imc <= 39.99) {
			System.out.println("Seu IMC é: " + imc + " e você está com obesidade Grau II!");
		} else if (imc >= 40) {
			System.out.println("Seu IMC é: " + imc + " e você está com obesidade Grau III!");
		}

		scanner.close();
	}

}
