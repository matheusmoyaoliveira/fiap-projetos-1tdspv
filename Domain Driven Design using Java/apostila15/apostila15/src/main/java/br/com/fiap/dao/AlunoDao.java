import br.com.fiap.model.Aluno;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.resource.cci.ConnectionFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class AlunoDao {
    @Inject
    DataSource dataSource;
}

public List<Aluno> listar() throws SQLException {
    List<Aluno> lista = new ArrayList<>();
    try (Connection conn = ConnectionFactory.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT id, nome, email FROM aluno")) {
        while (rs.next()) {
            lista.add(new Aluno(rs.getInt("id"), rs.getString("nome"), rs.getString("email")));
        }
    }
    return lista;
}

void main() {
}