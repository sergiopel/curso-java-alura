package br.com.alura.screenmatch.desafios2;

import java.util.ArrayList;

public class TestaProduto {
    public static void main(String[] args) {
        double soma = 0;

        Produto produto1 = new Produto("Galaxy S22 Ultra", 3900.1);
        Produto produto2 = new Produto("Galaxy S23 Ultra", 6800.3);
        Produto produto3 = new Produto("Galaxy S24 Ultra", 10000.4);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        for (Produto produto : produtos) {
            soma += produto.getPreco();
        }

        System.out.println("O preço médio dos produtos é: " + soma / produtos.size());
    }
}
