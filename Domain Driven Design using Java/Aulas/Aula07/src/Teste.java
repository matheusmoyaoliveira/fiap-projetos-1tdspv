import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite seu peso: ");
        double peso = leitor.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = leitor.nextDouble();

        Pessoa pessoa1 = new Pessoa(nome, peso, altura, idade);

        Pessoa pessoa2 = new Pessoa(nome, peso, altura, idade);



        if (pessoa1.getPeso() > pessoa2.getPeso()) {
            System.out.println(pessoa1.getNome() + "é mais pesada");
        } else {
            System.out.println(pessoa2.getNome() + "é mais pesada");
        }

        if (pessoa1.getAltura() > pessoa2.getAltura()) {
            System.out.println(pessoa1.getNome() + "é mais alta");
        } else {
            System.out.println(pessoa2.getNome() + "é mais alta");
        }


    }
}
