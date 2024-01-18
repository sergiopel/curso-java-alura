package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListaTeste {
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

        // coloquei a lista mãe, então filmes e série podem ficar na mesma lista
        ArrayList<Titulo> lista = new ArrayList<>();
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
            //System.out.println(filme);
            //System.out.println("Classificação: " + filme.getClassificacao());
            // Mas a solução acima só irá funcionar para os objetos Filme, quando
            // for Serie, vai dar erro de execução, pq Serie não tem getClassificacao,
            // ou seja, Serie não é Filme
            // Então uma solução não muito elegante seria criar um if comparando
            // se o item é um Filme:
            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
            // Simplificando a partir da versão 14, eu posso perguntar se item
            // é um filme e já declarar a variável, eliminando essa linha
            //'Filme file = (Filme) item;'

            /*
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
            */


        }

    }
}
