package questao04;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;

	public Livro(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public Livro(String titulo, String autor) {
		this(titulo, autor, 2020);
	}

	public void exibirInfo() {
		System.out.println("Título: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Ano de Publicação: " + this.anoPublicacao);
	}
}
