package br.com.fiap.exercicio.model;

public class Carro {

    //Atributos
    private int quantidadePortas;
    private String placa;
    private float motor = 1;

    //Getters e Setters = Alt + Insert

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }
}
