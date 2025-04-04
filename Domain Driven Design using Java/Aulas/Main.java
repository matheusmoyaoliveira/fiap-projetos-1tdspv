import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Ler todos os dados
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String nome = leitor.next();

        System.out.println("Digite seu CPF: ");
        String cpf = leitor.next();

        System.out.println("Digite seu Logradouro ");
        String logradouro = leitor.next();

        System.out.println("Digite seu Endereço: ");
        String endereco = leitor.next();

        System.out.println("Digite o número da residência: ");
        short numero = leitor.nextShort();

        System.out.println("Digite o complemento: ");
        String complemento = leitor.next();

        System.out.println("Digite o CEP: ");
        String cep = leitor.next();

        System.out.println("Digite o nome do Titular da conta: ");
        String titular = leitor.next();

        System.out.println("Digite o Saldo da sua conta: R$ ");
        double saldo = leitor.nextDouble();

        System.out.println("Digite quanto gostaria de depositar: R$ ");
        double novoSaldo = leitor.nextDouble();


        System.out.println("Novo Saldo: R$" + novoSaldo);







    }
}
