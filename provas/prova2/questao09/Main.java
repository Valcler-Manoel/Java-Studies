package questao09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro1 = new Carro("PMF123", "Prisma", "Disponível");
        Carro carro2 = new Carro("ABC123", "S10", "Disponível");

        System.out.println("Carros disponíveis na locadora");
        carro1.exibirCarros();
        carro2.exibirCarros();

        System.out.print("\nQual carro você quer alugar (Digite o modelo exato)? ");
        String modeloEscolhido = sc.nextLine();

        if (modeloEscolhido.equals(carro1.modelo)) {
            carro1.alugarCarro();
            System.out.println("O carro 'Prisma' foi alugado com sucesso!");
        } else if (modeloEscolhido.equals(carro2.modelo)) {
            carro2.alugarCarro();
            System.out.println("O carro 'S10' foi alugado com sucesso!");
        } else {
            System.out.println("Modelo não encontrado ou indisponível.");
        }

        System.out.println("\nStatus final dos carros");
        carro1.exibirCarros();
        carro2.exibirCarros();
        
        sc.close();
    }
}