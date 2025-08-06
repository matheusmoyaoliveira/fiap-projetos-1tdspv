package br.com.fiap.exemplo;

import br.com.fiap.model.Frutas;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Criar uma lista de frutas
        String nome;
        String cor;
        double preco;

        List<Frutas> frutas = new ArrayList<>();

        //Pedir para o usuario inserir uma fruta na lista
        System.out.println("Digite o nome de uma fruta: ");
        nome = leitor.next();

        System.out.println("Digite a cor dessa fruta: ");
        cor = leitor.next();

        System.out.println("Digite o preço: ");
        preco = leitor.nextDouble();
        leitor.nextLine();

        Frutas fruta = new Frutas(nome, cor, preco);

        frutas.add(fruta);

        //Exibir todas as frutas na lista

        for (Frutas f : frutas) {
            System.out.println("Fruta: " + f.getNome());
            System.out.println("Cor: " + f.getCor());
            System.out.println("Preço: " + f.getPreco());
        }

        leitor.close();

    }
}
