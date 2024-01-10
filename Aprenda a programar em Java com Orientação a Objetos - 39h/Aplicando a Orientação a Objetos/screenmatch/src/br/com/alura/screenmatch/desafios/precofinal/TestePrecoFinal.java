package br.com.alura.screenmatch.desafios.precofinal;

public class TestePrecoFinal {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setPreco(100);
        exibePrecoFinal(livro);

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPreco(100);
        exibePrecoFinal(produtoFisico);
    }

    public static void exibePrecoFinal(Calculavel prod) {
        System.out.println("Aqui está passando o produto do tipo: " + prod);
        System.out.println("O preço final do produto é: " + prod.calcularPrecoFinal());
    }

}
