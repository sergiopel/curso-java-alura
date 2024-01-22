package br.com.alura.screenmatch.modelos;

// Essa é uma class especial, criada a partir da versão 17, com estrutura
// simples cuja finalidade é a de traduzir campos
// Então coloco aqui os 3 campos que eu vou usar que vieram do Json
public record TituloOmdb(String title, String year, String runtime) {
}
