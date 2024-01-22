package br.com.alura.screenmatch.desafios.desafios3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TesteDesafio3 {
    public static void main(String[] args) {
        /*
        Crie uma lista de números inteiros e utilize o método Collections.sort
        para ordená-la em ordem crescente. Em seguida, imprima a lista
        ordenada.
        */
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(59);
        listaNumeros.add(100);
        listaNumeros.add(2);
        listaNumeros.add(200);
        listaNumeros.add(17);

        // Lista os números na ordem que foram incluídos
        System.out.println("Lista os números na ordem que foram incluídos:");
        System.out.println(listaNumeros);

        Collections.sort(listaNumeros);
        // Lista os números na ordem numérica
        System.out.println("Lista os números na ordem numérica");
        System.out.println(listaNumeros);

        /*
        Crie uma classe Titulo com um atributo nome do tipo String.
        Implemente a interface Comparable na classe para que seja possível
        ordenar uma lista de objetos Titulo.
         */
        Titulo titulo1 = new Titulo("Thor");
        Titulo titulo2 = new Titulo("Embalos de sábado a noite");
        Titulo titulo3 = new Titulo("O exterminador do futuro");

        List<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);

        System.out.println("Lista os nomes na ordem que foram incluídos:");
        System.out.println(listaTitulos);

        Collections.sort(listaTitulos);
        System.out.println("Lista os na ordem alfabética:");
        System.out.println(listaTitulos);

        /* Instanciando a lista como LinkedList
         Crie uma lista utilizando a interface List e instancie-a
         tanto como ArrayList quanto como LinkedList.
         Adicione elementos e imprima a lista, mostrando que é possível
         trocar facilmente a implementação.
        */
        System.out.println("\nInstanciando a lista como LinkedList");
        List<Titulo> outraListaTitulos = new LinkedList<>();
        outraListaTitulos.add(titulo1);
        outraListaTitulos.add(titulo2);
        outraListaTitulos.add(titulo3);

        System.out.println("Lista os nomes na ordem que foram incluídos:");
        System.out.println(outraListaTitulos);

        Collections.sort(outraListaTitulos);
        System.out.println("Lista os nome na ordem alfabética:");
        System.out.println(outraListaTitulos);

        /*
        Lista polimórfica
         */
        System.out.println("\nLista polimórfica:");
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);

    }
}
