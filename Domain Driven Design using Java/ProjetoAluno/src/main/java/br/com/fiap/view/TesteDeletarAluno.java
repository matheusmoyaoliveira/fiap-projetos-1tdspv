package br.com.fiap.view;

import br.com.fiap.dao.AlunoDAO;
import br.com.fiap.model.Aluno;

import javax.swing.*;
import java.sql.SQLException;

public class TesteDeletarAluno {

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        AlunoDAO alunoDAO = new AlunoDAO();

        Aluno objAluno = new Aluno();

        objAluno.setRm(inteiro("RM"));

        System.out.println(alunoDAO.delete(objAluno.getRm()));

    }

}
