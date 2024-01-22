package br.com.alura.screenmatch.desafios.consumoapi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

// Consumo de API do Google Books
public class ConsumoGoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o livro a consultar: ");
        String livro = leitura.nextLine();
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + livro;

        //HttpClient
        HttpClient client = HttpClient.newHttpClient();

        //HttpRequest
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

        //HttpResponse
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Lista as informações do livro
        System.out.println(response.body());

    }

}
