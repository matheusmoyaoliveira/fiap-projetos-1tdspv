package br.com.fiap.model;

public class Frutas {

    private String nome;
    private String cor;
    private double preco;

    public Frutas(String nome, String cor, double preco) {
        this.nome = nome;
        this.cor = cor;
        this.preco = preco;
    }

    public Frutas() {

    }

    @Override
    public String toString() {
        return nome + " | " + cor + " | R$" + preco ;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
