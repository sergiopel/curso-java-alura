import java.util.Collections;
import java.util.Scanner;

public class TestaCompra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double limiteDoCartao = 0;
        String descricaoDaCompra;
        double valorDaCompra = 0;
        String acao = "C";

        System.out.println("*********** Aplicação de Compras ***********");
        System.out.println("Digite o limite do cartão:");
        limiteDoCartao = scan.nextDouble();
        CartaoDeCredito cartaoPorto = new CartaoDeCredito(limiteDoCartao);

        while (!acao.equals("F")) {
            System.out.println("Digite a descrição da compra:");
            descricaoDaCompra = scan.next();

            System.out.println("Digite o valor da compra:");
            valorDaCompra = scan.nextDouble();

            Compra compra = new Compra(descricaoDaCompra, valorDaCompra);
            boolean compraRealizada = cartaoPorto.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Dite 'F' para finalizar ou 'C' para continuar");
                acao = scan.next();
            } else {
                System.out.println("Saldo insuficiente!");
                acao = "F";
            }
        }

        System.out.println("Compras realizadas:");

        //System.out.println(cartaoPorto.getCompras());
        Collections.sort(cartaoPorto.getCompras());
        for (Compra item : cartaoPorto.getCompras()) {
            System.out.println(item.getDescricaoDaCompra() + " - " + item.getValorDaCompra());
        }

        System.out.println("Saldo do cartão: " + cartaoPorto.getSaldo());

    }
}
