import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/*
Por que o método buscaEndereco usa o tipo Endereco, que é uma classe record?
Uma classe record é um tipo especial de classe que serve para armazenar dados
imutáveis de forma simples e transparente. Ela é uma classe final (não pode
ser estendida) e tem todos os seus campos também finais.
Ela também tem os métodos equals, hashCode e toString gerados automaticamente
pelo compilador, assim como um construtor público que recebe todos os campos
como argumentos. Além disso, ela tem um método acessor público para cada campo,
com o mesmo nome e tipo do campo.
A classe Endereco é uma record que tem cinco campos: cep, logradouro,
complemento, localidade e uf. Esses campos representam as informações de um
endereço obtido a partir de um serviço web.
O método buscaEndereco da classe ConsultaCep recebe um cep como argumento e
retorna um objeto do tipo Endereco com os dados correspondentes.
O motivo pelo qual o método buscaEndereco usa o tipo Endereco é que ele é um
tipo adequado para representar um endereço como um conjunto de dados imutáveis.
Usando uma classe record, você evita ter que escrever código repetitivo para
definir os campos, o construtor, os métodos acessores e os métodos equals,
hashCode e toString. Você também garante que o objeto Endereco não será
modificado depois de criado, o que evita inconsistências e erros.
Portanto, usar uma classe record como Endereco é uma forma conveniente e segura
de trabalhar com dados imutáveis em Java.
 */
public class ConsultaCep {

    public Endereco buscaEndereco(String cep) {
        /*
        As duas linhas abaixo são formas diferentes de representar um endereço
        na internet. A primeira usa a classe String, que é uma sequência de
        caracteres. A segunda usa a classe URI, que é um identificador de
        recursos uniforme.
        A diferença entre String e URI é que a URI tem uma estrutura definida,
        que segue o formato:
         esquema:[//autoridade][/caminho][?consulta][#fragmento].
        Cada parte da URI tem um significado específico e pode ser acessada
        por métodos da classe URI. Por exemplo, você pode obter o esquema da URI
        com o método getScheme().
        A classe String, por outro lado, não tem essa estrutura e é apenas um
        texto. Você não pode acessar as partes da String como se fossem uma URI,
        a não ser que você use algum método de manipulação de texto, como
        substring() ou split().
        Uma vantagem de usar a classe URI é que ela valida o formato da URI e
        lança uma exceção se ela for inválida.
        A classe String não faz essa validação e pode conter qualquer texto,
        mesmo que não seja uma URI válida.
        Outra vantagem de usar a classe URI é que ela facilita a conversão para
        outras classes relacionadas, como URL ou URN. A classe URL representa
        um localizador de recursos uniforme, que é um tipo de URI que indica
        onde um recurso está disponível e como acessá-lo.
        A classe URN representa um nome de recurso uniforme, que é um tipo de
        URI que identifica um recurso por um nome único em um determinado espaço
        de nomes.
        Para converter uma URI em uma URL ou URN, você pode usar os métodos
        toURL() ou toURN(), respectivamente.
        Para converter uma String em uma URL ou URN, você precisa criar uma URI
        primeiro e depois usar esses métodos.
         */
        //String endereco = "https://viacep.com.br/ws/" + cep + "/json/";
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não consegui obter o endereço a partir desse CEP");
        }

        return new Gson().fromJson(response.body(), Endereco.class);
    }

}
