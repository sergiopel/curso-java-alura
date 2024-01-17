import java.util.Scanner;

public class TestaCompra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double limiteDoCartao = 0;
        String descricaoDaCompra;
        double valorDaCompra = 0;

        System.out.println("*********** Aplicação de Compras ***********");
        System.out.println("Digite o limite do cartão:");
        limiteDoCartao = scan.nextDouble();
        CartaoDeCredito cartaoPorto = new CartaoDeCredito(limiteDoCartao);

        System.out.println("Digite a descrição da compra:");
        descricaoDaCompra = scan.next();
        System.out.println("Digite o valor da compra:");
        valorDaCompra = scan.nextDouble();
        Compra compra = new Compra(descricaoDaCompra, valorDaCompra);
    }
}
