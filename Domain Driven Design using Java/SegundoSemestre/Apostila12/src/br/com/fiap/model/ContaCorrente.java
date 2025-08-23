package br.com.fiap.model;

import java.util.Scanner;

public class ContaCorrente {

    private double saldo;

    //Criar método depositar
    public void depositarSaldo(double valor) {
        if (valor <= 0) {
            throw new ArithmeticException("Valor negativo ou 0 não da para depositar");
        }

        saldo += valor;

    }

    //Criar método sacar
    public void sacarSaldo(double valor){
        if (valor > saldo) {
            throw new ArithmeticException("Saldo insuficiente para saque!");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
