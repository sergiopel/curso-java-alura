public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("br.com.alura.screenmatch.modelos.Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022; // padrão camelcase
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Média: " + media);

        String sinopse;
        sinopse = "br.com.alura.screenmatch.modelos.Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);

        // dá pra substituir vários System.out.println por esse formatação chamada
        // Text Block, inserida na versão 15 do Java
        sinopse = """
                br.com.alura.screenmatch.modelos.Filme Top Gun
                br.com.alura.screenmatch.modelos.Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        System.out.println();
        // exemplos de formatação de textos
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        System.out.println();
        // outro exemplo, dentro de um text block:
        String nome2 = "João";
        int aulas = 4;
        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome2, aulas);
        System.out.println(mensagem);

        // convertendo valores (casting explícito, quando precisa usar o cast)
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }
}