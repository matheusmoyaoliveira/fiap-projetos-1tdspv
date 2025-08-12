package praticas;

import java.util.*;

public class Pratica01 {
    public static void main(String[] args) {

        double somaNotas = 0;
        int somaIdades = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;

        List<Aluno> aluno = new ArrayList<>();


        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos alunos deseja cadastrar? ");
        int qtd = leitor.nextInt();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Nome do aluno: ");
            String nome = leitor.next();

            System.out.println("Idade do aluno: ");
            int idade = leitor.nextInt();

            System.out.println("Nota do aluno: ");
            double nota = leitor.nextDouble();

            Aluno novoAluno = new Aluno(nome, idade, nota);

            aluno.add(novoAluno);
        }

        for (Aluno a : aluno) {
            somaNotas += a.getNota();
            somaIdades += a.getIdade();

            if (a.getIdade() > maiorIdade) {
                maiorIdade = a.getIdade();
            }
            if (a.getIdade() < menorIdade) {
                menorIdade = a.getIdade();
            }
        }

        double mediaNotas = somaNotas / aluno.size();
        double mediaIdades = (double) somaIdades / aluno.size();

        System.out.println("Total: " + aluno.size());
        System.out.println("Média das notas: " + mediaNotas);
        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
    }
}
