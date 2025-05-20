package br.com.fiap.loja.model;

import java.time.LocalDate;

public class Alimento extends Produto {
    private LocalDate vencimento;

    @Override //Sobrescrita do método do pai
    public double calcularDesconto() {
        //Calcular um desconto de 15%
        return calcularDesconto(15);

    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }
}
