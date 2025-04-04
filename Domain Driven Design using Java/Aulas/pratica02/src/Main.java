import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Ler todos os dados
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = leitor.nextLine();

        System.out.println("Digite seu Logradouro: ");
        String logradouro = leitor.nextLine();

        System.out.print("Digite o número da residência: ");
        short numero = leitor.nextShort();
        leitor.nextLine();

        System.out.println("Digite seu Endereço: ");
        String endereco = leitor.nextLine();

        System.out.println("Digite o complemento: ");
        String complemento = leitor.nextLine();

        System.out.println("Digite o CEP: ");
        String cep = leitor.nextLine();

        System.out.println("Digite o nome do Titular da conta: ");
        String titular = leitor.nextLine();

        System.out.println("Digite o Saldo da sua conta: R$ ");
        double saldo = leitor.nextDouble();
        leitor.nextLine();

        ContaCorrente contaCorrente = new ContaCorrente();

        System.out.println("Digite quanto gostaria de depositar: R$ ");
        double novoDeposito = leitor.nextDouble();
        leitor.nextLine();

        contaCorrente.depositar(novoDeposito);

        double valorFinal = saldo + novoDeposito;
        System.out.println("Novo Saldo: R$" + valorFinal);

        System.out.println("Agora, quanto gostaria de retirar da sua conta? R$ ");
        double retirarDeposito = leitor.nextDouble();

        contaCorrente.retirar(retirarDeposito);

        double saldoFinal = valorFinal - retirarDeposito;

        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Complemento: " + complemento);
        System.out.println("CEP: " + cep);
        System.out.println("Titular da Conta: " + titular);
        System.out.println("Saldo Final da Conta: R$ " + saldoFinal);









    }
}
