package br.com.fiap.string.teste;

public class Teste1 {
    public static void main(String[] args) {
        //Declarar uma String
        String nome = "Churros\nclassico";
        double preco = 15;
        //Concatenação de String ou outro tipo numérico
        String produto = nome + "," + "\nR$ " + preco;
        System.out.println(produto);
    }
}
