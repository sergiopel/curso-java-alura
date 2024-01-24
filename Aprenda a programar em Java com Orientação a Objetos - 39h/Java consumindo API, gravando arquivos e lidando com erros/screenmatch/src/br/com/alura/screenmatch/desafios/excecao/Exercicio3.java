package br.com.alura.screenmatch.desafios.excecao;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

// consumir uma api do github para obter dados de um usuário
public class Exercicio3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Voce quer obter informações de qual usuário" +
                " do github?");
        String usuario = scan.nextLine();

        String endereco = "https://api.github.com/users/" + usuario;

        //consumir api do github
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("O usuário consultado não existe!");
            }
            String json = response.body();
            System.out.println(json);

        } catch (ErroConsultaGitHubException e) {
            System.out.println("Erro: " + e.getMessage());
        }


    }
}
