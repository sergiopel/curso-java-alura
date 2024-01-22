package br.com.alura.screenmatch.desafios.desafios2;

import java.util.ArrayList;

public class TestaForma {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(4);
        Circulo circulo2 = new Circulo(5);
        Circulo circulo3 = new Circulo(6);
        Quadrado quadrado1 = new Quadrado(7);
        Quadrado quadrado2 = new Quadrado(8);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo1);
        formas.add(circulo2);
        formas.add(circulo3);
        formas.add(quadrado1);
        formas.add(quadrado2);

        for (Forma forma : formas) {
            //System.out.println(forma);
            if (forma instanceof Circulo) {
                System.out.println("Área do círculo: " + forma.calcularArea());
            } else {
                System.out.println("Área do quadrado: " + forma.calcularArea());
            }
        }

    }
}
