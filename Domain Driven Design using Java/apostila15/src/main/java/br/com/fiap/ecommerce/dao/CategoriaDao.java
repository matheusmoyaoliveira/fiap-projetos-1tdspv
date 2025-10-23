package br.com.fiap.ecommerce.dao;

import br.com.fiap.ecommerce.model.Categoria;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import javax.sql.DataSource;
import java.sql.*;

@ApplicationScoped
public class CategoriaDao {

    @Inject
    private DataSource dataSource;
}
