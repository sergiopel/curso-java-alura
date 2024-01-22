package br.com.alura.screenmatch.desafios.desafios2;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Percorrendo");
        strings.add("o");
        strings.add("ArrayList");

        // com foreach tradicional
        System.out.println("\nForeach na forma tradicional:");
        for (String string : strings) {
            System.out.println(string);
        }

        // foreach com expressão lambda
        System.out.println("\nForeach com expressão lambda:");
        strings.forEach(string -> System.out.println(string));

        // foreach com a forma reduzida da expressão lambda, utilizando
        // o recurso chamado Method Reference
        System.out.println("\nForeach utilizando Method Reference:");
        strings.forEach(System.out::println);

    }
}
