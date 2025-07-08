package questao02;

public class Main {

    public static void main(String[] args) {
        Animal[] armazenar = new Animal[2];

        
        armazenar[0] = new Leao();
        armazenar[1] = new Elefante();

        System.out.println("Escutando os sons dos animais:");
        for (Animal animal : armazenar) {
            animal.emitirSom();
        }
    }
}
