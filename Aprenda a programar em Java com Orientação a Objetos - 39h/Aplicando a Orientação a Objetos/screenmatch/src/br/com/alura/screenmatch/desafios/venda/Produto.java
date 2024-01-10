package br.com.alura.screenmatch.desafios.venda;

public class Produto implements Vendavel {

    private String nome;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int calculaPrecoTotal(int quantidade) {
        return (int) preco * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        preco -= preco * percentualDesconto / 100;
    }
}
