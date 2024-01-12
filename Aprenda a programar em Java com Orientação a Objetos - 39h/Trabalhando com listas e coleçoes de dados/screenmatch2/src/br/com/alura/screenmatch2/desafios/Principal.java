package br.com.alura.screenmatch2.desafios;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var pessoa1 = new Pessoa("Sergio", 52); // mais fácil quando tem construtor na classe
        //pessoa1.setNome("Sergio");
        //pessoa1.setIdade(52);
        Pessoa pessoa2 = new Pessoa("Maria", 30);
        var pessoa3 = new Pessoa("João", 62);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista de pessoas: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
        System.out.println("Lista completa de pessoas: ");
        // for-each, lê todos os objetos do array e atribui cada um à variável pessoa e depois imprime
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }

    }

}
