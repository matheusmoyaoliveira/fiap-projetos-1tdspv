import java.util.Scanner;

public class TesteEleitores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Pessoa 1
        System.out.println("Digite o nome da primeira pessoa: ");
        String nomePessoa1 = leitor.nextLine();

        System.out.println("Digite a idade da primeira pessoa: ");
        int idadePessoa1 = Integer.parseInt(leitor.nextLine());

        System.out.println("Digite a altura da primeira pessoa: ");
        double alturaPessoa1 = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite o peso da primeira pessoa: ");
        double pesoPessoa1 = Double.parseDouble(leitor.nextLine());

        //Pessoa 2
        System.out.println("Digite o nome da segunda pessoa: ");
        String nomePessoa2 = leitor.nextLine();

        System.out.println("Digite a idade da segunda pessoa: ");
        int idadePessoa2 = Integer.parseInt(leitor.nextLine());

        System.out.println("Digite a altura da segunda pessoa: ");
        double alturaPessoa2 = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite o peso da segunda pessoa: ");
        double pesoPessoa2 = Double.parseDouble(leitor.nextLine());

        //Pessoa 3
        System.out.println("Digite o nome da terceira pessoa: ");
        String nomePessoa3 = leitor.nextLine();

        System.out.println("Digite a idade da terceira pessoa: ");
        int idadePessoa3 = Integer.parseInt(leitor.nextLine());

        System.out.println("Digite a altura da terceira pessoa: ");
        double alturaPessoa3 = Double.parseDouble(leitor.nextLine());

        System.out.println("Digite o peso da terceira pessoa: ");
        double pesoPessoa3 = Double.parseDouble(leitor.nextLine());

        Pessoa pessoa1 = new Pessoa(nomePessoa1, pesoPessoa1, alturaPessoa1, idadePessoa1);
        Pessoa pessoa2 = new Pessoa(nomePessoa2, pesoPessoa2, alturaPessoa2, idadePessoa2);
        Pessoa pessoa3 = new Pessoa(nomePessoa3, pesoPessoa3, alturaPessoa3, idadePessoa3);

        if (pessoa1.getIdade() < 16){
            System.out.println(pessoa1.getNome() + " - Não eleitor");
        } else if (pessoa1.getIdade() >= 18 && pessoa1.getIdade() <= 65){
            System.out.println(pessoa1.getNome() + " - Eleitor obrigatório");
        } else if (pessoa1.getIdade() == 16 || pessoa1.getIdade() == 17 || pessoa1.getIdade() > 65) {
            System.out.println(pessoa1.getNome() + " - Eleitor facultativo");
        }

        if (pessoa2.getIdade() < 16){
            System.out.println(pessoa2.getNome() + " - Não eleitor");
        } else if (pessoa2.getIdade() >= 18 && pessoa2.getIdade() <= 65){
            System.out.println(pessoa2.getNome() + " - Eleitor obrigatório");
        } else if (pessoa2.getIdade() == 16 || pessoa2.getIdade() == 17 || pessoa2.getIdade() > 65) {
            System.out.println(pessoa2.getNome() + " - Eleitor facultativo");
        }

        if (pessoa3.getIdade() < 16){
            System.out.println(pessoa3.getNome() + " - Não eleitor");
        } else if (pessoa3.getIdade() >= 18 && pessoa3.getIdade() <= 65){
            System.out.println(pessoa3.getNome() + " - Eleitor obrigatório");
        } else if (pessoa3.getIdade() == 16 || pessoa3.getIdade() == 17 || pessoa3.getIdade() > 65) {
            System.out.println(pessoa3.getNome() + " - Eleitor facultativo");
        }

    }
}
