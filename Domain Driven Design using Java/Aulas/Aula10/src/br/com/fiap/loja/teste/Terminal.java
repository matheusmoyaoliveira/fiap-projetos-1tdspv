package br.com.fiap.loja.teste;

import br.com.fiap.loja.model.Alimento;
import br.com.fiap.loja.model.Produto;

public class Terminal {

    public static void main(String[] args) {
        //Instanciar um novo produto
        Produto produto = new Produto();
        Alimento alimento = new Alimento();

        //setar o preco
        produto.setPreco(100);
        alimento.setPreco(100);

        //Calcular 10% de desconto e exibir
        System.out.println(produto.calcularDesconto(10));

        //Calcular o desconto padrão
        System.out.println(produto.calcularDesconto());
        System.out.println(alimento.calcularDesconto());
    }
}
