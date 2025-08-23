package br.com.fiap.exemplo;

import javax.lang.model.element.ModuleElement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {

        //Ler dois numeros
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite um número: ");
            int n1 = leitor.nextInt();

            System.out.println("Digite o segundo número: ");
            int n2 = leitor.nextInt();

            //Dividir um numero pelo outro

            int divisao = n1 / n2;

            //Exibir o resultado da divisao

            System.out.println("RESULTADO: " + divisao);

        } catch (InputMismatchException e) {
            //Tratamento da exception
            System.err.println("Digite um valor valido da proxima vez...");
        } catch (ArithmeticException e) {
            System.err.println("Todo numero divido por 0 é 0...");
        } finally {
            System.out.println("Trecho de código que sempre executa");
        }
    }
}
