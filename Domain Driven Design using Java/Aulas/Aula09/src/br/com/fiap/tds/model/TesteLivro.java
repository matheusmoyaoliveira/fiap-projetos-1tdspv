package br.com.fiap.tds.model;
import br.com.fiap.tds.model.livro.Editora;
import br.com.fiap.tds.model.livro.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Editora editora = new Editora("Livro Fiap", "Rua da FIAP, 134");
        Livro livro = new Livro(101, "Java para Iniciantes", editora);

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Editora: " + editora.getNome());
    }
}