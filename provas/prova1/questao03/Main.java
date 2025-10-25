package questao03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        double salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        double imposto = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);

        System.out.println("\nFuncionário: " + funcionario);

        System.out.print("\nDigite a porcentagem para aumentar o salário: ");
        double porcentagem = sc.nextDouble();
        funcionario.aumentarSalario(porcentagem);

        System.out.println("\nDados atualizados: " + funcionario);

        sc.close();
    }
}