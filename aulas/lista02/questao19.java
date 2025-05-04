
import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        System.out.println("Digite o valor da compra em R$: ");
        Scanner scanner = new Scanner(System.in);
        double valorCompra = scanner.nextDouble();

        System.out.println("Digite o valor do desconto em porcentagem: ");
        double desconto = scanner.nextDouble();

        double valorDesconto = (desconto / 100) * valorCompra;
        double valorFinal = valorCompra - valorDesconto;

        System.out.printf("O valor final da compra, após o desconto, é: R$ "+ valorFinal);

        scanner.close();
    }
}
