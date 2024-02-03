package com.comsistemas.buscacep;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public record Endereco(String cep, String logradouro, String complemento,
                       String localidade, String uf) {
        public void salvaJson(Endereco endereco) throws IOException {
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .setPrettyPrinting()
                    .create();
            FileWriter writer = new FileWriter(endereco.cep() + ".json");
            writer.write(gson.toJson(endereco));
            writer.close();

        }
}
