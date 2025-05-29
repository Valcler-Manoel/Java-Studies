
import java.util.Scanner;

public class questao06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("COMPORTAMENTO CLIMÁTICO SEMANAL");

		int[] temperaturasRegistradas = new int[7];
		int somaTemperaturas = 0;
		
		for (int i = 0; i < 7; i++) {
			System.out.print("Dia " + (i + 1) + ": Digite a temperatura registrada: ");
			temperaturasRegistradas[i] = sc.nextInt(); 
			somaTemperaturas += temperaturasRegistradas[i]; 
		}

		double mediaTemperatura = (double) somaTemperaturas / 7; 

		int diasAcimaMedia = 0;

		for (int i = 0; i < 7; i++) {
			if (temperaturasRegistradas[i] > mediaTemperatura) {
				diasAcimaMedia++;
			}
		}
		
		System.out.println("\n--- Resultado ---");
		System.out.printf("Média semanal das temperaturas: %.2f graus\n", mediaTemperatura);
		System.out.println("Dias com temperatura acima da média: " + diasAcimaMedia);

		sc.close();
	}
}