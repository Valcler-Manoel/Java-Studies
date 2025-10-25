package questao05;

public class Paciente {
	String nome;
	double altura;
	double peso;

	public Paciente(String nome, double altura, double peso) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}

	public void exibirPaciente() {
		System.out.println(this.nome);
		System.out.println(this.altura);
		System.out.println(this.peso);
	}

	public double calcularIMC() {
		return this.peso / (this.altura * this.altura);
	}

	public String classificarIMC() {
		double imc = this.calcularIMC();

		if (imc < 18.5) {
			return "Abaixo do peso";
		} else if (imc < 25) {
			return "Peso normal";
		} else if (imc < 30) {
			return "Sobrepeso";
		} else {
			return "Obesidade";
		}
	}
}
