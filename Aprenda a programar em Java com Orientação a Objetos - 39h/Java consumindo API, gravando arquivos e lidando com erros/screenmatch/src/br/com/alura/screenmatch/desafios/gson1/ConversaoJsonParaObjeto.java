package br.com.alura.screenmatch.desafios.gson1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversaoJsonParaObjeto {
    public static void main(String[] args) {
        String jsonPessoa = """
                {
                    "nome" : "Cido",
                    "cidade" : "Santo André"
                }
                """;
        //Gson gson = new Gson();
        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println("Objeto pessoa: " + pessoa);

    }
}
