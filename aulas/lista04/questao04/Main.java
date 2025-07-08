package questao04;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 1997);
        livro1.exibirInfo();
        
        Livro livro2 = new Livro("Como ser uma pessoa melhor", "Antônio Bastos");
        livro2.exibirInfo();
    }
}
