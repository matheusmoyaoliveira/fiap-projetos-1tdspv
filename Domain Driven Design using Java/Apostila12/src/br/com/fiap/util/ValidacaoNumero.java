package br.com.fiap.util;

import br.com.fiap.exception.SaldoInsuficienteException;
import br.com.fiap.exception.ValorNegativoException;

public class ValidacaoNumero {

    public static void validarMaiorQueZero(double valor) throws ValorNegativoException {
        if (valor <= 0)
            throw new ValorNegativoException();
    }

    public static void validarMaiorOuIgualAZero(double valor) throws SaldoInsuficienteException {
        if (valor < 0)
            throw new SaldoInsuficienteException("O valor deve ser maior do que zero");
    }

}