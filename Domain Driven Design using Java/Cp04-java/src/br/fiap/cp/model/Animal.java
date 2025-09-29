package br.fiap.cp.model;

public abstract class Animal {
    private int id;
    private String nome;
    private int idade = 0;
    private String especie;
    private String habitat;

    public Animal(String nome, int idade, String especie, String habitat) {
        setNome(nome);
        setIdade(idade);
        setEspecie(especie);
        setHabitat(habitat);
    }

    @Override
    public String toString() {
        return "#" + id + " - " + nome + " (" + especie + "), idade = " + idade + ", habitat = " + habitat;
    }

    public abstract String emitirSom();

    public double custoDiario() {
        return 50.0;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Animais não têm idade negativa!");
        } else {
            this.idade = idade;
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat == null || habitat.trim().isEmpty()) {
            throw new IllegalArgumentException("Habitat não pode ser vazio.");
        } else {
            this.habitat = habitat;
        }
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.trim().isEmpty()) {
            throw new IllegalArgumentException("Espécie não pode ser vazia.");
        } else {
            this.especie = especie;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        } else {
            this.nome = nome;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }
}
