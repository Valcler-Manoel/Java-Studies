
import java.util.ArrayList;
import java.util.Scanner; 

public class questao07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> pacientes = new ArrayList<String>();

		System.out.println("Digite os nomes dos pacientes: ");
		System.out.println("Quando terminar, digite 'fim' ");

		String nomeAtual;

		do {
			System.out.println("Nome do paciente: ");
			nomeAtual = sc.nextLine();
			if (!nomeAtual.equalsIgnoreCase("fim")) {
				pacientes.add(nomeAtual);
			}

		} while (!nomeAtual.equalsIgnoreCase("fim"));

		int quantidadePacientes = pacientes.size();
		System.out.println("Quantidade de pacientes: " + quantidadePacientes);

		int nomesMaior10 = 0;

		for (String nome : pacientes) {
			if (nome.length() >= 10) {
				nomesMaior10++;
			}
		}
		System.out.println("Nomes com mais de 10 caracteres: " + nomesMaior10);
		
        System.out.print("\n3. Deseja verificar se um paciente específico compareceu? Digite o nome dele: ");
        String nomeParaBuscar = sc.nextLine(); 

        if (pacientes.contains(nomeParaBuscar)) {
            System.out.println("O paciente '" + nomeParaBuscar + "' compareceu.");
        } else {
            System.out.println("O paciente '" + nomeParaBuscar + "' NÃO compareceu.");
        }
	}
}
