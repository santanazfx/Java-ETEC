package com.mycompany.sistemacrud;
import java.sql.Connection;
import java.sql.SQLException;

public class SistemaCRUD2 {

    public static void main(String[] args) {
        System.out.println("Tentando conectar ao banco");
        
        try (Connection conexao = TestConexao.conectar()){
            if(conexao != null){
                System.out.println("Suceso!");
                }
        } catch (SQLException e){
            System.out.println("Erro ao fechar ou usar a conexao");
        }
        
        TelaAluno tela = new TelaAluno();
        tela.setVisible(true);
    }
}
