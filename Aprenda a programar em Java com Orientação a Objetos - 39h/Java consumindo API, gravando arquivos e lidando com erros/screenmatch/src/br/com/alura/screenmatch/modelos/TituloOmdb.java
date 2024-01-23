package br.com.alura.screenmatch.modelos;

// Essa é uma class especial, criada a partir da versão 17, com estrutura
// simples cuja finalidade é a de traduzir campos e transferir dados
// Então coloco aqui os 3 campos que eu vou usar que vieram do Json
// Por debaixo dos panos já vem implementado o construtor padrão, getters
// and setters, toString
public record TituloOmdb(String title, String year, String runtime) {
}
