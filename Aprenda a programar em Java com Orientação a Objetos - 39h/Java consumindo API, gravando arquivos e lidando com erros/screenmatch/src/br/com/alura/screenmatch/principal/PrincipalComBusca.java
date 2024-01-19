package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        // Como já foi visto anteriormente, o var faz uma inferência do tipo da variável,
        // eliminando assim, definir qual é o tipo na linha abaixo. Mas na verdade tanto
        // faz usar o tipo ou o var, veja abaixo:
        //String busca = leitura.nextLine();
        var busca = leitura.nextLine();
        String chave = "f690738f";
        //String endereco = "https://www.omdbapi.com/?t=";
        var endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
