import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Endereco endereco = new Endereco();
        Cliente cliente = new Cliente();
        ContaCorrente contaCorrente = new ContaCorrente();

        System.out.println("Digite o logradouro do endereco:");
        endereco.logradouro = scanner.nextLine();

        System.out.println("Digite o numero do endereco:");
        endereco.numero = scanner.nextShort();
        scanner.nextLine();

        System.out.println("Digite o complemento do endereco:");
        endereco.complemento = scanner.nextLine();

        System.out.println("Digite o cep do endereco:");
        endereco.cep = scanner.nextLine();

        System.out.println("============== CLIENTE =================");

        System.out.println("Digite o nome do cliente:");
        cliente.nome = scanner.nextLine();

        System.out.println("Digite o cpf do cliente:");
        cliente.cpf = scanner.nextLine();

        cliente.endereco = endereco;

        System.out.println("============= CONTA CORRENTE ============");

        System.out.println("Digite um saldo inicial:");
        contaCorrente.saldo = scanner.nextDouble();

        contaCorrente.titular = cliente;

        System.out.println("Valor a depositar na conta corrente");
        double saldoADepositar = scanner.nextDouble();
        contaCorrente.depositar(saldoADepositar);
        System.out.println("Novo saldo " + contaCorrente.retornarSaldo());

        System.out.println("Valor a retirar da conta corrente");
        double saldoARetirar = scanner.nextDouble();
        contaCorrente.retirar(saldoARetirar);
        System.out.println("Novo saldo " + contaCorrente.retornarSaldo());

        System.out.println("========== DADOS DO CLIENTE ==============");
        System.out.println(cliente.retornarDados());

        System.out.println("========== ENDEREÇO DO CLIENTE ===========");
        System.out.println(cliente.endereco.retornarEndereco());
    }
}