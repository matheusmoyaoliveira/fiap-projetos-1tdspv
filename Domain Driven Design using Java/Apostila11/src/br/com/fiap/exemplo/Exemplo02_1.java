package br.com.fiap.exemplo;

import br.com.fiap.model.Frutas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exemplo02_1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Criar uma lista de frutas
        String nome;
        String cor;
        double preco;

        List<Frutas> frutas = new ArrayList<>();

        //Pedir para o usuario inserir uma fruta na lista

        //Exibir todas as frutas na lista

        for (Frutas f : frutas) {
            System.out.println("Fruta: " + f.getNome());
            System.out.println("Cor: " + f.getCor());
            System.out.println("Preço: " + f.getPreco());
        }

        System.out.println("Deseja adicionar mais frutas ? (s/n)");
        String opcaoString = leitor.nextLine();

        if (opcaoString.equalsIgnoreCase("s")) {
            System.out.println("Nova fruta: ");
            nome = leitor.next();

            System.out.println("Nova cor: ");
            cor = leitor.next();

            System.out.println("Novo preço: ");
            preco = leitor.nextDouble();
            leitor.nextLine();

            Frutas fruta = new Frutas(nome, cor, preco);

            frutas.add(fruta);
        } else {
            for (Frutas f : frutas) {
                System.out.println("Fruta: " + f.getNome());
                System.out.println("Cor: " + f.getCor());
                System.out.println("Preço: " + f.getPreco());
                System.out.println("Saindo do programa...");
                break;
            }
        }

        leitor.close();

    }
}