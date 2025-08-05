package br.com.fiap.empresa.view;

import br.com.fiap.empresa.model.Funcionario;
import br.com.fiap.empresa.model.Profissao;

public class Main {
    public static void main(String[] args) {

        Profissao profissao = new Profissao("Programador");
        Funcionario funcionario = new Funcionario(526973, "Matheus", profissao);

        funcionario.exibirDados("Matheus", 526973, profissao, 2.500);

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Matricula: " + funcionario.getMatricula());
        System.out.println("Profissão: " + profissao.getNome());
        System.out.println("Salario: R$ " + funcionario.getSalario());






    }
}
