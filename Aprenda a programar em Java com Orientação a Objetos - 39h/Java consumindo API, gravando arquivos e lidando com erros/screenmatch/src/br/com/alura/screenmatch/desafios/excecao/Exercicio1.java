package br.com.alura.screenmatch.desafios.excecao;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = leitura.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = leitura.nextInt();
        try {
            int divisao = primeiroNumero / segundoNumero;
            System.out.println("A divisão do primeiro pelo segundo é: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não permitida.");
        }
    }
}
