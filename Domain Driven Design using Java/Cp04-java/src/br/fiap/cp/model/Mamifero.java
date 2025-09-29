package br.fiap.cp.model;

public class Mamifero extends Animal {

    private String tipoAlimentacao;

    public Mamifero(String nome, int idade, String especie, String habitat, String tipoAlimentacao) {
        super(nome, idade, especie, habitat);
        setTipoAlimentacao(tipoAlimentacao);
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        if (tipoAlimentacao == null || tipoAlimentacao.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo de alimentação não pode ser vazio");
        } else {
            this.tipoAlimentacao = tipoAlimentacao;
        }

    }

    @Override
    public String emitirSom() {
        return "Rugido";
    }

    @Override
    public double custoDiario() {
        return super.custoDiario() * 1.3;
    }

    @Override
    public String toString() {
        return super.toString() + ", alimentação = " + tipoAlimentacao;
    }
}
