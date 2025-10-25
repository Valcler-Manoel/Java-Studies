package questao07;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Dados do Cliente 1 ---");
        System.out.print("Nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Tipo do plano: ");
        String plano1 = sc.nextLine();
        System.out.print("Valor do plano: ");
        double valor1 = sc.nextDouble();
        
        System.out.print("Meses de contrato: ");
        int meses1 = sc.nextInt();
        sc.nextLine(); 
      
        Fatura fatura1 = new Fatura(nome1, plano1, valor1, meses1);

        System.out.println("");

        System.out.println("--- Dados do Cliente 2 ---");
        System.out.print("Nome: ");
        String nome2 = sc.nextLine();
        System.out.print("Tipo do plano: ");
        String plano2 = sc.nextLine();
        System.out.print("Valor do plano: ");
        double valor2 = sc.nextDouble();

        System.out.print("Meses de contrato: ");
        int meses2 = sc.nextInt();
        sc.nextLine();

        Fatura fatura2 = new Fatura(nome2, plano2, valor2, meses2);

        System.out.println("\n--- Valores Finais das Faturas ---");
                System.out.printf("Valor final para %s: R$ %.2f%n", fatura1.nomeCliente, fatura1.calcularValorFinal());
        System.out.printf("Valor final para %s: R$ %.2f%n", fatura2.nomeCliente, fatura2.calcularValorFinal());

        sc.close();
    }
}