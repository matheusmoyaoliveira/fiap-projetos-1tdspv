package br.com.fiap;
import java.sql.*;

public class ExemploCadastro {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // registra o driver
            Connection conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm562822", "130997");
            System.out.println("Conectado!");

            // Criar um objeto statemment
            Statement stm = conn.createStatement();

            //Inserir um produto no banco de dados
            String sqlCreate = "create table tb_aluno " +
                          "(id int primary key not null, " +
                          "rm int not null, " +
                          "nome varchar2(100) not null, " +
                          "ativo number(1) not null, " +
                          "nota1 number(3,1) not null, " +
                          "nota2 number(3,1) not null)";

            String sqlInsert1 = "insert into tb_aluno (id, rm, nome, ativo, nota1, nota2) " +
                    "values(1, 562822, 'Matheus Moya de Oliveira', 1, 10.0, 9.0)";

            stm.executeUpdate(sqlInsert1);

            System.out.println("Tabela criada!");

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