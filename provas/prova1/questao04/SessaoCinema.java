package questao04;

public class SessaoCinema {
	String filme;
	int horario;
	int ingressosDisponiveis;

	public SessaoCinema(String filme, int horario, int ingressos) {
		this.filme = filme;
		this.horario = horario;
		this.ingressosDisponiveis = ingressos;
	}
	
	public void venderIngresso(int quantidadeCompra) {
        if (quantidadeCompra > 0 && quantidadeCompra <= this.ingressosDisponiveis) {
            this.ingressosDisponiveis -= quantidadeCompra;
            System.out.println("Venda realizada com sucesso! Ingressos restantes: " + this.ingressosDisponiveis);
        } else {
            System.out.println("Venda não realizada. Ingressos insuficientes ou quantidade inválida.");
        }
    }
	
	public void exibirDetalhes() {
		System.out.println("Nome: " + this.filme);
		System.out.println("Horário " + this.horario + "h");
		System.out.println("Quantidade de ingressos " + this.ingressosDisponiveis);
	}
}
