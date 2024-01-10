package br.com.alura.screenmatch.desafios.tabuada;

// Classe TabuadaMultiplicacao implementando Tabuada
public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("A tabuada do numero " + numero + " é:");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
