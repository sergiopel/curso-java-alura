package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

// A classe Filme, além de estender a superclasse Titulo, também implementa
// a interface Classificavel (assina o "contrato"), tornando obrigatório
// a sobrescrita do método getClassificacao abaixo
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
