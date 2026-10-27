package com.mycompany.sistemacrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConexao {

    private static final String URL = "jdbc:mysql://localhost:3306/Cadastros?useSSL=false&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String SENHA = "1255";

    // Retorna uma nova conexão com o banco
    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}