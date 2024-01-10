package br.com.alura.screenmatch.desafios.precofinal;

public class ProdutoFisico extends Produto implements Calculavel {

    @Override
    public double calcularPrecoFinal() {
        double taxa = 0.2;
        double precoFinal = getPreco() + getPreco() * taxa;
        return precoFinal;
    }
}
