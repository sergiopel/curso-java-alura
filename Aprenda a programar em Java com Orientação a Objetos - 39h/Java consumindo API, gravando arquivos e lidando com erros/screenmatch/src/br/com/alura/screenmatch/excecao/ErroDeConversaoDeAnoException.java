package br.com.alura.screenmatch.excecao;

// se estender de Throwable, a gente é obrigado a usar o try...catch onde está sendo testado
// se estender de RuntimeException, não há o obrigatoriedade de usar o try... catch
//public class ErroDeConversaoDeAnoException extends Throwable {
public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
