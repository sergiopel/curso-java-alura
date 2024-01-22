package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import com.google.gson.Gson;

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

        // Consumo de API da OMDB
        // Usar: HttpClient, HttpRequest, HttpResponse
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);

        // Agora eu vou usar uma biblioteca externa para fazer a desserialização
        // do response, ou seja, pegar o Json obtido e transformá-lo em objeto.
        // Importante saber que estamos fazendo isso de forma manual, sem usar
        // nenhum gerenciador de dependências, como o Maven, por exemplo.
        // Entrar no site mvnrepository.com, procurar pela lib 'Gson' e baixar
        // o arquivo .jar dele.
        // Atribuir esse .jar baixado ao projeto assim:
        // File / Project Structure / Modules / Dependencies/ + / 1-JARs or Directories/
        // Procurar pelo gson-2.10.1.jar baixado.
        // O arquivo .jar contém arquivos .class
        Gson gson = new Gson();
        Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        System.out.println("Título: " + meuTitulo);
        // na linha acima trará null, porque o json trouxe "Title", mas o atributo ma minha
        // classe Titulo se chama nome, o mesmo vale para o "Year", que na minha
        // classe é anoDeLancamento. Então eu preciso colocar uma anotação logo acima do
        // atributo: "SerializeName("Title"), ver classe Titulo
        // Mas essa não é uma solução definitiva, pois hoje eu estou usando
        // a Api do Google Books, mas se eu buscar de outro lugar, pode ser
        // que os nomes Title e Year não sejam iguais, aí dará erro e me
        // forcará a modificar a anotação que eu fiz.
        // O ideal é ficar alterando o mínimo possível.
        // Para isso, posso criar uma outra classe intermediária cuja finalidade
        // é apenas fazer uma tradução de um campo para o outro. Posso criar
        // uma classe record (TituloOmdb), onde eu só preciso declarar o
        // cabeçalho.
    }
}
