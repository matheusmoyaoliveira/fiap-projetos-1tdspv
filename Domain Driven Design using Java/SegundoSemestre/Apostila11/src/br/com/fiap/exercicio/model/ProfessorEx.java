package br.com.fiap.exercicio.model;

import java.util.*;

public class ProfessorEx {

    public static void main(String[] args) {
        //Criar um mapa de aluno
        Map<Integer, Aluno> mapaAluno = new HashMap<>();

        Scanner leitor = new Scanner(System.in);

        do {
            //Ler os dados dos alunos
            System.out.println("Digite o RM do aluno:");
            int rm = leitor.nextInt();

            System.out.println("Digite o nome do aluno");
            String nome = leitor.next() + leitor.nextLine();

            System.out.println("Digite a idade do aluno");
            int idade = leitor.nextInt();

            System.out.println("Digite a nota 1 do aluno");
            double nota1 = leitor.nextDouble();

            System.out.println("Digite a nota 2 do aluno");
            double nota2 = leitor.nextDouble();

            //Criar um aluno
            Aluno aluno = new Aluno(rm, nome, idade, nota1, nota2);

            //Adicionar no mapa o aluno
            mapaAluno.put(rm, aluno);

            //Perguntar se deseja adicionar mais alunos no mapa
            System.out.println("Deseja cadastrar mais aluno? S-Sim N-Não");
        } while(!leitor.next().equalsIgnoreCase("n"));

        //Recuperar todos os alunos (valores do mapa)
        List<Aluno> alunos = new ArrayList<>(mapaAluno.values().stream().toList());

        //Exibir todos os alunos cadastrados
        for (Aluno a : alunos){
            System.out.println(a); //Na classe Aluno? implementar o toString()
        }

        //Exibir o total de alunos
        System.out.println("Total de alunos é: " + alunos.size());

        int somaIdades = 0;
        int somaNotas = 0;
        int maiorIdade = 0;
        int menorIdade = 0;
        for (Aluno a : alunos){
            somaIdades += a.getIdade();
            somaNotas += a.getNota1() + a.getNota2();
            if (a.getIdade() > maiorIdade)
                maiorIdade = a.getIdade();
            if (a.getIdade() < menorIdade || menorIdade == 0)
                menorIdade = a.getIdade();
        }

        //Exibir o aluno com maior e menor idade:
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);

        //Exibir a média de notas
        System.out.println("Média de notas dos alunos: " + somaNotas/ (alunos.size()*2));

        //Exibir a média de idade
        System.out.println("Média de idade dos alunos: " + somaIdades/ alunos.size());

        int opcao;
        do {
            System.out.println("Digite a opção: \n1-Exibir nomes e médias " +
                    "\n2-Alunos com médias maiores que 6" +
                    "\n3-Alunos com mais de 30 anos \n4-Excluir alunos media < 3\n0-Sair");
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    for(Aluno churros : alunos) {
                        double media = churros.getNota1() + churros.getNota2() / 2;
                        System.out.println(churros.getNome() + " " + media);
                    }
                    break;
                case 2:
                    for (Aluno churros : alunos) {
                        double media = churros.getNota1() + churros.getNota2() / 2;
                        if (media > 6) {
                            System.out.println(churros);
                        }
                    }
                    break;
                case 3:
                    for (Aluno churros : alunos) {
                        double maior = churros.getIdade();
                        if (maior > 30) {
                            System.out.println(churros.getNome() + " " + maior);
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < alunos.size(); i++) {
                        double media = (alunos.get(i).getNota1() + alunos.get(i).getNota2()) / 2;
                        if (media < 3) {
                            alunos.remove(alunos.get(i));
                            System.out.println("Aluno " + alunos.get(i) + " removido");
                        }
                    }

                    break;
            }
        } while (opcao != 0);

    }//main
}//class