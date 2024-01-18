package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        // lembrando que a palavra reservada 'var' substitui o tipo 'Filme'
        // fazendo uma inferência do tipo, então tanto faz colocar o tipo ou o var
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        // coloquei a lista mãe (Titulo), então filmes e série podem ficar na mesma lista
        //ArrayList<Titulo> lista = new ArrayList<>();
        // Substituindo o ArrayList pelo List, pois é recomendável sempre colocar o tipo
        // da interface. ArrayList implementa o List.
        // A gente sempre tenta se referenciar a um objeto da maneira mais genérica possível,
        // ou seja, trabalhar voltado à interface
        // Existem 2 outras interfaces bem importantes também além da List, que são
        // Collection, que é a interface mãe de quase todas as coleções
        //A variável foi declarada como sendo do tipo List, que é a interface,
        // então qualquer implementação dela que seja instanciada terá os mesmos métodos padronizados.
        List<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        lista.add(lost);

        // para cada item da minha 'lista'
        for (Titulo item : lista) {
            // O nome é comum para Filme e Serie
            System.out.println(item.getNome());
            // Agora eu quero imprimir a classificação,
            // mas o método getClassificacao só existe em Filme, e não
            // está na classe mãe Titulo, nem em Serie, então eu não consigo
            // encontrar esse método se eu usasse item.getClassificacao().
            // Mas eu posso usar o cast para dizer que o item é um Filme
            //Filme filme = (Filme) item;
            //System.out.println("Classificação: " + filme.getClassificacao());
            // Mas a solução acima só irá funcionar para os objetos Filme, quando
            // for Serie, vai dar erro de execução, pq Serie não tem getClassificacao,
            // ou seja, Serie não é Filme
            // Então uma solução não muito elegante seria criar um if comparando
            // se o item é um Filme:
            //if (item instanceof Filme) {
            //    Filme filme = (Filme) item;
            //    System.out.println("Classificação: " + filme.getClassificacao());
            //}
            // Simplificando a partir da versão 14, eu posso perguntar se item
            // é um filme e já declarar a variável, eliminando essa linha
            //'Filme file = (Filme) item;'
            if (item instanceof Filme filme) {
                //Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
            // E a partir da versão 17, eu poderia comparar com mais coisas o if acima
            //Ex:
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                //Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

        //Ordenação de listas
        System.out.println("\n*** Ordenação de listas:");
        // Ordenando Strings
        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam Sandler");
        buscaPorArtistas.add("Tom Cruze");
        buscaPorArtistas.add("Brad Pitt");
        buscaPorArtistas.add("Michael J. Fox");
        // Se imprimir a lista sem a ordenação, sempre aparecerá pela
        // ordem de inclusão:
        System.out.println("Imprimindo listas sem ordenação, " +
                "sairá da forma como foi incluída:");
        System.out.println(buscaPorArtistas);

        // Ordenação por ordem alfabética usando Collections:
        System.out.println("\nOrdenando por ordem alfabética:");
        Collections.sort(buscaPorArtistas);
        System.out.println(buscaPorArtistas);

        // Agora eu quero ordenar a minha lista de filmes e séries,
        // mas neste caso não funciona como eu fiz com as strings pq
        // eu preciso definir na classe como eu quero ordenar e
        // por qual atributo. Então na classe Titulo vou precisar
        // implementar a interface Comparable de Titulo e obrigatoriamente
        // implementar o método compareTo. Consultar a classe Titulo.
        System.out.println("\nLista de títulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);

        // Agora se eu quiser que essa mesma lista seja impressa por
        // ordem de anoDeLancamento, se eu implementar a interface
        // Comparable em Titulo, eu vou estragar a comparação anterior
        // por nome, então não posso mais usar a implementação do
        // Comparable em Titulo.
        // Neste caso, eu posso usar o método sort na lista.
        // Esse sort vai pedir uma forma de comparação, usando um
        // comparador chamado 'Comparator'

        // 1o. modo mais antigo:
        // Usar uma classe anônima que implementa a interface Comparator
        // e passá-la como argumento para o método sort da interface List
        /*
        lista.sort(new Comparator<Titulo>() {
            @Override
            public int compare(Titulo t1, Titulo t2) {
                return t1.getAnoDeLancamento() - t2.getAnoDeLancamento();
            }
        });
        */

        // 2o. modo mais antigo:
        // Usar uma expressão lambda que implementa a interface Comparator
        // e passá-la como argumento para o método sort da interface List.
        //lista.sort((t1, t2) -> t1.getAnoDeLancamento() - t2.getAnoDeLancamento());

        // 3o. modo, esse é o mais atual e é o que deve ser utilizado
        // Usar o método estático comparing da interface Comparator que recebe uma expressão lambda
        // que extrai um atributo de um objeto e passá-lo como argumento para o método sort
        // da interface List.
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("\nOrdenando por ano:");
        System.out.println(lista);
    }
}
