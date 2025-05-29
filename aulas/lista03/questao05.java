
import java.util.Scanner;

public class questao05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Opções de Operação:");
        System.out.println("1 - Depósito");
        System.out.println("2 - Saque");
        System.out.println("3 - Transferência");
        System.out.println("4 - Pagamento de boletos");

        int quantDepositos = 0;
        int quantSaque = 0;
        int quantTransferencia = 0;
        int quantBoletos = 0;

        for (int i = 1; i <= 10; i++) {
            int operacao; 
            boolean entradaValida = false; 

            do {
                System.out.print("Escolha a operação desejada (1-4) para a transação " + i + ": ");
                operacao = sc.nextInt();

                if (operacao >= 1 && operacao <= 4) {
                    entradaValida = true;
                } else {
                    System.out.println("Operação inválida! Por favor, escolha um número entre 1 e 4.");
                }
            } while (!entradaValida);
            if (operacao == 1) {
                System.out.println("Operação Depósito realizada!");
                quantDepositos++;
            } else if (operacao == 2) {
                System.out.println("Operação Saque realizada!");
                quantSaque++;
            } else if (operacao == 3) {
                System.out.println("Operação Transferência realizada!");
                quantTransferencia++;
            } else if (operacao == 4) {
                System.out.println("Operação Pagamento de Boleto realizada!");
                quantBoletos++;
            }
            System.out.println("---");
        }

        System.out.println("Depósitos realizados: " + quantDepositos);
        System.out.println("Saques realizados: " + quantSaque);
        System.out.println("Transferências realizadas: " + quantTransferencia);
        System.out.println("Boletos realizados: " + quantBoletos);

        sc.close();
    }
}