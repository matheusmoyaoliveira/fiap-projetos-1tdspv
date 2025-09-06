package br.com.fiap;
import br.com.fiap.factory.ConnectionFactory;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class ExemploAtualizacao {

    public static void main(String[] args) {
        try {
            //Obter a conexão com banco de dados
            Connection conn = ConnectionFactory.getConnection();
            //Obter um Statement
            Statement stm = conn.createStatement();
            //Executar o comando SQL
            stm.executeUpdate("");
            //Fechar a conexão
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
