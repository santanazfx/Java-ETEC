package com.mycompany.sistemacrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    // CREATE: insere um novo aluno
    public void inserir(String nome, String email) throws SQLException {
        String sql = "INSERT INTO Alunos (nome, email) VALUES (?, ?)";

        Connection con = TestConexao.conectar();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, nome);
        ps.setString(2, email);
        ps.executeUpdate();

        ps.close();
        con.close();
    }

    // READ: retorna todos os alunos. Cada linha é um array: {id, nome, email}
    public List<Object[]> listar() throws SQLException {
        String sql = "SELECT id, nome, email FROM Alunos ORDER BY id";
        List<Object[]> lista = new ArrayList<>();

        Connection con = TestConexao.conectar();
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Object[] linha = {rs.getInt("id"), rs.getString("nome"), rs.getString("email")};
            lista.add(linha);
        }

        rs.close();
        ps.close();
        con.close();
        return lista;
    }

    // UPDATE: altera nome e email do aluno com esse id
    public void atualizar(int id, String nome, String email) throws SQLException {
        String sql = "UPDATE Alunos SET nome = ?, email = ? WHERE id = ?";

        Connection con = TestConexao.conectar();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, nome);
        ps.setString(2, email);
        ps.setInt(3, id);
        ps.executeUpdate();

        ps.close();
        con.close();
    }

    // DELETE: apaga o aluno com esse id
    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM Alunos WHERE id = ?";

        Connection con = TestConexao.conectar();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();

        ps.close();
        con.close();
    }
}