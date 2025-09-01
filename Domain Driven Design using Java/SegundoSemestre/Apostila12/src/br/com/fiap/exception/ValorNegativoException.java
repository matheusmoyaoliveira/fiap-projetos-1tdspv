package br.com.fiap.exception;

public class ValorNegativoException extends Exception{

    public ValorNegativoException(String mensagem) {
        super(mensagem);
    }

    public ValorNegativoException() {
        super("Valor não poe ser negativo");
    }

}
