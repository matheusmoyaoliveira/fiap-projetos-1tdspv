package br.com.fiap;

import br.com.fiap.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploRemocao {

    public static void main(String[] args) {
        try {
            //Obter a conexão com banco de dados
            Connection conn = ConnectionFactory.getConnection();
            //Obter um Statement
            Statement stm = conn.createStatement();
            //Executar o comando SQL
            stm.executeUpdate("delete from t_produto where ds_produto = 'Livro de programação'");

            System.out.println("Deletado com sucesso!");

            //Fechar a conexão
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
