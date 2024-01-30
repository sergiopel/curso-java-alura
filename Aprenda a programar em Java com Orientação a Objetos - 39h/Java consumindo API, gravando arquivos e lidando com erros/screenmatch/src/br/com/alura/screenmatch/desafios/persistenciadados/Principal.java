package br.com.alura.screenmatch.desafios.persistenciadados;

import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("arquivo.txt");
            writer.write("Conteúdo a ser gravado no arquivo.");
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro de escrita");
            // poderia ser utilizado na mensagem acima: e.printStackTrace()
        }
    }

}
