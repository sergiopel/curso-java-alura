package br.com.alura.screenmatch.desafios.venda;

public interface Vendavel {
    int calculaPrecoTotal(int quantidade);
    void aplicarDesconto(double percentualDesconto);
}
