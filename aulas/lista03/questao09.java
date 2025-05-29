
import java.util.ArrayList;
import java.util.Scanner;

public class questao09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> fila1 = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\nEscolha qual fileira: ");
            System.out.println("1) FILA 1");
            System.out.println("2) FILA 2");
            System.out.println("3) FILA 3");
            System.out.println("4) FILA 4");
            System.out.println("5) FILA 5");
            System.out.println("6) SAIR");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Quantos assentos deseja adicionar? (0 ou 1): ");
                    int assentos1 = sc.nextInt();
                    sc.nextLine(); 
                    
                    while (assentos1 != 0 && assentos1 != 1 && assentos1 < 5) {
                        System.out.print("Entrada inválida! Digite novamente (0 ou 1): ");
                        assentos1 = sc.nextInt();
                        sc.nextLine();
                    }

                    fila1.add(assentos1);
                    System.out.println("Assentos adicionados à FILA 1!");
                    break;

                case 6:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

            System.out.println("--------FILEIRAS-------");
            System.out.println("Fila 1: " + fila1);
        } while (opcao != 6);

        sc.close();
    }
}
