package questao03;

public class Funcionario {
    String nome;
    double salarioBruto;
    double imposto;

    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public double salarioLiquido() {
        return this.salarioBruto - this.imposto;
    }

    public void aumentarSalario(double porcentagem) {
        this.salarioBruto += this.salarioBruto * (porcentagem / 100.0);
    }

    @Override
    public String toString() {
        return this.nome + ", R$ " + String.format("%.2f", salarioLiquido());
    }
}