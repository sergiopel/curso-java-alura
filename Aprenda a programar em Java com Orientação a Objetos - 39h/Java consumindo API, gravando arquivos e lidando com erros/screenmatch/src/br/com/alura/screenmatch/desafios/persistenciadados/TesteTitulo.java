package br.com.alura.screenmatch.desafios.persistenciadados;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TesteTitulo {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("E.T", 1982, 115, "Ficção" );
        String json = "";
        System.out.println("Objeto: " + titulo);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        json = gson.toJson(titulo);
        System.out.println("Em json: " + json);
    }
}
