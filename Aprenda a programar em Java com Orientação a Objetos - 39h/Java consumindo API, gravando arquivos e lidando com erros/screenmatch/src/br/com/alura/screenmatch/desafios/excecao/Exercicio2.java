package br.com.alura.screenmatch.desafios.excecao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String senha = null;

        System.out.println("Digite a senha do usuário: ");
        try {
            senha = scan.nextLine();
            if (senha.length() < 8) {
                throw new SenhaInvalidaException("A senha deve ter no mínimo 8 caracteres.");
            }
        } catch(SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
