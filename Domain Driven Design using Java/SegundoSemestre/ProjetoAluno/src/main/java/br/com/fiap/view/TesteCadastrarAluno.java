package br.com.fiap.view;

import br.com.fiap.dao.AlunoDAO;
import br.com.fiap.model.Aluno;

import javax.swing.*;
import java.sql.SQLException;

public class TesteCadastrarAluno {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        AlunoDAO alunoDAO = new AlunoDAO();

        Aluno objAluno = new Aluno();

        objAluno.setRm((inteiro("RM: ")));
        objAluno.setNome(texto("Nome: "));
        objAluno.setTurma(texto("Turma: "));
        objAluno.setNota(real("Nota: "));

        System.out.println(alunoDAO.inserir(objAluno));

    }
}
