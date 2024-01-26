package br.com.alura.screenmatch.excecao;

public class ErroConsultaFilmeOMDBException extends RuntimeException {
    public ErroConsultaFilmeOMDBException(String mensagem) {
        super(mensagem);
    }
}
