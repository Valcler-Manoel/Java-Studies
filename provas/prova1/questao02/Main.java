package questao02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Titular 1: ");
		String titular1 = sc.nextLine();
		System.out.println("Número da conta 1: ");
		int conta1 = sc.nextInt();

		System.out.println("Saldo 1: ");
		double saldo1 = sc.nextDouble();

		ContaBancaria contaBancaria1 = new ContaBancaria(conta1, titular1, saldo1);
		System.out.println("Conta 1: " + contaBancaria1.numeroConta + ", Titular: " + contaBancaria1.titular
				+ ", Saldo R$ " + contaBancaria1.saldo);

		System.out.println();
		System.out.println("Quanto você quer sacar?");
		double sacar1 = sc.nextDouble();
		contaBancaria1.sacar(sacar1);
		System.out.println("Salto atual: " + contaBancaria1.saldo);

		System.out.println();
		System.out.println("Quanto você quer depositar?");
		double depositar1 = sc.nextDouble();
		contaBancaria1.depositar(depositar1);
		System.out.println("Salto atual: " + contaBancaria1.saldo);
	}

}
