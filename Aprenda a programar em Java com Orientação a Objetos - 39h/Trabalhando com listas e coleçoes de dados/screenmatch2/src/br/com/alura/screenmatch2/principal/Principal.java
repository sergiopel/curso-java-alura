package br.com.alura.screenmatch2.principal;

import br.com.alura.screenmatch2.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch2.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch2.modelos.Episodio;
import br.com.alura.screenmatch2.modelos.Filme;
import br.com.alura.screenmatch2.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        //Filme filmeDoPaulo = new Filme();
        // Nessa criação de objeto acima, eu posso substituir o tipo Filme pela palavra
        // reservada 'var' que faz uma inferência do tipo declarado, ou seja, ela faz
        // uma dedução que o tipo é Filme, de acordo com a criação do objeto 'new Filme()'
        var filmeDoPaulo = new Filme();
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        /*
        Objetivo agora é criar uma lista dos filmes criados, desses objetos
        Trabalharemos com a classe ArrayList
         */
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        // Pega o tamanho da lista, ou seja, a quantidade de filmes armazenados
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        // Imprimir o nome do primeiro filme, neste caso irá pegar a posição 0 da lista
        // e depois o atributo nome do objeto.
        System.out.println("Nome do primeiro filme: " + listaDeFilmes.get(0).getNome());

        // Consultar Java Doc no google para aprender mais
        System.out.println(listaDeFilmes);
        // o resultado acima será:
        // [br.com.alura.screenmatch2.modelos.Filme@7530d0a, br.com.alura.screenmatch2.modelos.Filme@34c45dca, br.com.alura.screenmatch2.modelos.Filme@52cc8049]
        // O pacote java.lang é o único pacote que não precisamos dar import
        // Todas as classes, implicitamente, dão extend em Object, estendem Object por padrão.
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());



    }
}
