import br.com.fiap.banco.model.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instanciar um cliente
        Cliente cliente = new Cliente();
        Scanner leitor = new Scanner(System.in);

        //Colocar um nome e senha para cliente
        System.out.println("Username: ");
        cliente.setUsername(leitor.nextLine());

        System.out.println("Senha: ");
        cliente.setSenha(leitor.nextLine());

        System.out.println("Username: " + cliente.getUsername());
        System.out.println("Senha: "+ cliente.getSenha());

        //Chamar o método para logar
        boolean churros = cliente.logar("Matheus", "525255");
        System.out.println("Logou?: " + churros);
    }
}