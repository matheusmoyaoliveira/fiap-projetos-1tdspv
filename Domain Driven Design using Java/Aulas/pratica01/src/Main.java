import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Instanciar o aluno (transformar a classe em um objeto)
        Aluno aluno = new Aluno();

        //Ler o nome e as 3 notas do aluno
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno: ");
        aluno.nomeDoAluno = leitor.next() + leitor.nextLine();

        System.out.println(("Digite a nota do CP1: "));
        aluno.cp1 = leitor.nextDouble();

        System.out.println("Digite a nota do CP2: ");
        aluno.cp2 = leitor.nextDouble();

        System.out.println("Digite a nota do CP3: ");
        aluno.cp3 = leitor.nextDouble();

        System.out.println(("Digite a nota do Global Solution: "));
        aluno.gs = leitor.nextDouble();

        System.out.println(("Digite a nota do Challenge: "));
        aluno.challenge = leitor.nextDouble();

        //Chamar os métodos
        double mediaSemestral = aluno.calcularMediaSemestral();
        double mediaCp = aluno.calcularMediaCp();

        System.out.println("Nome do Aluno: " + aluno.nomeDoAluno);
        System.out.println("Nota dos CP's: " + mediaCp);
        System.out.println("Nota do GS: " + aluno.gs);
        System.out.println("Nota do Challenge: " + aluno.challenge);

        System.out.println("Média das notas: " + mediaSemestral);


    }

}
