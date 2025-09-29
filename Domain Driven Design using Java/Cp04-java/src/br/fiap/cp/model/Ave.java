package br.fiap.cp.model;

public class Ave extends Animal {

    private String corDasPenas;

    public Ave(String nome, int idade, String especie, String habitat, String corDasPenas) {
        super(nome, idade, especie, habitat);
        setCorDasPenas(corDasPenas);
    }

    public String getCorDasPenas() {
        return corDasPenas;
    }

    public void setCorDasPenas(String corDasPenas) {
        if (corDasPenas == null || corDasPenas.trim().isEmpty()) {
            throw new IllegalArgumentException("Cor das penas não pode ser vazia");
        } else {
            this.corDasPenas = corDasPenas;
        }
    }

    @Override
    public String emitirSom() {
        return "Piu-piu";
    }

    @Override
    public double custoDiario() {
        return super.custoDiario() * 1.1;
    }

    @Override
    public String toString() {
        return super.toString() + ", cor das penas = " + corDasPenas;
    }
}
