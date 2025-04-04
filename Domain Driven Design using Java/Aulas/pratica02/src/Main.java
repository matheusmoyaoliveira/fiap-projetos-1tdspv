import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Instanciando os métodos
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        ContaCorrente contaCorrente = new ContaCorrente();


        //Ler todos os dados
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        cliente.nome = leitor.nextLine();

        System.out.println("Digite seu CPF: ");
        cliente.cpf = leitor.nextLine();

        System.out.println("Digite seu Logradouro: ");
        endereco.logradouro = leitor.nextLine();

        System.out.print("Digite o número da residência: ");
        endereco.numero = leitor.nextShort();
        leitor.nextLine();

        System.out.println("Digite seu Endereço: ");
        String enderecoCliente = leitor.nextLine();
        cliente.endereco = endereco;

        System.out.println("Digite o complemento: ");
        endereco.complemento = leitor.nextLine();

        System.out.println("Digite o CEP: ");
        endereco.cep = leitor.nextLine();

        System.out.println("Digite o nome do Titular da conta: ");
        String titularConta = leitor.nextLine();
        contaCorrente.titular = cliente;

        System.out.println("Digite o Saldo da sua conta: R$ ");
        contaCorrente.saldo = leitor.nextDouble();
        leitor.nextLine();

        System.out.println("Digite quanto gostaria de depositar: R$ ");
        double novoDeposito = leitor.nextDouble();
        leitor.nextLine();

        contaCorrente.depositar(novoDeposito);

        double valorFinal = contaCorrente.saldo + novoDeposito;
        System.out.println("Novo Saldo: R$" + valorFinal);

        System.out.println("Agora, quanto gostaria de retirar da sua conta? R$ ");
        double retirarDeposito = leitor.nextDouble();

        contaCorrente.retirar(retirarDeposito);

        double saldoFinal = valorFinal - retirarDeposito;

        System.out.println("Nome: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Complemento: " + endereco.complemento);
        System.out.println("CEP: " + endereco.cep);
        System.out.println("Titular da Conta: " + titularConta);
        System.out.println("Saldo Final da Conta: R$ " + saldoFinal);









    }
}
