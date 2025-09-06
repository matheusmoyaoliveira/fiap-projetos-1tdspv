package br.com.fiap;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // registra o driver
            Connection conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm562822", "130997");
            System.out.println("Conectado!");

            // Criar um objeto statemment
            Statement stm = conn.createStatement();

            //Inserir um produto no banco de dados
            stm.executeUpdate("INSERT INTO T_PRODUTO (CD_PRODUTO, NM_PRODUTO, DS_PRODUTO, VL_PRODUTO) " + "values(1, 'Livro', 'Livro de programação', 250.50)" );

            System.out.println("Cadastrado!");

            conn.close(); // fecha a conexão
        } catch (ClassNotFoundException e) {
            System.out.println("O driver JDBC não foi encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar no banco de dados");
            e.printStackTrace();
        }
    }
}