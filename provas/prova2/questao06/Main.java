package questao06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome aluno 1: ");
		String nome1 = sc.nextLine();	
		System.out.println("Idade aluno 1: ");
		int idade1 = sc.nextInt();	
		sc.nextLine();
		
		Aluno aluno1 = new Aluno(nome1, idade1);

		
		System.out.println("Nome aluno 2: ");
		String nome2 = sc.nextLine();	
		System.out.println("Idade aluno 2: ");
		int idade2 = sc.nextInt();	
		sc.nextLine();
		
		Aluno aluno2 = new Aluno(nome2, idade2);
	
		
		System.out.println("Nome aluno 3: ");
		String nome3 = sc.nextLine();	
		System.out.println("Idade aluno 3: ");
		int idade3 = sc.nextInt();	
		sc.nextLine();
	
		Aluno aluno3 = new Aluno(nome3, idade3);
		
		double media = (aluno1.idade + aluno2.idade + aluno3.idade) / 3;
		
		System.out.println("A média dos 3 alunos é: " + media);
		
		
		}

}
