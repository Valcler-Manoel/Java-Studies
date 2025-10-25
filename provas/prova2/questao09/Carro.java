package questao09;

public class Carro {
	String placa;
	String modelo;
	String status;

	public Carro(String placa, String modelo, String status) {
		this.placa = placa;
		this.modelo = modelo;
		this.status = status;
	}

	public void alugarCarro() {
		this.status = "Alugado";
	}

	public void devolverCarro() {
		this.status = "Disponível";
	}

	public void exibirCarros() {
		System.out.println(this.placa);
		System.out.println(this.modelo);
		System.out.println(this.status);
	}
}
