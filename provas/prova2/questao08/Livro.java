package questao08;

public class Livro {
    String titulo;
    String autor;
    String status;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.status = "disponível";
    }

    public void emprestar() {
        this.status = "emprestado";
    }

    public void devolver() {
        this.status = "disponível";
    }

    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Livro ---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Status: " + this.status);
    }
}