package br.com.fiap.exemplo;
import br.com.fiap.model.ContaCorrente;

import java.io.IOException;
import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente();

        int opcao;

       do {
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir saldo");
            System.out.println("0 -  Sair");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao){
                case 1:
                    try {
                        System.out.println("Digite o valor que gostaria de depositar: R$");
                        double valor = leitor.nextDouble();
                        cc.depositarSaldo(valor);

                        System.out.println("Valor depositado com sucesso!");

                        System.out.println("Seu novo saldo depois do depósito é de: R$" + cc.getSaldo());
                    } catch (ArithmeticException e) {
                        System.err.println("Erro: " + e);
                    }

                case 2:
                    try {
                        double valor;
                        double saldo;
                        System.out.println("Digite o valor que gostaria de sacar: R$");
                        valor = leitor.nextDouble();

                        cc.sacarSaldo(valor);

                        System.out.println("Seu novo saldo depois do saque é de: R$" + cc.getSaldo());

                    } catch (ArithmeticException e) {
                        System.err.println("Erro: " + e);
                    }
                case 3:
                    System.out.println("Sald atual: R$" + cc.getSaldo());

                case 4:
                    System.out.println("Finalizando programa...");
                    break;
            }
        } while(opcao != 0);

        //Instanciar a conta corrente


        //Depositar um valor na conta





        //Exibir o saldo


        //Retirar um valor da conta



        //Exibir saldo



    }//main
}//class
