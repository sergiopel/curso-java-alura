import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int palpite = 0;
        int numeroSecreto = new Random().nextInt(100);
        int tentativas = 5;
        System.out.println("Tente adivinhar o número compreendido entre 0 e 100, você terá 5 tentativas");

        for (int i = 1; i <= tentativas; i++) {
            System.out.println("Tentativa " + i);
            palpite = leitura.nextInt();
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns, você acertou!");
                break;
            } else {
                System.out.println("Número errado! Você ainda tem " + (tentativas - i) + " tentativas");
                if (palpite < numeroSecreto) {
                    System.out.println("O número digitado é menor que o número secreto");
                } else {
                    System.out.println("O número digitado é maior que o número secreto");
                }
            }
        }
    }
}
