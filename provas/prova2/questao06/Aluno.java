package questao06;

public class Aluno {
	String nome;
	int idade;

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public void exibirDados() {
		System.out.println("Nome do aluno: " + this.nome);
		System.out.println("Idade do aluno: " + this.idade);
	}
}
