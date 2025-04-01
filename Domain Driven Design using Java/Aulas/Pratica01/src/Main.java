import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Ler o nome e as 3 notas do aluno
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno: ");
        String nome = leitor.next();

        System.out.println(("Digite a nota do CP: "));
        double cp = leitor.nextDouble();

        System.out.println(("Digite a nota do Global Solution: "));
        double gs = leitor.nextDouble();

        System.out.println(("Digite a nota do Challenge: "));
        double challenge = leitor.nextDouble();

        Aluno aluno1 = new Aluno();

        aluno1.nomeDoAluno = nome;
        aluno1.cp = cp;
        aluno1.gs = gs;
        aluno1.challenge = challenge;


        System.out.println("Nome do Aluno: " + aluno1.nomeDoAluno);
        System.out.println("Nota do CP: " + aluno1.cp);
        System.out.println("Nota do GS: " + aluno1.gs);
        System.out.println("Nota do Challenge: " + aluno1.challenge);

        aluno1.calcularMedia();

        System.out.println("Média das notas: " + aluno1.media);


    }

}
