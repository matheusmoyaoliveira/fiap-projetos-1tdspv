package br.com.fiap.exemplo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exemplo03 {
    public static void main(String[] args) {
        //Criar um conjunto de placa de carro
        Set<String> placas = new HashSet<>();
        Scanner leitor = new Scanner(System.in);
        //Adicionar placas no conjunto
        System.out.println("Digite sua placa: ");
        String placa1 = leitor.nextLine();
        placas.add(placa1);
        //Adicionar uma placa igual
        placas.add("ABC1F43");

        //Exibir o total de placas
        System.out.println("Total: " + placas.size());
        //Exibir as placas cadastradas
        for (String churros : placas) {
            System.out.println("Placas cadastradas: " + churros);
        }
    }
}
