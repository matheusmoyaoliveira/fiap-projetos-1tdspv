package br.com.fiap.exemplo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exemplo04 {

    public static void main(String[] args) {
        //Mapa (Chave e Valor)
        Map<String, String> paises = new HashMap<>();

        //Adicionar 4 paises (chave é o pais, valores é a capital)
        paises.put("Brasil", "Brasilia");
        paises.put("Canadá", "Otava");
        paises.put("Espanha", "Madrid");
        paises.put("Portugal", "Lisboa");

        //Exibir a quantidade de valores no mapa
        System.out.println("Total: " + paises.size());

        //Exibir todas as chaves e valores
        Set<String> chaves = paises.keySet();
        for (String chave : chaves) {
            System.out.println("A capital do(a) " + chave + " é " + paises.get(chave));
        }
    }
}
