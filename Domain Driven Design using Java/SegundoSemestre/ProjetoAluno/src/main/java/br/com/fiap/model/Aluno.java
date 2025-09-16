package br.com.fiap.model;

public class Aluno {
    private int rm;
    private String nome;
    private String turma;
    private double nota;

    public Aluno(int rm, String nome, String turma, double nota) {
        this.rm = rm;
        this.nome = nome;
        this.turma = turma;
        this.nota = nota;
    }

    public Aluno() {
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "rm=" + rm +
                ", nome='" + nome + '\'' +
                ", turma='" + turma + '\'' +
                ", nota=" + nota +
                '}';
    }
}
