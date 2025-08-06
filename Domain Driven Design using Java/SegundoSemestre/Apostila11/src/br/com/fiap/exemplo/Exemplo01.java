package br.com.fiap.exemplo;

import java.util.ArrayList;
import java.util.List;

public class Exemplo01 {

    public static void main(String[] args) {
        //Lista de nome de Frutas

        List<String> frutas = new ArrayList<>();
        frutas.add("Manga");
        frutas.add("Uva");

        //Adicionar uma fruta na segunda posição
        frutas.add(1, "Morango");

        //Remover uma fruta da lista
        frutas.remove(1);

        //Exibir a quantidade de frutas na lista
        System.out.println("Quantidade: " + frutas.size());

        //Exibir o valor da primeira posição da lista
        System.out.println("Primeiro: " + frutas.get(0));

        //Exibir todos os elementos da lista
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("Posição: " + i + " - " + frutas.get(i));
        }
    }

}
