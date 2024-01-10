package br.com.alura.screenmatch.desafios.venda;

public class Servico implements Vendavel {

    private String descricao;
    private double precoHora;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    @Override
    public int calculaPrecoTotal(int quantidade) {
        return (int) precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * percentualDesconto / 100;
    }
}
