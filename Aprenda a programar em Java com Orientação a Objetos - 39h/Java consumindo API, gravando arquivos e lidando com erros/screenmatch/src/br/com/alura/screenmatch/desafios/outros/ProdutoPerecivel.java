package br.com.alura.screenmatch.desafios.outros;

public class ProdutoPerecivel extends Produto {
    private String dataDeValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataDeValidade) {
        super(nome, preco, quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Quantidade: " + getQuantidade()
                + ", Preço: " + getPreco() + ", Data de validade: " + this.dataDeValidade;
    }

}
