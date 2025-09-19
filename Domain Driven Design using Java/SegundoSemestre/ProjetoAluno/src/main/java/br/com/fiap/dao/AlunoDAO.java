package br.com.fiap.dao;

import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {

    Connection minhaConexao;

    public AlunoDAO() throws SQLException, ClassNotFoundException {
        this.minhaConexao = new ConnectionFactory().conexao();
    }

    // Insert
    public String inserir(Aluno aluno) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("insert into t_fiap_aluno values (?, ?, ?, ?)");
        stmt.setInt(1, aluno.getRm());
        stmt.setString(2, aluno.getNome());
        stmt.setString(3, aluno.getTurma());
        stmt.setDouble(4, aluno.getNota());

        stmt.execute();
        stmt.close();

        return "Aluno cadastrado com sucesso!";
    }

    // Delete
    public String delete(int rm) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement
                ("Delete from t_fiap_aluno where Rm = ?");
        stmt.setInt(1, rm);

        stmt.execute();
        stmt.close();

        return "Aluno deletado com sucesso!";
    }

}
