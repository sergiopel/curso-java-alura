package br.com.alura.screenmatch2.desafios;

import java.util.ArrayList;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Régua", 10, 20);
        //produto1.setNome("Régua");
        //produto1.setPreco(10);
        //produto1.setQuantidade(20);

        Produto produto2 = new Produto("Caneta", 25.45, 13);
        //produto2.setNome("Caneta");
        //produto2.setPreco(25.45);
        //produto2.setQuantidade(13);

        Produto produto3 = new Produto("Lapiseira", 41.7, 5);
        //produto3.setNome("Lapiseira");
        //produto3.setPreco(41.7);
        //produto3.setQuantidade(5);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista de produtos: " + listaDeProdutos.size());
        System.out.println("Segundo produto da lista é: " + listaDeProdutos.get(1).getNome());

        System.out.println("Lista de produtos usando toString: " + listaDeProdutos);
        System.out.println("Listando objeto produto3: " + produto3);

        System.out.println("Listando produtos usando o foreach");
        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }

        System.out.println("Criando objeto do ProdutoPerecivel:");
        var produtoPerecivel = new ProdutoPerecivel("Bolacha", 3.45, 5, "2024-05-10");
        System.out.println(produtoPerecivel);

    }
}
