package com.comsistemas.buscacep;

public record Endereco(String cep, String logradouro, String complemento,
                       String localidade, String uf) {
}
