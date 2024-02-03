package com.comsistemas.buscacep;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        var cep = "";

        ConsultaCep consultaCep = new ConsultaCep();

        while(!cep.equalsIgnoreCase("sair")) {
            System.out.println("\nEntre com o Cep a consultar:");
            cep = leitura.next();
            if (cep.equalsIgnoreCase("sair")) {
                break;
            }
            try {
                Endereco address = consultaCep.buscaEndereco(cep);
                System.out.println(address);
                GeraArquivo gera = new GeraArquivo();
                gera.salvaJson(address);
            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
            }
        }


    }
}
