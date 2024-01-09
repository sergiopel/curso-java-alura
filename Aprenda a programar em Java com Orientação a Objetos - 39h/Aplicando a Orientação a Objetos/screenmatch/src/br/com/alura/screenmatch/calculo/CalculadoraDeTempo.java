package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui (Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    // sobrecarga de método, tempo o mesmo nome, mas recebendo outro argumento
//    public void inclui (Serie s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

// Comentei acima porque apesar de funcionar, imagine se houvesse outros tipos
// além do Filme e Série, como Desenho, Animes, Música, etc., então para cada tipo eu teria
// que incluir uma nova sobrecarga do método "inclui" e isso não é uma boa prática, ficar
// repetindo código.
// Poderíamos simplesmente usar como argumento a classe mãe (superclasse), já que Serie é um Titulo
// e Filme também é um Titulo, então o método inclui passa a receber Titulo.
    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
