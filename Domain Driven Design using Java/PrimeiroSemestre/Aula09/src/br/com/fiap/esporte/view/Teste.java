package br.com.fiap.esporte.view;

import br.com.fiap.esporte.model.Endereco;
import br.com.fiap.esporte.model.PessoaFisica;

public class Teste {
    public static void main(String[] args) {
        //Instanciar uma Pessoa Fisica
        PessoaFisica pessoaFisica = new PessoaFisica("Matheus", "12312312312");
        Endereco endereco = new Endereco();
        //Atribuir valores aos atributos (fixo)


        pessoaFisica.setEmail("matheusmoya@hotmail.com");
        pessoaFisica.setIdade(27);

        pessoaFisica.setAposentado(false);

        endereco.setLogradouro("Av Paulista");
        endereco.setNumero("315");
        pessoaFisica.setEndereco(endereco);

        //Exibir os valores do objeto

        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("Email: " + pessoaFisica.getEmail());
        System.out.println("Idade: " + pessoaFisica.getIdade());
        System.out.println("CPF: " + pessoaFisica.getCpf());
        System.out.println("Aposentado? " + pessoaFisica.isAposentado());
        System.out.println("Endereço: " + pessoaFisica.getEndereco().getLogradouro() + ", " + pessoaFisica.getEndereco().getNumero());



    }
}
