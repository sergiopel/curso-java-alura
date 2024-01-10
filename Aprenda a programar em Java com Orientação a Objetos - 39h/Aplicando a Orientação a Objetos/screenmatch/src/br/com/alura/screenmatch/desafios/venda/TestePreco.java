package br.com.alura.screenmatch.desafios.venda;

public class TestePreco {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setPreco(100);
        produto.aplicarDesconto(10);
        System.out.println("Preço total dos produtos: " + produto.calculaPrecoTotal(5));

        Servico servico = new Servico();
        servico.setPrecoHora(90);
        servico.aplicarDesconto(20);
        System.out.println("Preço total dos serviços: " +servico.calculaPrecoTotal(200));
    }

}
