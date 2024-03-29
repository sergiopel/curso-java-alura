package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.desafios.excecao.ErroConsultaGitHubException;
import br.com.alura.screenmatch.excecao.ErroConsultaFilmeOMDBException;
import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import javax.net.ssl.SSLHandshakeException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";

        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Digite um filme para busca: ");
            // Como já foi visto anteriormente, o var faz uma inferência do tipo da variável,
            // eliminando assim, definir qual é o tipo na linha abaixo. Mas na verdade tanto
            // faz usar o tipo ou o var, veja abaixo:
            //String busca = leitura.nextLine();
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String chave = "f690738f";
            //String endereco = "https://www.omdbapi.com/?t=";
            var endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=" + chave;

            // Consumo de API da OMDB
            // Usar: HttpClient, HttpRequest, HttpResponse
            try {
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
                // Como pelas boas práticas os parÂmetros da classe TituloOmbd são
                // minúsculos, mas pode vir títulos de campos em maiúsculo no Json,
                // ignoramos a linha abaixo e criamos outra no lugar:
                //Gson gson = new Gson();



                // Converter a string JSON em um objeto JsonObject
                JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
                // Pegar o valor da chave Response
                String response2 = jsonObject.get("Response").getAsString();
                // Verificar se o valor é igual a "False"
                if (response2.equals("False")) {
                    throw new ErroConsultaFilmeOMDBException("Filme não encontrado!");
                }


                //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
                // Agora usando meuTituloOmdb:
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println("Título: " + meuTituloOmdb);
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
                //try {
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Título já convertido:");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);

                //Escrever em arquivo:
                //FileWriter escrita = new FileWriter("filmes.txt");
                //escrita.write(meuTitulo.toString());
                //escrita.close();

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            } catch (SSLHandshakeException e) {
                System.out.println("Erro: Problema de certificado no servidor. Nessa internet não funciona.");
            } catch (ErroConsultaFilmeOMDBException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(titulos);

        // passar os objetos para json
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();

        System.out.println("Programa finalizou corretamente!");

    }
}
