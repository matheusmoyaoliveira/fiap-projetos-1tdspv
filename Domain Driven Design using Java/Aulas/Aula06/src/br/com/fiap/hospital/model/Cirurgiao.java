package br.com.fiap.hospital.model;

public class Cirurgiao {

    private String nome;
    private int crm;
    private boolean ativo;

    public Cirurgiao(String nome, int crm, boolean ativo) {
        this.nome = nome;
        this.crm = crm;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
