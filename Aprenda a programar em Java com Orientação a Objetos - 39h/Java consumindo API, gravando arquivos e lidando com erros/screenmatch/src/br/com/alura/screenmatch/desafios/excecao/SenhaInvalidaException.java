package br.com.alura.screenmatch.desafios.excecao;

public class SenhaInvalidaException extends RuntimeException {
    String mensagem;

    public SenhaInvalidaException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
