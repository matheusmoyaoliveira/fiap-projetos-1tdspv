package br.com.fiap;

import br.com.fiap.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploPesquisa {

    public static void main(String[] args) {
        try {
            //Obter a conexão com banco de dados
            Connection conn = ConnectionFactory.getConnection();
            //Obter um Statement
            Statement stm = conn.createStatement();
            //Executar o comando SQL
            ResultSet resultSet = stm.executeQuery("select * from tb_aluno");

            //Recuperar os dados do banco para exibir

            while (resultSet.next()) {

                Integer id = resultSet.getInt("id");
                Integer rm = resultSet.getInt("rm");
                String nome = resultSet.getString("nome");
                boolean ativo = resultSet.getBoolean("ativo");
                double nota1 = resultSet.getDouble("nota1");
                double nota2 = resultSet.getDouble("nota2");

                System.out.println(id + " " + rm + " " + nome + " " + ativo + " " + nota1 + " " + nota2);

            }

            //Fechar a conexão
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
