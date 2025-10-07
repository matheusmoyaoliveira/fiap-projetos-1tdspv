import java.util.Scanner;

public class ex001 {

    public static void main(String[] args) {

        //Lendo as informações de nome e nota no teclado
        Scanner leitor = new Scanner(System.in);

        //Ler as notas dos 3 cps
        System.out.println("Nota 1: ");
        float nota1 = leitor.nextFloat();

        System.out.println("Nota 2: ");
        float nota2 = leitor.nextFloat();

        System.out.println("Nota 3: ");
        float nota3 = leitor.nextFloat();

        //Ler a nota do challenge
        System.out.println("Nota do Challenge: ");
        float notach = leitor.nextFloat();

        //Ler a nota da global solution
        System.out.println("Nota do Global Solution: ");
        float notags = leitor.nextFloat();

        //Ler o nome do aluno
        System.out.println("Digite seu nome: ");
        String nome = leitor.next();

        //Caulcular a média do semestre (média aritmética das cps)
        double cptot = (nota1 + nota2 + nota3) / 3;
        double media = notags * 0.6 + notach * 0.2 + cptot * 0.2;

        //Exibir a média
        System.out.println("Aluno(a): " + nome);
        System.out.println("A média é " + media);

    }

}
