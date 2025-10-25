package questao08;

public class Main {

    public static void main(String[] args) {

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("O Guia do Mochileiro das Galáxias", "Douglas Adams");

        livro1.exibirDetalhes();
        System.out.println(); 
        livro2.exibirDetalhes();


        System.out.println("Ação: Emprestando '" + livro1.titulo + "'...");
        livro1.emprestar();

        System.out.println("Ação: Emprestando '" + livro2.titulo + "'...");
        livro2.emprestar();

        System.out.println("Ação: Devolvendo '" + livro1.titulo + "'...");
        livro1.devolver();

        livro1.exibirDetalhes();
        System.out.println();
        livro2.exibirDetalhes();
    }
}