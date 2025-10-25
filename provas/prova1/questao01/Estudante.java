package questao01;

public class Estudante {
	String nome;
	int matricula;
	double nota1, nota2;

	public Estudante(String nome, int matricula) {
		this.nome = nome;
        this.matricula = matricula;
	}

	public Estudante(String nome, int matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

	public double calcularMedia() {
		return (this.nota1 + this.nota2) / 2;
	}
}
