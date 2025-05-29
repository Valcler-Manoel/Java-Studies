
import java.util.Scanner;

public class questao01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu cargo? ");
        String cargo = scanner.nextLine();

        System.out.println("Quantos anos de experiência? ");
        int anos = scanner.nextInt();

        if (cargo.equalsIgnoreCase("gerente") || (cargo.equalsIgnoreCase("diretor")  && anos >= 2)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

        scanner.close();
    }
}