package br.com.alura.screenmatch.desafios.persistenciadados;

public class Titulo {
    private String nome;
    private int anoDoTitulo;
    private int duracaoDoTitulo;
    private String generoDoTitulo;

    public Titulo(String nome, int anoDoTitulo, int duracaoDoTitulo, String generoDoTitulo) {
        this.nome = nome;
        this.anoDoTitulo = anoDoTitulo;
        this.duracaoDoTitulo = duracaoDoTitulo;
        this.generoDoTitulo = generoDoTitulo;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDoTitulo() {
        return anoDoTitulo;
    }

    public int getDuracaoDoTitulo() {
        return duracaoDoTitulo;
    }

    public String getGeneroDoTitulo() {
        return generoDoTitulo;
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + nome + '\'' +
                ", anoDoTitulo=" + anoDoTitulo +
                ", duracaoDoTitulo=" + duracaoDoTitulo +
                ", generoDoTitulo='" + generoDoTitulo + '\'' +
                '}';
    }
}
