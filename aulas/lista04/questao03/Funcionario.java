package questao03;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: R$ " + (this.salario));
    }
}
