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
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("1 - Cadastrar Fruta");
            System.out.println("2 - Listar Frutas");
            System.out.println("3 - Remover Frutas");
            System.out.println("4 - Total de frutas cadastradas");
            System.out.println("0 - Sair");
            System.out.println("Digite a opção: ");
            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o nome de uma fruta: ");
                nome = leitor.next();

                System.out.println("Digite a cor dessa fruta: ");
                cor = leitor.next();

                System.out.println("Digite o preço: ");
                preco = leitor.nextDouble();
                leitor.nextLine();

                Frutas fruta = new Frutas(nome, cor, preco);

                frutas.add(fruta);
            } else if (opcao == 2) {
                for (int i = 0; i < frutas.size(); i++) {
                    System.out.println(i + " - " + frutas.get(i));
                    break;
                }
            } else if (opcao == 3) {
                System.out.println("Digite o nome da fruta que deseja remover: ");
                int posicao = leitor.nextInt();
                frutas.remove(posicao);
            } else if (opcao == 4) {
                System.out.println("Total: " + frutas.size());
            }
        }
        //Exibir todas as frutas na lista

        leitor.close();

    }
}
