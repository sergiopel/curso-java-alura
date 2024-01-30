package com.comsistemas.buscacep;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String cep = "";
        String endereco = "";
        String json;

        while (!cep.equalsIgnoreCase("sair")) {
            System.out.println("##################################################");
            System.out.println("#");
            System.out.println("# Entre com o CEP a consultar:");
            System.out.println("#");
            cep = leitura.next();
            if (cep.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.println("##################################################");
            endereco = "https://viacep.com.br/ws/" + cep + "/json/";
            //endereco = "https://viacep.com.br/ws/09750000/json/";
            //System.out.println(endereco);

            // Consumir API de Cep
            // Usar HttpClient, HttpRequest e HttpResponse
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == 400) {
                    throw new CepFormatoInvalidoException("Cep com formato inválido!");
                }
                System.out.println(response.statusCode());
                json = response.body();
                System.out.println(json);

            } catch (CepFormatoInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
