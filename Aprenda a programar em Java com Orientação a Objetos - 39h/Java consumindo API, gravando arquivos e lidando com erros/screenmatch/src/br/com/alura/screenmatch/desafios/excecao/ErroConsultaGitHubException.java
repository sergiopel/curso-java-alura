package br.com.alura.screenmatch.desafios.excecao;

public class ErroConsultaGitHubException extends RuntimeException {
    String mensagem;

    public ErroConsultaGitHubException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }

}
