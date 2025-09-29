package br.fiap.cp.model;

public class Reptil extends Animal {

    private String tipoEscamas;
    private boolean venenoso;

    public Reptil(String nome, int idade, String especie, String habitat, String tipoEscamas, boolean venenoso) {
        super(nome, idade, especie, habitat);
        setTipoEscamas(tipoEscamas);
        this.venenoso = venenoso;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        if (tipoEscamas == null || tipoEscamas.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo de escamas não pode ser vazia");
        } else {
            this.tipoEscamas = tipoEscamas;
        }
    }

    @Override
    public String emitirSom() {
        return "Ssshhh";
    }

    @Override
    public double custoDiario() {
        return super.custoDiario() * 0.9;
    }

    @Override
    public String toString() {
        return super.toString() + ", tipo de escamas = " + tipoEscamas + ", venonoso = " + (venenoso ? "Sim" : "Não");
    }
}
