package com.comsistemas.buscacep;

public class CepFormatoInvalidoException extends RuntimeException {
    public CepFormatoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
