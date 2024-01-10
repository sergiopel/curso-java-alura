package br.com.alura.screenmatch.desafios.precofinal;

public class Livro extends Produto implements Calculavel {
    private String autor;

    @Override
    public double calcularPrecoFinal() {
        double desconto = 0.1;
        double precoFinal = getPreco() - getPreco() * desconto;
        return precoFinal;
    }
}
