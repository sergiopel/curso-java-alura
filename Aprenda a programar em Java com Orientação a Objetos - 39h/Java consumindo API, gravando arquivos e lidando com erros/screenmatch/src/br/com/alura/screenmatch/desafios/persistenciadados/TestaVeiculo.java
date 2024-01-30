package br.com.alura.screenmatch.desafios.persistenciadados;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

public class TestaVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Volkswagen", "Fox", "1.6");
        Veiculo veiculo2 = new Veiculo("Volkswagen", "Virtus", "1.0 Tsi");
        Veiculo veiculo3 = new Veiculo("Nissan", "March", "1.6");

        String json = "";

        List<Veiculo> veiculos = new ArrayList<>();
        List<String> veiculosJson = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        veiculos.add(veiculo1);
        veiculos.add(veiculo2);
        veiculos.add(veiculo3);

        System.out.println("Lista de objetos: " + veiculos);

        for (Veiculo veiculo : veiculos) {
            json = gson.toJson(veiculo);
            veiculosJson.add(json);
        }

        System.out.println("Veículos serializados em json: " + veiculosJson);

    }
}
